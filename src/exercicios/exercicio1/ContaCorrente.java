package exercicios.exercicio1;

public class ContaCorrente extends Conta implements Operavel{

    private double saldo;

    @Override
    protected double obterSaldoAtual() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
}
