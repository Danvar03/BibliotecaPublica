package co.com.sofka.Biblioteca.repositorios;


import co.com.sofka.Biblioteca.model.Recurso;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RepositorioRecurso extends MongoRepository<Recurso,String> {

    List<Recurso> findRecursoBycategoriaId(String categoriaId);
    List<Recurso> findRecursoBytipoRecursoId(String tipoRecursoId);
}
