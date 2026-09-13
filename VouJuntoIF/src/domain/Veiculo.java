package domain;
public class Veiculo {
    private Integer id;
    private String placa;
    private String modelo;
    private String cor;
    private Integer capacidade;
    private Aluno fornecedor_carona;
    public Veiculo(Integer id, String placa, String modelo, String cor, Integer capacidade, Aluno fornecedor_carona) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.capacidade = capacidade;
        this.fornecedor_carona = fornecedor_carona;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    public Aluno getFornecedor_carona() {
        return fornecedor_carona;
    }
    public void setFornecedor_carona(Aluno fornecedor_carona) {
        this.fornecedor_carona = fornecedor_carona;
    }
    @Override
    public String toString() {
        return "Veiculo [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", cor=" + cor + ", capacidade="
                + capacidade + ", fornecedor_carona=" + fornecedor_carona + "]";
    }

    

}
