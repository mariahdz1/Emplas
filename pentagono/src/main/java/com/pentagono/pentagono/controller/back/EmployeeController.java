package com.pentagono.pentagono.controller.back;

import ch.qos.logback.core.encoder.Encoder;
import com.pentagono.pentagono.dto.EmployeeDTO;
import com.pentagono.pentagono.exceptions.ModelNotFoundException;
import com.pentagono.pentagono.model.Employee;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.service.IEmployeeService;
import com.pentagono.pentagono.service.IEnterpriseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    private IEnterpriseService iEnterpriseService;

    @Autowired
    @Qualifier("employeeMapper")
    private ModelMapper mapper;

    @GetMapping ("/VerEmpleados")
    public String viewEmpleados(Model model, @ModelAttribute("mensaje") String mensaje){
        List<Employee> listaEmpleados=iEmployeeService.getAllEmployees();
        model.addAttribute("emplelist",listaEmpleados);
        model.addAttribute("mensaje",mensaje);
        return "see_employee";
    }

    @GetMapping("/AgregarEmpleado")
    public String nuevoEmpleado(Model model, @ModelAttribute("mensaje") String mensaje){
        Employee empl= new Employee();
        model.addAttribute("empl",empl);
        model.addAttribute("mensaje",mensaje);
        List<Enterprise> listaEmpresas= iEnterpriseService.getAllEnterprises();
        model.addAttribute("emprelist",listaEmpresas);
        return "new_employee";
    }

    @PostMapping("/GuardarEmpleado")
    public String guardarEmpleado(Employee empl, RedirectAttributes redirectAttributes){
        String passEncriptada= String.valueOf(passwordEncoder().encode(empl.getPassword()));
        //String passEncriptada=passwordEncoder().encode(empl.getPassword());
        empl.setPassword(passEncriptada);
        if(iEmployeeService.saveOrUpdateEmpleado(empl)==true){
            redirectAttributes.addFlashAttribute("mensaje","saveOK");
            return "redirect:/see_employee";
        }
        redirectAttributes.addFlashAttribute("mensaje","saveError");
        return "redirect:/new_employee";
    }

    @GetMapping("/EditarEmpleado/{id}")
    public String editarEmpleado(Model model, @PathVariable Long idEmployee, @ModelAttribute("mensaje") String mensaje){
        Long empl=iEmployeeService.getEmployeeById(idEmployee).getIdEmployee();//ojoa aca hubo cambio  along
        model.addAttribute("empl",empl);
        model.addAttribute("mensaje", mensaje);
        List<Enterprise> listaEmpresas= iEnterpriseService.getAllEnterprises();
        model.addAttribute("emprelist",listaEmpresas);
        return "editarEmpleado";
    }

    @PostMapping("/ActualizarEmpleado")
    public String updateEmpleado(@ModelAttribute("empl") Employee empl, RedirectAttributes redirectAttributes){
        Long idEmployee=empl.getIdEmployee();
        String Oldpass=iEmployeeService.getEmployeeById(idEmployee).getPassword();
        if(!empl.getPassword().equals(Oldpass)){
            String passEncriptada= String.valueOf(passwordEncoder().encode(empl.getPassword()));
            //String passEncriptada=passwordEncoder().encode(empl.getPassword());
            empl.setPassword(passEncriptada);
        }
        if(iEmployeeService.saveOrUpdateEmpleado(empl)){
            redirectAttributes.addFlashAttribute("mensaje","updateOK");
            return "redirect:/see_employee";
        }
        redirectAttributes.addFlashAttribute("mensaje","updateError");
        return "redirect:/new_employee/"+empl.getIdEmployee();

    }

    private Encoder<String> passwordEncoder() {
        return null;
    }

    @GetMapping("/EliminarEmpleado/{id}")
    public String eliminarEmpleado(@PathVariable Long id, RedirectAttributes redirectAttributes){
        if (iEmployeeService.deleteEmployee(id)){
            redirectAttributes.addFlashAttribute("mensaje","deleteOK");
            return "redirect:/see_employee";
        }
        redirectAttributes.addFlashAttribute("mensaje", "deleteError");
        return "redirect:/new_employee";
    }

    @GetMapping("/Empresa/{id}/Empleados") //Filtrar los empleados por empresa
    public String verEmpleadosPorEmpresa(@PathVariable("id") Long idEmployee, Model model){
        List<Employee> listaEmpleados = iEmployeeService.obtenerPorEmpresa(idEmployee);
        model.addAttribute("emplelist",listaEmpleados);
        return "see_employee";
    }


   /* @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){return iEmployeeService.createEmployee(employee);}

    @GetMapping
    public List<Employee> getEmployee(){return iEmployeeService.getAllEmployees();}*/

    /*@GetMapping
    public ResponseEntity<List<EmployeeDTO>> readAll() throws Exception{
        List<EmployeeDTO> list = iEmployeeService.readAll().stream()
                .map(l -> mapper.map(l, EmployeeDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> readById(@PathVariable("id") Long id) throws Exception{
        Employee empl = iEmployeeService.readById(id);
        if(empl == null){
            throw new ModelNotFoundException("Id del Empleado Nº: " + id + " No fue encontrado");
        }
        EmployeeDTO dto = mapper.map(empl, EmployeeDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }*/

    /*@PostMapping
    public ResponseEntity<EmployeeDTO> create(@Valid @RequestBody EmployeeDTO employeeDto) throws Exception{
        Employee empl = iEmployeeService.create(mapper.map(employeeDto,Employee.class));
        EmployeeDTO dto = mapper.map(empl,EmployeeDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }*/



    /*@GetMapping("/{name}")
    public ResponseEntity<EmployeeDTO> findByName(@PathVariable("name") String name) throws Exception{
        List<Employee> empl = iEmployeeService.findByName(name);
        if(empl == null){
            throw new ModelNotFoundException("Nombre del Empleado Nº: " + name + " No fue encontrado");
        }
        EmployeeDTO dto = mapper.map(empl, EmployeeDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }*/

    @PutMapping
    public ResponseEntity<EmployeeDTO> update(@Valid @RequestBody EmployeeDTO employeeDto) throws Exception{
        Employee empl = iEmployeeService.readById(employeeDto.getIdEmployee());
        if(empl == null){
            throw new ModelNotFoundException("Id del Empleado no encontrado: " + employeeDto.getIdEmployee());
        }
        Employee employee = iEmployeeService.update(mapper.map(employeeDto, Employee.class));
        EmployeeDTO dto = mapper.map(employee, EmployeeDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updatePatch(@Valid @RequestBody EmployeeDTO employeeDto) throws Exception{
        Employee empl = iEmployeeService.readById(employeeDto.getIdEmployee());
        if(empl == null){
            throw new ModelNotFoundException("Id del Empleado no encontrado: " + employeeDto.getIdEmployee());
        }
        Employee employee = iEmployeeService.update(mapper.map(employeeDto, Employee.class));
        EmployeeDTO dto = mapper.map(employee, EmployeeDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception{
        Employee empl = iEmployeeService.readById(id);
        if(empl == null){
            throw new ModelNotFoundException("Id del Empleado no encontrado: " + id);
        }
        iEmployeeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /*CODIGO NUEVO
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("ListEmployee",iEmployeeService.getAllEmployees());
            return "index";
    }

   /* @GetMapping("/")
    public String showNewEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("Employee",employee);
        return "new_employee";
    }
  clase mintic thymeleaf
    @GetMapping List<Employee> getUsers(){return iEmployeeService.getAllEmployees();}}

    @PostMapping
    public Employee createUser(@RequestBody Employee employee){return iEmployeeService.createUser(employee);}*/

}
