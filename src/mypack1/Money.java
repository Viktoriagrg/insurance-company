package mypack1;

import java.io.Serializable;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Money implements Serializable{
	private String DocID;
	protected float sumBeenPaid;
	private LocalDate dateOfTransaction;
	protected float SumMustPay;
	private float increasing1;
	protected int TypeOfRisk;
	protected float probabilityOfDisaster;
	public Money(float paid, int type, float inc) {
		this.DocID = generateRandomnab(11);
		this.sumBeenPaid = paid;
		this.dateOfTransaction = datar();
		this.SumMustPay = type*10*paid*inc;
		this.TypeOfRisk = type;
		this.probabilityOfDisaster = ((float)type)/100;
		this.increasing1 = inc;
	}
	public Money(float paid, int type) {
		this.DocID = generateRandomnab(11);
		this.sumBeenPaid = paid;
		this.dateOfTransaction = datar();
		this.SumMustPay = type*10*paid;
		this.TypeOfRisk = type;
		this.probabilityOfDisaster = type/100;
		this.increasing1 = 1;
	}
	protected void changesum(int riski) {
		this.SumMustPay = this.sumBeenPaid*10*riski*this.increasing1;
		this.TypeOfRisk = riski;
		this.probabilityOfDisaster = riski/100;
	}
	private static String generateRandomnab(int len){
	    // Діапазон ASCII – буквено-числовий (0-9, a-z, A-Z)
	    final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    SecureRandom random = new SecureRandom();
	    StringBuilder sb = new StringBuilder();
	    // кожна ітерація випадково обирає символ із заданого діапазона і додає його до `StringBuilder`
	    for (int i = 0; i < len; i++){
	        int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
	    return sb.toString();
	}
	private static LocalDate datar() {//випадкова дата 
		long minDay = LocalDate.of(2013, 1, 1).toEpochDay();
	    long maxDay = LocalDate.of(2023, 3, 29).toEpochDay();
	    long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
	    LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
	    return randomDate;
	}
	protected String idbase() {
		return this.DocID;
	}
	public void printy() {
		if(this!=null) {
			System.out.println("DOC ID: "+this.DocID);
			System.out.println("Sum Been Paid: "+this.sumBeenPaid);
			System.out.println("Date Of Transaction: "+this.dateOfTransaction);
			System.out.println("Sum Must Pay: "+this.SumMustPay);
			System.out.println("increasing: "+this.increasing1);
			System.out.println("Type Of Risk: "+this.TypeOfRisk);
			System.out.println("Probability Of Disaster: "+this.probabilityOfDisaster);
			System.out.println();
		}
	}
}
