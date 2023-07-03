package com.ec2.evaluacion2.Repository;

import com.ec2.evaluacion2.Clase.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
