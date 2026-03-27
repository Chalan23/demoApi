package cl.biblioteca.demo.repository;

import cl.biblioteca.demo.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro guardar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public Libro actualizar(Libro libro) {
        int posicion = -1;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == libro.getId()) {
                posicion = i;
            }
        }

        if (posicion != -1) {
            listaLibros.set(posicion, libro);
            return libro;
        }

        return null;
    }

    public void eliminar(int id) {
        listaLibros.removeIf(libro -> libro.getId() == id);
    }
}