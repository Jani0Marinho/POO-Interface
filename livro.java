//Função que registra um livro novo/retira um livro da biblioteca
public class livro {
    public String titulo;
    public String autor;
    public int isbn;
    public int qnt_disp;

    public livro(String titulo, String autor, int isbn, int qnt_disp) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.qnt_disp = qnt_disp;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getQnt_disp() {
        return qnt_disp;
    }

}