package domain;

public class Usuario {
    private Integer id;
    private String senha;
    private Enum TipoUsuarioEnum;
    private Pessoa pessoa;

    public Usuario(Enum TipoUsuarioEnum, Integer id, Pessoa pessoa, String senha) {
        this.TipoUsuarioEnum = TipoUsuarioEnum;
        this.id = id;
        this.pessoa = pessoa;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Enum getTipoUsuarioEnum() {
        return TipoUsuarioEnum;
    }

    public void setTipoUsuarioEnum(Enum TipoUsuarioEnum) {
        this.TipoUsuarioEnum = TipoUsuarioEnum;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", senha=" + senha + ", TipoUsuarioEnum=" + TipoUsuarioEnum + ", pessoa=" + pessoa
                + "]";
    }

}
