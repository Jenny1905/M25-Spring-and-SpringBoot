package org.tnsindia.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*It is used to mark the class as a service provider. So overall @Service annotation is 
used with classes that provide some business functionalities. Spring context 
will auto-detect these classes when annotation-based configuration and classpath scanning 
is used*/
/*The @Transactional annotation belongs to the Service layer 
 * because it is the Service layer's responsibility to define the transaction boundaries*/

@Service
@Transactional
public class StudentService {
 
    @Autowired
    private StudentRepository repi;
     //to retrieve all the records
    public List<Student> listAll() {
        return repi.findAll();
    }
    //to insert,create and update

    public void save(Student student) {
        repi.save(student);
    }
    //to retrieve specific records

    public Student get(Integer id) {
        return repi.findById(id).get();
    }
     //to remove the specific record
    public void delete(Integer id) {
        repi.deleteById(id);
    }
}
