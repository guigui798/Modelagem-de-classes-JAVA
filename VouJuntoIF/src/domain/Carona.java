package domain;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Carona {

    private Integer id;
    private Veiculo veiculo;
    private String local_saida;
    private String local_destino;
    private LocalDate data_carona;
    private LocalTime horario_carona;
    private Integer vagas_disponiveis;
    private StatusCaronaEnum status;
    private Aluno fornecedor_carona;
    private ArrayList<Solicitacao> solicitacoes;
    public Carona(Integer id, Veiculo veiculo, String local_saida, String local_destino, LocalDate data_carona,
            LocalTime horario_carona, Integer vagas_disponiveis, StatusCaronaEnum status, Aluno fornecedor_carona) {
        this.id = id;
        this.veiculo = veiculo;
        this.local_saida = local_saida;
        this.local_destino = local_destino;
        this.data_carona = data_carona;
        this.horario_carona = horario_carona;
        this.vagas_disponiveis = vagas_disponiveis;
        this.status = status;
        this.fornecedor_carona = fornecedor_carona;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public String getLocal_saida() {
        return local_saida;
    }
    public void setLocal_saida(String local_saida) {
        this.local_saida = local_saida;
    }
    public String getLocal_destino() {
        return local_destino;
    }
    public void setLocal_destino(String local_destino) {
        this.local_destino = local_destino;
    }
    public LocalDate getData_carona() {
        return data_carona;
    }
    public void setData_carona(LocalDate data_carona) {
        this.data_carona = data_carona;
    }
    public LocalTime getHorario_carona() {
        return horario_carona;
    }
    public void setHorario_carona(LocalTime horario_carona) {
        this.horario_carona = horario_carona;
    }
    public Integer getVagas_disponiveis() {
        return vagas_disponiveis;
    }
    public void setVagas_disponiveis(Integer vagas_disponiveis) {
        this.vagas_disponiveis = vagas_disponiveis;
        if(this.vagas_disponiveis==0){this.status=StatusCaronaEnum.LOTADA;}
    }
    public StatusCaronaEnum getStatus() {
        return status;
    }
    public void setStatus(StatusCaronaEnum status) {
        this.status = status;
        if(this.status==StatusCaronaEnum.FINALIZADA || this.status==StatusCaronaEnum.CANCELADA){this.vagas_disponiveis=this.veiculo.getCapacidade();}
    }
    public Aluno getFornecedor_carona() {
        return fornecedor_carona;
    }
    public void setFornecedor_carona(Aluno fornecedor_carona) {
        this.fornecedor_carona = fornecedor_carona;
    }
    public ArrayList<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }
    public void setSolicitacoes(ArrayList<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }
    @Override
    public String toString() {
        return "Carona [id=" + id + ", veiculo=" + veiculo + ", local_saida=" + local_saida + ", local_destino="
                + local_destino + ", data_carona=" + data_carona + ", horario_carona=" + horario_carona
                + ", vagas_disponiveis=" + vagas_disponiveis + ", status=" + status + ", fornecedor_carona="
                + fornecedor_carona + ", solicitacoes=" + solicitacoes + "]";
    }
    


}
