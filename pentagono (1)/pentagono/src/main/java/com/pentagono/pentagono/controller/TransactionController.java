package com.pentagono.pentagono.controller;

import com.pentagono.pentagono.dto.TransactionDTO;
import com.pentagono.pentagono.exceptions.ModelNotFoundException;
import com.pentagono.pentagono.model.Transaction;
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
    @Autowired
    private ITransactionService service;

    @Autowired
    @Qualifier("transactionMapper")
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> readAll() throws Exception{
        List<TransactionDTO> list = service.readAll().stream()
                .map(t -> mapper.map(t, TransactionDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity <>(list, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<TransactionDTO> create(@Valid @RequestBody TransactionDTO transactionDTO) throws Exception {
        Transaction t = mapper.map(transactionDTO, Transaction.class);
        Transaction sale = service.saveTransactional(t, t.getDetails());
        TransactionDTO dto = mapper.map(sale, TransactionDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<TransactionDTO> update(@Valid @RequestBody TransactionDTO transactionDTO) throws Exception {
        Transaction transaction = service.readById(transactionDTO.getIdTransaction());
        if(transaction == null) {
            throw new ModelNotFoundException("ID NOT FOUND: " + transactionDTO.getIdTransaction());
        }
        Transaction r = service.update(mapper.map(transactionDTO, Transaction.class));
        TransactionDTO dto = mapper.map(r, TransactionDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws Exception {
        Transaction transaction = service.readById(id);
        if(transaction == null) {
            throw new ModelNotFoundException("ID NOT FOUND: " + id);
        }
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /*@PostMapping
    public Transaction create(@RequestBody Transaction transaction) throws Exception{
        return (Transaction) service.create(transaction);
    }


    @GetMapping("/{id}")
    public Transaction readById(@PathVariable("id") Long id) throws Exception {
        return service.readById(id);
    }

    @PutMapping
    public Transaction update(@RequestBody Transaction transaction) throws Exception {
        return service.update(transaction);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) throws Exception{
        service.delete(id);
    }*/

}
