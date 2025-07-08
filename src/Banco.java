import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Banco {

    private String nome;
    private List<Conta> contas;
    
}
