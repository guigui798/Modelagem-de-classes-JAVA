package domain;
import java.time.LocalDate;

public class Solicitacao {
    private Integer id;
    private Aluno passageiro;
    private Carona carona;
    private LocalDate data_solicitacao;
    private SolicitacaoStatusEnum status;
    public Solicitacao(Integer id, Aluno passageiro, Carona carona, LocalDate data_solicitacao,
                        SolicitacaoStatusEnum status) {
        this.id = id;
        this.passageiro = passageiro;
        this.carona = carona;
        this.data_solicitacao = data_solicitacao;
        this.status = status;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Aluno getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Aluno passageiro) {
        this.passageiro = passageiro;
    }
    public Carona getCarona() {
        return carona;
    }
    public void setCarona(Carona carona) {
        this.carona = carona;
    }
    public LocalDate getData_solicitacao() {
        return data_solicitacao;
    }
    public void setData_solicitacao(LocalDate data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }
    public SolicitacaoStatusEnum getStatus() {
        return status;
    }

    public void setStatus(SolicitacaoStatusEnum status) {
        this.status = status;
        if(status==SolicitacaoStatusEnum.PENDENTE){
            if(this.carona.getVagas_disponiveis()>0 && this.carona.getStatus()==StatusCaronaEnum.ABERTA){
                this.carona.setVagas_disponiveis(this.carona.getVagas_disponiveis()-1);
            }
        }
        else{
            this.status=SolicitacaoStatusEnum.RECUSADA;
        }
    }
    @Override
    public String toString() {
        return "Solicitacao [id=" + id + ", passageiro=" + passageiro.getNome_aluno() + ", carona=" + carona.getFornecedor_carona() + ", data_solicitacao="
                + data_solicitacao + ", status=" + status + "]";
    }
    
    
    

}
