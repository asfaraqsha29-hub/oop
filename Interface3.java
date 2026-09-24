interface Payment{
	void pay();
}
class CardPayment implements Payment{
	public void pay(){
		System.out.println("you can pay with using card");
	}
}
class CashPayment implements Payment{
	public void pay(){
		System.out.println("you can pay with cash");
	}
}
class OnlinePayment implements Payment{
	public void pay(){
		System.out.println("you can pay with online payment");
	}
}
public class Interface3{
	public static void main(String args[]){
		CardPayment Card=new CardPayment();
		Card.pay();
		
		CashPayment cash=new CashPayment();
		cash.pay();
		
		OnlinePayment online=new OnlinePayment();
		online.pay();
	}
}