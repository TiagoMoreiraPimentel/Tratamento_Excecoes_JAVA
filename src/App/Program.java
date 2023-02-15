package App;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.BusinessException;

public class Program {
	public static void main(String[] Args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withDrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withDrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double withdraw = sc.nextDouble();

		/* tratando as exceções.
		 * dentro do 'try' contem o codigo normal que deverias funcionar.
		 */ 
		try {
			account.withDraw(withdraw);
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		}
		/* dentro do 'catch' uma mensagem de erro armazenada 
		 * na classe 'BusinessException' que é responsavel pela tratativa de exceções.
		 */
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}
}
