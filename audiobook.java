import java.util.*;

public class livro extends ItemsBiblioteca {

    private String autor;
    private int duracao;
    private String genero;
    


    public livro(String titulo, String autor, int duracao, int qnt_disp, String genero){
        super(titulo, qnt_disp);

        this.duracao = duracao;
        this.autor = autor;
        this.genero = genero;
    }


    public String getAutor() {
        return autor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    @Override
    public void locar() {
        System.out.println("\nVocê conseguiu locar um livro! Devolva dentro de 10 dias.\n");
        System.out.println(" Este livro possui as seguintes especificações: ");
        System.out.println(" Título: " + ItemsBiblioteca.titulo());
        System.out.println(" Autor: " + autor);
        System.out.println(" duracao: " + duracao);
        System.out.println(" Genero: " + genero);
        System.out.println(" Quantidade disponível: " + ItemsBiblioteca.qnt_disp() + "\n");

    }

}