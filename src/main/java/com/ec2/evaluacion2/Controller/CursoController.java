package com.ec2.evaluacion2.Controller;

import com.ec2.evaluacion2.Clase.Curso;
import com.ec2.evaluacion2.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;


    @GetMapping("/listar")
    public List<Curso> listarCursos() {
        List<Curso> cursos = cursoService.obtenerCursos();
        return cursos;
    }

    @PostMapping("/nuevo")
    public String crearCurso(@RequestParam String nombre, @RequestParam int creditos) {
        Curso nuevoCurso = new Curso(nombre, creditos);//Constructor
        cursoService.crearCurso(nuevoCurso);
        return "Curso registrado exitosamente :)";
    }

    @DeleteMapping("/eliminar")
    public String eliminarCurso(@RequestParam int id) {
        Optional<Curso> cursoExistente = cursoService.obtenerCursoPorId(id);
        if (cursoExistente.isPresent()) {
            cursoService.eliminarCurso(id);
            return "Curso eliminado exitosamente :')";
        } else {
            return "No se encontro el curso, verifique que exista el curso con ese id";
        }
    }
}
