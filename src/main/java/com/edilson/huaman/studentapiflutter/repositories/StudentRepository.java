package com.edilson.huaman.studentapiflutter.repositories;

import com.edilson.huaman.studentapiflutter.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario, por ejemplo:
    // List<Student> findByCarrera(String carrera);
}
