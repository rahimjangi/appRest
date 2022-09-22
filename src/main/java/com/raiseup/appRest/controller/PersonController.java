package com.raiseup.appRest.controller;

import com.raiseup.appRest.model.Person;
import com.raiseup.appRest.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@Slf4j
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping
    public ResponseEntity<List<Person>> getPersons(){
        return new ResponseEntity<>(personService.getPersonAll(),HttpStatus.OK);
    }

    @GetMapping("/{personId}")
    public ResponseEntity<Person>getPerson(@PathVariable("personId")Long id){
        return new ResponseEntity<>(personService.getPerson(id),HttpStatus.OK);
    }

}
