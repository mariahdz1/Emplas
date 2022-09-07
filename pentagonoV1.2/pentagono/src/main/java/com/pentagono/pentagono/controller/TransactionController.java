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

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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
        List<TransactionDTO>list  =service.readAll().stream()
                .map(c -> mapper.map(c,TransactionDTO.class)).collect(Collectors.toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> readById(@PathVariable("id") Long id) throws Exception{
        Transaction transaction = service.readById(id);
        if(transaction == null){
            throw new ModelNotFoundException("ID NOT FOUND: " + id);
        }
        TransactionDTO dto = mapper.map(transaction, TransactionDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
    /*@ResponseStatus(HttpStatus.CREATED)*/

    @PostMapping
    public ResponseEntity<TransactionDTO> create(@Valid @RequestBody TransactionDTO transactionDTO) throws Exception {
        Transaction t = mapper.map(transactionDTO, Transaction.class);
        Transaction transaction = service.saveTransactional(t, t.getDetails());
        TransactionDTO dto = mapper.map(transaction, TransactionDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
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


    }/*end class*/






