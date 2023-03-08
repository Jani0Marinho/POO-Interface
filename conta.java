public class conta {

    private String email, senha, nome;
    private int id, index_user, biostam = 0;

    public conta(String email, String senha, String nome, int id) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getIndex_user() {
        return index_user;
    }

    public void defPlano(String planoesc) {
    }

    public String getPlano() {
        return "*DESCARTE*";
    }

    public int getLimlivro() {
        return 1000;
    }

    public String getValormulta() {
        return "*DESCARTE*";
    }

    public String getTempomulta() {
        return "*DESCARTE*";
    }

    public void defBios(String bio) {
    }

    public int getBiotam() {
        return this.biostam;
    }
}
