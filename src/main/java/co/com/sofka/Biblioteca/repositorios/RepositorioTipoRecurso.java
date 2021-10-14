package co.com.sofka.Biblioteca.repositorios;

import co.com.sofka.Biblioteca.model.TipoRecurso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioTipoRecurso extends MongoRepository<TipoRecurso, String> {

}
