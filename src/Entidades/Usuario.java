package Entidades;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;
    private boolean administrador;

    public boolean bloqueado;
    public boolean excluido;

    public String justificativaExclusao;

    public String justificativaBloqueio;

    // Construtor
    public Usuario(String nome, String email, String senha, boolean ativo, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
        this.administrador = administrador;
    }


    // Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    protected void setBloqueado(boolean b) {
        this.bloqueado = b;
    }

    public boolean isBloqueado(){
        return this.bloqueado;
    }

    protected void setJustificativaBloqueio(String justificativa) {
        this.justificativaBloqueio = justificativa;
    }

    public String getJustificativaBloqueio(){
        return this.justificativaBloqueio;
    }

    protected void setExcluido(boolean b) {
        this.excluido = b;
    }

    public boolean isExcluido(){
        return this.excluido;
    }

    protected void setJustificativaExclusao(String justificativa) {
        this.justificativaExclusao = justificativa;
    }

    public String getJustificativaExclusao(){
        return this.justificativaExclusao;
    }
}