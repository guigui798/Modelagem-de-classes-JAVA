package domain;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Aluno {
    private Integer id;
    private String nome_aluno;
    private LocalDate data_nasc;
    private long idade;
    private String sexo;
    private String CPF;
    private ArrayList<Solicitacao> solicitacoes;
    public Aluno(Integer id, String nome_aluno, LocalDate data_nasc, String sexo, String cPF) {
        this.id = id;
        this.nome_aluno = nome_aluno;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        CPF = cPF;
        this.idade = ChronoUnit.YEARS.between(data_nasc, LocalDate.now());
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome_aluno() {
        return nome_aluno;
    }
    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }
    public LocalDate getData_nasc() {
        return data_nasc;
    }
    public void setData_nasc(LocalDate data_nasc) {
        this.data_nasc = data_nasc;
        this.idade = ChronoUnit.YEARS.between(data_nasc, LocalDate.now());
    }
    public long getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public ArrayList<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }
    public void setSolicitacoes(ArrayList<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }
    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome_aluno=" + nome_aluno + ", data_nasc=" + data_nasc + ", idade=" + idade
                + ", sexo=" + sexo + ", CPF=" + CPF + "]";
    }

    
    

}
