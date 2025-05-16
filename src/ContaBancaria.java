public class ContaBancaria {

    private int numeroConta;
    public String titular;
    private double saldoConta;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoAtual(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldoConta(){
        return this.saldoConta;
    }

    public void exibeDados(){
        System.out.println("Nome do titular: " + titular);
        System.out.println("O numero da conta é: " + numeroConta);
        System.out.println("O saldo da conta é: " + saldoConta);
    }
}
