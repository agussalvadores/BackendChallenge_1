import java.time.LocalDate;

public abstract class Card {
	private String brand;
	private String number;
	private String cardholder;
	private LocalDate date;
	
	public Card(String brand, String number, String cardholder, int month, int year) throws ExcepcionCustom {
		this.brand=brand;
		if(number.length()!=16) {
			throw new ExcepcionCustom("Invalid card number");
		}
		this.number=number;
		this.cardholder=cardholder;
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) { //months with 31 days
			this.date = LocalDate.of(year+2000, month,31);
		}else {
			if(month==2) { //February
				if((year%4)==0) { // leap year
					this.date = LocalDate.of(year+2000, month,29);
				}else { //not lap year
					this.date = LocalDate.of(year+2000, month,28);
				}
			}else {  //months with 30 days
				this.date = LocalDate.of(year+2000, month,30);
			}
		}
	}
	public abstract double calculeRate(Operation op); //each brand calculates differently
	
	public boolean itsValid() { 
		java.util.Date currentDate = new java.util.Date(); //Current system Date
		
		@SuppressWarnings("deprecation")
		LocalDate currentLocalDate = LocalDate.of((currentDate.getYear()+1900), currentDate.getMonth()+1, currentDate.getDate()); //
		if( this.date.compareTo(currentLocalDate) > 0) {
			System.out.println("This Card is valid");
			return true;
		}else {
			System.out.println("This Card isn't valid (Card expired)");
			return false;
		}
	}
	public boolean equals(Card card) {
		if(!this.brand.equals(card.brand)) {
			System.out.println("The cards aren't the same");
			return false;
		}else {
			if(!this.number.equals(card.number)) {
				System.out.println("The cards aren't the same");
				return false;
			}else {
				if(!this.cardholder.equals(card.cardholder)) {
					System.out.println("The cards aren't the same");
					return false;
				}else {
					if(this.date.compareTo(card.getDate())!=0) {
						System.out.println("The cards aren't the same");
						return false;
					}else {
						System.out.println("The cards are the same");
						return true;
					}
				}
			}
		}
	}
	public Card getInformation() {
		System.out.println("Brand: "+this.brand);
		System.out.println("Number: "+this.number);
		System.out.println("Cardholder: "+this.cardholder);
		System.out.println("Expiration Month: "+this.date.getMonthValue());
		System.out.println("Expiration Year: "+(this.date.getYear()-2000));
		return this;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
