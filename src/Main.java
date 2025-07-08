public class Main {

    public static void main(String[] args) {

        Cliente pedro = new Cliente();
        pedro.setNome("pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);

        cc.depositar(500);
        cc.transferir(800, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();




    }
}


