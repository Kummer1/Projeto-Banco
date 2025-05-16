public class Principal {
    public static void main(String[] args) {

    ContaBancaria contaGustavo = new ContaBancaria();
    contaGustavo.titular = "Gustavo Alves Kummer";
    contaGustavo.setNumeroConta(12345678);
    contaGustavo.setSaldoAtual(28000);
    contaGustavo.exibeDados();

    Transferencias transferencias = new Transferencias();

    transferencias.sacar(contaGustavo);
    transferencias.depositar(contaGustavo);

    }
}
