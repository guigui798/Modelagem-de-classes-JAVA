package domain;

public class Pessoa {
    private Integer id;
    private String nome;
    private String link_foto;
    private String biografia;
    private String email;

    public Pessoa(String biografia, String email, Integer id, String link_foto, String nome) {
        this.biografia = biografia;
        this.email = email;
        this.id = id;
        this.link_foto = link_foto;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLink_foto() {
        return link_foto;
    }

    public void setLink_foto(String link_foto) {
        this.link_foto = link_foto;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", link_foto=" + link_foto + ", biografia=" + biografia
                + ", email=" + email + "]";
    }

    


}
