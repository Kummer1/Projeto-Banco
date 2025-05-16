import java.util.Scanner;

public class Transferencias {

    Scanner leitura = new Scanner(System.in);

    public void sacar(ContaBancaria conta){

        double saldoAtual = conta.getSaldoConta();

        System.out.println("Digite o valor a ser sacado: ");
        double valor = leitura.nextDouble();

        if(saldoAtual >= valor){
            saldoAtual = saldoAtual - valor;
            System.out.println("O novo saldo é de: " + saldoAtual);
        }
        else{
            System.out.println("Saque inválido");
        }

    }
    public void depositar(ContaBancaria conta){

        System.out.println("Digite o valor a ser depositado: ");
        double valor = leitura.nextDouble();

        double saldoAtual = conta.getSaldoConta();

        saldoAtual += valor;
        System.out.println("Seu saldo é de: " + saldoAtual);
    }
}
