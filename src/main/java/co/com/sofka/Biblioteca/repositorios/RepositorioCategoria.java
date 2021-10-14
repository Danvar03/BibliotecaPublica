package co.com.sofka.Biblioteca.repositorios;


import co.com.sofka.Biblioteca.model.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioCategoria extends MongoRepository<Categoria, String> {


}
