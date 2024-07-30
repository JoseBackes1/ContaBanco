package services;

import classes.ContaTerminal;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaTerminal contaTerminal = obterUsuario(scan);
        System.out.println(contaTerminal.toString());
    }
    
    private static ContaTerminal obterUsuario(Scanner scan) {
        ContaTerminal contaTerminal = new ContaTerminal();
        System.out.println("Por favor, digite o número da Agência: ");
        contaTerminal.setAgency(scan.nextLine());
        System.out.println("Por favor, digite o nome do Usuário: ");
        contaTerminal.setName(scan.nextLine());
        System.out.println("Por favor, digite o número da Conta: ");
        contaTerminal.setAccount(scan.nextInt());
        System.out.println("Por favor, digite o Saldo da conta: ");
        contaTerminal.setSaldo(scan.nextBigDecimal());

        return contaTerminal;
    }
}
