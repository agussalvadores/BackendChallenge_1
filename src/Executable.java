
public class Executable {

	public static void main(String[] args) {
		
		try {
		VISA card1= new VISA("VISA","1234567891238888","JUAN PEREZ",12,26);
		VISA card2= new VISA("VISA","1234567891234567","JUAN PEREZ",12,26);
		NARA card3= new NARA("NARA","9876543219876543","MANUEL GARCIA",1,22);
		AMEX card4= new AMEX("AMEX","1234567899876543","PEDRO FERNANDEZ",2,22);
		
		Operation operation1= new Operation(800.75,card1);
		Operation operation2= new Operation(1300.75,card3);
		
		card1.getInformation();
		operation1.itsValid();
		operation2.itsValid();
		card1.itsValid();
		card3.itsValid();
		card1.equals(card2);
		card1.equals(card3);
		card1.equals(card4);
		card1.calculeRate(operation2);
		card3.calculeRate(operation2);
		card4.calculeRate(operation2);
		}
		catch(ExcepcionCustom e){
			
		}
		
	}

}
