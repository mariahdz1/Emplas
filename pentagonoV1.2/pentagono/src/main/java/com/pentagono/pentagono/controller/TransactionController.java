package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.dto.EnterpriseDTO;
import com.pentagono.pentagono.dto.TransactionDTO;
import com.pentagono.pentagono.exceptions.ModelNotFoundException;
import com.pentagono.pentagono.model.Enterprise;
import com.pentagono.pentagono.model.Transaction;
import com.pentagono.pentagono.service.IEnterpriseService;
import com.pentagono.pentagono.service.ITransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transactions")

public class TransactionController {
    @Autowired/*inicializa variable*/
    private ITransactionService service;

    @Autowired
    @Qualifier("transactionMapper")
    private ModelMapper mapper;

    @GetMapping /*este es el GET*/
    public ResponseEntity<List<TransactionDTO>> readAll() throws Exception{
        List<TransactionDTO>list  =service.readAll().stream()
                .map(t -> mapper.map(t,TransactionDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping /*este es el POST*/
    public ResponseEntity  <TransactionDTO> create(@Valid @RequestBody TransactionDTO transactionDto) throws Exception{
        Transaction tra =service.create(mapper.map(transactionDto, Transaction.class));
        TransactionDTO dto =mapper.map(tra,TransactionDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> readById(@PathVariable("id") Long id) throws Exception{
        Transaction tra = service.readById(id);
        if(tra == null){
            throw new ModelNotFoundException("Id de la transacción no encontrado: " + id);
        }
        TransactionDTO dto = mapper.map(tra, TransactionDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<TransactionDTO> update(@Valid @RequestBody TransactionDTO transactionDto) throws Exception{
        Transaction tra = service.readById(transactionDto.getIdTransaction());
        if(tra == null){
            throw new ModelNotFoundException("Id de la transacción no encontrado: " + transactionDto.getIdTransaction());
        }
        Transaction transaction = service.update(mapper.map(transactionDto, Transaction.class));
        TransactionDTO dto = mapper.map(transaction, TransactionDTO.class);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception{
        Transaction tra = service.readById(id);
        if(tra == null){
            throw new ModelNotFoundException("Id de la transacción no encontrado: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
