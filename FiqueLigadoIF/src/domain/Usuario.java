package domain;

public class Usuario {
    private Integer id;
    private String senha;
    private TipoUsuarioEnum tipoUsuario;
    private Pessoa pessoa;

    public Usuario(TipoUsuarioEnum tipoUsuarioEnum, Integer id, Pessoa pessoa, String senha) {
        this.tipoUsuario = tipoUsuarioEnum;
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

    public TipoUsuarioEnum getTipoUsuarioEnum() {
        return tipoUsuario;
    }

    public void setTipoUsuarioEnum(TipoUsuarioEnum tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", senha=" + senha + ", TipoUsuarioEnum=" + tipoUsuario + ", pessoa=" + pessoa
                + "]";
    }

}
