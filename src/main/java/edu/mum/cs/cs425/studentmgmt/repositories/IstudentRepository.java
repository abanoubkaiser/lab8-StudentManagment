package edu.mum.cs.cs425.studentmgmt.repositories;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IstudentRepository extends CrudRepository<Student, Integer> {

}
