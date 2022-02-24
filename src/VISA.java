
public class VISA extends Card {

	public VISA(String brand, String number, String cardholder, int month, int year) throws ExcepcionCustom{
		super(brand, number, cardholder, month, year);
	}
	public double calculeRate(Operation op) {
		double rate= (op.getDate().getYear() - 2000) / op.getDate().getMonthValue();
		double value = (rate*0.01) * op.getAmount();
		System.out.println("Brand: "+ this.getBrand()+" Starting amount: "+op.getAmount()+" Rate percentage: "+ rate + " Rate Value: " +value+" Total: " +(value+op.getAmount()));
		return value;
	}
}
