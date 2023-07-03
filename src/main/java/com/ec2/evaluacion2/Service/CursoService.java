package com.ec2.evaluacion2.Service;

import com.ec2.evaluacion2.Clase.Curso;
import com.ec2.evaluacion2.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {


    @Autowired
    private CursoRepository cursoRepository;


    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }
    public List<Curso> obtenerCursos() {
        return cursoRepository.findAll();
    }
    public void eliminarCurso(int id) {
        cursoRepository.deleteById(id);
    }
    public Optional<Curso> obtenerCursoPorId(int id) {
        return cursoRepository.findById(id);
    }
}
