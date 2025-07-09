import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Erro: saldo insuficiente para sacar R$ " + valor + " (saldo disponível: R$ " + saldo + ")");
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso. Saldo atual: R$ %.2f%n", valor, saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso. Saldo atual: R$ %.2f%n", valor, saldo);

    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Erro: saldo insuficiente para transferir R$ " + valor + " (saldo disponível: R$ " + saldo + ")");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.printf("Transferência de R$ %.2f para %s realizada com sucesso. Saldo atual: R$ %.2f%n", valor, contaDestino.getCliente().getNome(), saldo);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}