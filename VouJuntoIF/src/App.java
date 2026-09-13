import domain.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

//Joãozinho vai fazer uma solicitacao de uma carona
//Carona vai ser fornecida por Carolzinha
public class App {
    public static void main(String[] args) throws Exception {
       Aluno joao = new Aluno(1, "Joao de Souza Martins", LocalDate.parse("2011-06-13"), "M", "839.470.160-42");
       Aluno carol = new Aluno(2, "Carol Inacio Queiroz", LocalDate.parse("2008-07-13"), "F", "113.064.040-02");
       Veiculo bmw_carol = new Veiculo(1, "HFX-5873", "BMW 320i", "Branco", 5, carol);
       Carona carol_carona = new Carona(1, bmw_carol, "IFTM", "Praca Tubal Vilela",
                            LocalDate.parse("2026-09-14"), LocalTime.of(12, 30, 0),
                            bmw_carol.getCapacidade()-1, StatusCaronaEnum.ABERTA, carol);
       Solicitacao joao_solicitou = new Solicitacao(1, joao, carol_carona, LocalDate.now(), SolicitacaoStatusEnum.PENDENTE);
       ArrayList<Solicitacao> solicitacoes = new ArrayList<>();
       solicitacoes.add(joao_solicitou);
       joao.setSolicitacoes(solicitacoes);
       carol.setSolicitacoes(solicitacoes);
       System.out.println(joao.toString());
       System.out.println(carol.toString());
       System.out.println(bmw_carol.toString());
       System.out.println(carol_carona.toString());
       System.out.println(joao_solicitou.toString());
    }
}
