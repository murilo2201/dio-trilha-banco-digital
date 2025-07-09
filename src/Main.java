import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ======= BANCOS CADASTRADOS =======
        Banco nubank = new Banco("Nubank");
        Banco santander = new Banco("Santander");

        // Lista central de bancos
        List<Banco> bancos = new ArrayList<>();
        bancos.add(nubank);
        bancos.add(santander);

        // ======= CLIENTE PEDRO =======
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        // Contas do Pedro em bancos diferentes
        Conta ccPedro = new ContaCorrente(pedro); // conta corrente no Nubank
        nubank.adicionarConta(ccPedro);

        Conta poupancaPedro = new ContaPoupanca(pedro); // conta poupança no Santander
        santander.adicionarConta(poupancaPedro);

        // ======= CLIENTE MARIA =======
        Cliente maria = new Cliente();
        maria.setNome("Maria");

        // Contas da Maria no Santander
        Conta ccMaria = new ContaCorrente(maria);
        santander.adicionarConta(ccMaria);

        Conta poupancaMaria = new ContaPoupanca(maria);
        santander.adicionarConta(poupancaMaria);

        // ======= LISTAR TODAS AS CONTAS POR BANCO =======
        for (Banco banco: bancos) {
            banco.listarContas(); // mostra nome do banco e contas associadas
        }

        // ======= OPERAÇÕES =======
        // Depósitos iniciais
        ccPedro.depositar(500);
        poupancaMaria.depositar(600);

        // Saques com tratamento de saldo insuficiente
        try {
            ccPedro.sacar(50);
            poupancaMaria.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // Transferência com tratamento de saldo insuficiente
        try {
            ccPedro.transferir(800, ccMaria); // Pedro tenta transferir mais do que tem
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // ======= EXTRATOS =======
        ccPedro.imprimirExtrato();
        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();
    }
}
