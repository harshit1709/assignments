import java.util.Scanner;

public class promocode3 {

	public static void main(String[] args) {
		
		// MODEL
		int baseFare = 50;
		int kmCharge = 10;
		
		int distanceTravlled = 100;
		
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaBike = 4;
		int olaShared = 5;
		
		int KOTAK200 = 1;
		int ICICTREATS = 2;

		int amountToPay = 0;
		
		// VIEW
		System.out.println("=========================");
		System.out.println("Select the Type of Cab:");
		System.out.println("1. OLA MICRO");
		System.out.println("2. OLA MINI");
		System.out.println("3. OLA SEDAN");
		System.out.println("4. OLA BIKE");
		System.out.println("5. OLA SHARED");
		System.out.println("=========================");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int choice = scanner.nextInt();
		
		
		switch(choice) {
		
			case 1:
				baseFare += 10;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA MICRO BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 2:
				baseFare += 20;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA MINI BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
			
			case 3:
				baseFare += 50;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 4:
				baseFare += 5;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA BIKE BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			case 5:
				baseFare += 8;
				amountToPay = baseFare + (kmCharge*distanceTravlled);
				System.out.println("OLA SHARED BOOKED. PLEASE PAY: \u20b9"+amountToPay);
				break;
				
			default:
				System.out.println("Please Select Cab to Porceed");
				break;
				
		}
		
		if(amountToPay >= 399) {
			System.out.println("You are elibile for applying Promo Code");
			System.out.println("1. KOTAK200 for orders above Rs.399. 20% Off Upto 200");
			System.out.println("2. ICICTREATS for orders above Rs.499. Flat 30%");
			System.out.println("Please enter the promoCode");
			
			double discount1 = 0.20* amountToPay;
			double discount2 = 0.30* amountToPay;
			
			int promoCode = scanner.nextInt();
			if(promoCode != KOTAK200  && promoCode != ICICTREATS  ){
				System.out.println("promoCode is not vald, Please apply the different one from  KOTAK200 or ICICTREATS");
				if(amountToPay - discount1 < amountToPay -discount2){
					System.out.println("apply KOTAK200 for  more discount");
				}else{
					System.out.println("apply ICICTREATS for more discount");
				}
				
			}
			if(promoCode == ICICTREATS && amountToPay >=499) {
				double discount = 0.30 * amountToPay;
				System.out.println("Promo Code ICICTREATS Applied. You Got Discount worth \u20b9"+discount);
				System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
			}else if(promoCode == KOTAK200) {
				// Nested if/else
				double discount = 0.20 * amountToPay;
				if(discount > 200) {
					discount = 200;
				}
				System.out.println("Promo Code KOTAK200 Applied. You Got Discount worth \u20b9"+discount);
				
				System.out.println("Please Pay: \u20b9"+(amountToPay-discount));
				System.out.println("But we suggest you to apply ICICTREATS for more discount");
			}
		}
		
	}

	// Assignment: Integrate PromoCoode Coupon Snippet in this program w.r.t. OLA Ride Booking Program :)
	
}
