package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is  there na initial deposit (y/n) ?");
        char response = sc.next().charAt(0);

        if (response=='y'){
            System.out.println("Enter initial deposit value: ");
            double deposito = sc.nextDouble();
             conta = new Conta( number, holder, deposito);

        }else {
            conta = new Conta(number,holder);
        }

        System.out.println("Enter the deposit value: ");
        double dep = sc.nextDouble();
        conta.Deposito(dep);

        System.out.println("Update account data: ");
        System.out.println(conta);

        System.out.println("Enter the withdraw value: ");
        double saq = sc.nextDouble();
        conta.Saque(saq);

        System.out.println("Update account data: ");
        System.out.println(conta);


        sc.close();

    }
}
