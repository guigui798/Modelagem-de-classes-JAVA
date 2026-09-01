package domain;
import java.time.LocalDate;

public class Evento {
    private Integer id;
    private String nome;
    private LocalDate dataFim;
    private String linkBanner;
    private StatusEventoEnum status;
    private Double valorInscricao;
    private Usuario responsavel;
    private Usuario cadastradoPor;

    public Evento(Usuario cadastradoPor, LocalDate dataFim, Integer id, String linkBanner, String nome, Usuario responsavel, StatusEventoEnum status, Double valorInscricao) {
        this.cadastradoPor = cadastradoPor;
        this.dataFim = dataFim;
        this.id = id;
        this.linkBanner = linkBanner;
        this.nome = nome;
        this.responsavel = responsavel;
        this.status = status;
        this.valorInscricao = valorInscricao;
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

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getLinkBanner() {
        return linkBanner;
    }

    public void setLinkBanner(String linkBanner) {
        this.linkBanner = linkBanner;
    }

    public StatusEventoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEventoEnum status) {
        this.status = status;
    }

    public Double getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(Double valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Usuario getCadastradoPor() {
        return cadastradoPor;
    }

    public void setCadastradoPor(Usuario cadastradoPor) {
        this.cadastradoPor = cadastradoPor;
    }
    


}
