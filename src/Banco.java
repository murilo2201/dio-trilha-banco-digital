import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class Banco {
    @NonNull
    private String nome;

    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        System.out.println("Banco: " + nome);
        for (Conta conta : contas) {
            System.out.println("- " + conta.getClass().getSimpleName() + " de " + conta.getCliente().getNome() + " - Nº " + conta.getNumero());
        }
        System.out.println();
    }
}
