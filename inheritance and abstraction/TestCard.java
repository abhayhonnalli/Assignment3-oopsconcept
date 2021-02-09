package abstraction;

import java.util.Scanner;

public class TestCard {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrepaidCard p = new TravelCard(5672, 1000, 3500, 5);
		Rewardable r = new TravelCard();

		Scanner sc = new Scanner(System.in);
		System.out.println(p);
		System.out.println("Amount  in dollars= " + p.availableBalance / 60);

		System.out.println("Enter the swipe amount in dollars =");

		double amount = sc.nextDouble();
		p.swipeCard(amount);

		System.out.println("Earn Reward Points= " + r.rewards(amount * 60));

	}
}


