import domain.Area;
import domain.Evento;
import domain.Local;
import domain.Pessoa;
import domain.StatusEventoEnum;
import domain.TipoUsuarioEnum;
import domain.Usuario;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Area area = new Area(1, "Computação");
        Local local = new Local("Morada da Colina", 
                                120, 
                                "38400000", 
                                "Uberlândia", 
                                1, 
                                "Auditório IFTM Udi Centro", 
                                1150, 
                                "Dentro do campus", 
                                "Rua Blanchi Galassi");

        Pessoa pessoa = new Pessoa("Aluno",
                                    "guilhermealveslobianco@gmail.com",
                                    1,
                                    "/home/cadu.jpg",
                                    "Guilherme Alves");
        
        Usuario user = new Usuario(TipoUsuarioEnum.SERVIDOR, 
                                    1, 
                                    pessoa, 
                                    "senha");
        Evento evento = new Evento(user, 
            LocalDate.parse("2026-07-28"), 
            1, 
            "home/banner.jpg", 
            "Palestra de IA", 
            user, 
            StatusEventoEnum.PENDENTE, 
            100);
    }
}
