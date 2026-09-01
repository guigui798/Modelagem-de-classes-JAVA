package domain;
import java.util.ArrayList;

public class Atividade_Area {
    private Integer id;
    private ArrayList<Area>id_area;
    private ArrayList<Atividade>id_atividade;

    public Atividade_Area(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Area> getId_area() {
        return id_area;
    }

    public void setId_area(ArrayList<Area> id_area) {
        this.id_area = id_area;
    }

    public ArrayList<Atividade> getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(ArrayList<Atividade> id_atividade) {
        this.id_atividade = id_atividade;
    }


}
