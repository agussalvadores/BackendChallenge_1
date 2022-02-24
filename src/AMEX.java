
public class AMEX extends Card{
	
	public AMEX(String brand, String number, String cardholder, int month, int year) throws ExcepcionCustom {
		super(brand, number, cardholder, month, year);
	}
	public double calculeRate(Operation op) {
		double rate= op.getDate().getMonthValue() * 0.1;
		double value = (rate*0.01) * op.getAmount();
		System.out.println("Brand: "+ this.getBrand()+"Starting amount: "+op.getAmount()+" Rate percentage: "+ rate + " Rate Value: " +value +" Total: " +(value+op.getAmount()));
		return value;
	}
}
