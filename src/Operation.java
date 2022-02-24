import java.time.LocalDate;
public class Operation {
	private double amount;
	private Card card;
	private LocalDate date;
	
	@SuppressWarnings("deprecation")
	public Operation(double amount, Card card) throws ExcepcionCustom{
		if(this.amount<0) {
			throw new ExcepcionCustom("Invalid amount");
		}
		this.amount=amount;
		this.card=card;
		java.util.Date currentDate = new java.util.Date(); //Current system Date
		this.setDate(LocalDate.of((currentDate.getYear()+1900), currentDate.getMonth()+1, currentDate.getDate()));
	}
	public boolean itsValid() {
		if(this.amount<1000.0) {
			System.out.println("The operation is valid");
			return true;
		}else {
			System.out.println("The operation is invalid");
			return false;
		}
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
