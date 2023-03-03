public class conta {

    private String email, senha, nome;
    private int id, index_user;

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
}
