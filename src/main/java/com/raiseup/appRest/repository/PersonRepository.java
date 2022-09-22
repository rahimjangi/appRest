package com.raiseup.appRest.repository;

import com.raiseup.appRest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
