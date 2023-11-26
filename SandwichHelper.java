package week02;

public class SandwichHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sandwichCost = 11.99;
		double cashInWallet = 100.00;

		int numSanwiches = (int) (cashInWallet / sandwichCost);

		System.out.println("Num sandwiches: " + numSanwiches);

		int numEaten = 0;
		boolean amHungry = true;
		double amountSpent = 0.0;

		// while I have enough money and I am hungry
		while (cashInWallet >= sandwichCost && amHungry) {
			System.out.println("I am buying a sandwich for $" + sandwichCost);

			cashInWallet -= sandwichCost;
			numEaten++;
			amountSpent += sandwichCost;
		}

		System.out.printf("I bought %d sandwiches for $%.2f\n", numEaten, amountSpent);
	}

}
