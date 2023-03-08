import java.util.*;

public abstract class ItemsBiblioteca{

    private String titulo;
    private int qntd_disp;

    public ItemsBiblioteca(String titulo, int qntd_disp){
        this.titulo = titulo;
        this.qntd_disp = qntd_disp;
    }

    public setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public setQnt_disp(int qntd_disp){
        this.qntd_disp = qntd_disp;
    }

    public int getQnt_disp(){
        return qntd_disp;
    }

    
    public abstract void locar();
    public abstract void devolver();
    
}
