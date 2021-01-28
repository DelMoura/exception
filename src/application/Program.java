package application;

import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter account data");

		System.out.print("Number: ");
		Integer number = teclado.nextInt();
		System.out.print("Holder:");
		teclado.nextLine();
		String holder = teclado.nextLine();
		System.out.print("Initial Balance: ");
		Double initialBalance = teclado.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = teclado.nextDouble();

		Account account = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.println("");
		System.out.print("Enter amount for withdraw:");
		Double withdraw = teclado.nextDouble();
		account.withdraw(withdraw);

		System.out.println(account);
	}

}
