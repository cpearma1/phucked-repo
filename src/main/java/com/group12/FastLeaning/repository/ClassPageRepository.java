package com.group12.FastLeaning.repository;

import com.group12.FastLeaning.model.ClassPage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClassPageRepository extends CrudRepository<ClassPage, Long> {
    ClassPage findByClassNameOrTeacherFirstNameOrTeacherLastNameContaining(String query, String query2, String query3);
}
// from this method --> creating a service --  call it classpageService
// in that service create a method to search the repository with the above method
// will return the results to the controller
// from the controller --> will set up how to retrieve the results to display