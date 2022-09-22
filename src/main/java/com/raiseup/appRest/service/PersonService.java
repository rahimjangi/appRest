package com.raiseup.appRest.service;

import com.raiseup.appRest.model.Person;
import com.raiseup.appRest.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public Person getPerson(Long id){
        return personRepository.findById(id).orElseThrow(() -> new RuntimeException("Person does not exist"));
    }

    public List<Person>getPersonAll(){
        return personRepository.findAll();
    }
}
