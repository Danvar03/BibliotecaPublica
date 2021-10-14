package co.com.sofka.Biblioteca.dtos;

public class CategoriaDTO {

    private String categoriaId;
    private String nombreCategoria;

    public CategoriaDTO() {
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
