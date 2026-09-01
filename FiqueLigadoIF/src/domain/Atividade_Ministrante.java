package domain;
import java.util.ArrayList;

public class Atividade_Ministrante {
    private Integer id;
    private ArrayList<Atividade> id_atividade;
    private ArrayList<Pessoa> id_pessoa;

    public Atividade_Ministrante(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Atividade> getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(ArrayList<Atividade> id_atividade) {
        this.id_atividade = id_atividade;
    }

    public ArrayList<Pessoa> getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(ArrayList<Pessoa> id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    @Override
    public String toString() {
        return "Atividade_Ministrante [id=" + id + ", id_atividade=" + id_atividade + ", id_pessoa=" + id_pessoa + "]";
    }
    

}
