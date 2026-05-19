public class Livro {    
    int codigo;
    String titulo, autor;
    boolean disponivel;

    public Livro(int codigo, String titulo, String autor, boolean disponivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    boolean getDisponivel() {
        return this.disponivel;
    }

    void setDisponivel(boolean status) {
        this.disponivel = status;
    }


}
