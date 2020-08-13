class pay{
	String RecieverName;
	String PhoneNumber;
	double  AmountToPay;
	
	pay(){
		
	}
	pay(String RecieverName, String PhoneNumber,double  AmountToPay ){
		this.RecieverName = RecieverName;
		this.PhoneNumber = PhoneNumber;
		this.AmountToPay = AmountToPay;
	}
	void showpaymentdetails(){
		System.out.println("The payment of " +AmountToPay+" is successful to"+RecieverName);
	}
	
}
class UpiTransfer extends pay{
	String UpiId;
	
	UpiTransfer(){
		
	}
	UpiTransfer(String RecieverName, String PhoneNumber, double AmountToPay, String UpiId){
		super(RecieverName, PhoneNumber, AmountToPay);
		this.UpiId = UpiId;
		
	}
	void showpaymentdetails(){
		System.out.println("The payment of " +AmountToPay+" is successful using "+UpiId+" UpiId");
	}
	
	
}



public class paytm {
	
	public static void main(String[] args) {
		pay p = new pay("harshit","9877479926",2000);
		UpiTransfer i = new UpiTransfer("Adarsh","987747926",2000, "adarsh@xyz") ;
		p.showpaymentdetails();
		i.showpaymentdetails();
	}
}
