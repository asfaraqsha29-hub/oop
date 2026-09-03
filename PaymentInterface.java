interface Payment{
	void pay();
}
class OnlinePayment implements Payment{
	public void pay(){
		System.out.println("Pay with using Online banking system");
	}
}

class CardPayment implements Payment{
	public void pay(){
		System.out.println("Pay with using Credit Card");
	}
}

public class PaymentInterface{
	public static void main(String args[]){
		
		OnlinePayment online=new OnlinePayment();
		online.pay();
		
		CardPayment card=new CardPayment();
		card.pay();
	}
}