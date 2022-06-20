package application;


import entities.Bank;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public Program() {
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank;

        //Solicitando dados cadastrais
        System.out.println("####PARA ABRIR A CONTA, PRIMEIRO DIGITE UM NUMERO (PELO MENOS 4 DIGITOS)####");
        int conta = sc.nextInt();
        System.out.println("DIGITE SEU NOME COMPLETO: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println();
        //pergunta se havera doposito inicial ou não
        System.out.println("Havera deposito agora (y/n)? ");
        //cria a variavel character aqui para p mecanismo de resposta.
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.print("Deposito inicial é: ");
            double depositoInicial = sc.nextDouble();
            bank = new Bank(depositoInicial, name, conta);
        } else {
            bank = new Bank(name, conta);
        }
        System.out.println();
        System.out.println("##########DADOS DA CONTA###########");
        System.out.println(bank);

        System.out.println();
        System.out.print("Deposite um valor: ");
        double depistoValor = sc.nextDouble();
        bank.deposito(depistoValor);
        System.out.println("Dados da conta atualizado: ");
        System.out.println(bank);

        System.out.println();
        System.out.println("Saque um valor: ");
        double saqueValor = sc.nextDouble();
        bank.saque(saqueValor);
        System.out.println(bank);


        sc.close();
    }
}
