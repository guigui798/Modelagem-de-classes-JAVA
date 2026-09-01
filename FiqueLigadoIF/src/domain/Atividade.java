package domain;
import java.time.LocalDateTime;

public class Atividade {
    private Integer id;
    private String nome;
    private LocalDateTime data_hora_inicio;
    private LocalDateTime data_hora_fim;
    private String link_banner;
    private AtividadeStatusENUM status;
    private Double valor_inscricao;
    private Usuario id_responsavel;
    private Usuario id_usuario_cadastrado;

    public Atividade(LocalDateTime data_hora_fim, LocalDateTime data_hora_inicio, Integer id, Usuario id_responsavel, Usuario id_usuario_cadastrado, String link_banner, String nome, AtividadeStatusENUM status, Double valor_inscricao) {
        this.data_hora_fim = data_hora_fim;
        this.data_hora_inicio = data_hora_inicio;
        this.id = id;
        this.id_responsavel = id_responsavel;
        this.id_usuario_cadastrado = id_usuario_cadastrado;
        this.link_banner = link_banner;
        this.nome = nome;
        this.status = status;
        this.valor_inscricao = valor_inscricao;
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

    public LocalDateTime getData_hora_inicio() {
        return data_hora_inicio;
    }

    public void setData_hora_inicio(LocalDateTime data_hora_inicio) {
        this.data_hora_inicio = data_hora_inicio;
    }

    public LocalDateTime getData_hora_fim() {
        return data_hora_fim;
    }

    public void setData_hora_fim(LocalDateTime data_hora_fim) {
        this.data_hora_fim = data_hora_fim;
    }

    public String getLink_banner() {
        return link_banner;
    }

    public void setLink_banner(String link_banner) {
        this.link_banner = link_banner;
    }

    public AtividadeStatusENUM getStatus() {
        return status;
    }

    public void setStatus(AtividadeStatusENUM status) {
        this.status = status;
    }

    public Double getValor_inscricao() {
        return valor_inscricao;
    }

    public void setValor_inscricao(Double valor_inscricao) {
        this.valor_inscricao = valor_inscricao;
    }

    public Usuario getId_responsavel() {
        return id_responsavel;
    }

    public void setId_responsavel(Usuario id_responsavel) {
        this.id_responsavel = id_responsavel;
    }

    public Usuario getId_usuario_cadastrado() {
        return id_usuario_cadastrado;
    }

    public void setId_usuario_cadastrado(Usuario id_usuario_cadastrado) {
        this.id_usuario_cadastrado = id_usuario_cadastrado;
    }

    @Override
    public String toString() {
        return "Atividade [id=" + id + ", nome=" + nome + ", data_hora_inicio=" + data_hora_inicio + ", data_hora_fim="
                + data_hora_fim + ", link_banner=" + link_banner + ", status=" + status + ", valor_inscricao="
                + valor_inscricao + ", id_responsavel=" + id_responsavel + ", id_usuario_cadastrado="
                + id_usuario_cadastrado + "]";
    }
}
