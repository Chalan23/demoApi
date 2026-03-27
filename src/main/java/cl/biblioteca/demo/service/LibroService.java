package cl.biblioteca.demo.service;

import cl.biblioteca.demo.model.Libro;
import cl.biblioteca.demo.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository repository;

    public List<Libro> listar() {
        return repository.obtenerLibros();
    }

    public Libro guardar(Libro libro) {
        return repository.guardar(libro);
    }

    public Libro buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public Libro actualizar(Libro libro) {
        return repository.actualizar(libro);
    }

    public void eliminar(int id) {
        repository.eliminar(id);
    }
}