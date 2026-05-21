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

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setDisponivel(boolean status) {
        this.disponivel = status;
    }

    public String toString() {
        return this.codigo + " | " + this.titulo + " | " + this.autor + " | " + this.disponivel;
    }


}
