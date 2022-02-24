
public class NARA extends Card{

	public NARA(String brand, String number, String cardholder, int month, int year) throws ExcepcionCustom {
		super(brand, number, cardholder, month, year);
	}
	
	public double calculeRate(Operation op) {
		double rate= op.getDate().getDayOfMonth() * 0.5;
		double value = (rate*0.01) * op.getAmount();
		System.out.println("Brand: "+ this.getBrand()+" Starting amount: "+op.getAmount()+" Rate percentage: "+ rate + " Rate Value: " +value+" Total: " +(value+op.getAmount()));
		return value;
	}
}
