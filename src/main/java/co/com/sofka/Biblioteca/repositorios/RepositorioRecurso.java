package co.com.sofka.Biblioteca.repositorios;

import co.com.sofka.Biblioteca.model.Recurso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioRecurso extends MongoRepository<Recurso,String> {

}