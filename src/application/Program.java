package application;

import java.util.Scanner;

import model.entities.Account;
import model.entities.exception.DomainException;
import model.entities.exception.EnoughException;

public class Program {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Enter account data");

		Account account = null;
		try {

			System.out.print("Number: ");
			Integer number = teclado.nextInt();
			System.out.print("Holder: ");
			teclado.nextLine();
			String holder = teclado.nextLine();
			System.out.print("Initial Balance: ");
			Double initialBalance = teclado.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = teclado.nextDouble();

			account = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.println("");
			System.out.print("Enter amount for withdraw:");
			Double withdraw = teclado.nextDouble();
			account.withdraw(withdraw);

			System.out.println(account);

		} catch (DomainException e) {
			System.out.println("Widraw Error: " + e.getMessage());

		} catch (EnoughException e) {
			System.out.println("Widraw Erro: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unxpected error");
		}

	}

}
