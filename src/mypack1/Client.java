package mypack1;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
public class Client extends Human{
	protected String IDnum;
	protected LocalDate birth;
	protected String password;
	
	protected void UpdID(String q) {
		this.IDnum = q;
	}
	
	protected void UpdPAS(String q) {
		this.password = q;
	}
	
	protected void changeADR(String shoto) {
		super.changeAddress(shoto);
	}
	
	protected void changeMOB(String shoto) {
		super.changePhoneNum(shoto);
	}
	
	public String getAddress1() {
		return super.getAddress();
	}
	
	public String getPhoneNum1() {
		return super.getPhoneNum();
	}
	
	public Client(String surname, String name, String address) {
		this.phoneNum = generateRandomnum(10);
		this.Surname = surname;
		this.Name = name;
		this.Address = address;
		this.IDnum = generateRandomnab(14);
		this.password = generateRandomnab(21);
		this.birth = datar();
	}
	private static String generateRandomnum(int len){
	    final String chars = "0123456789";
	    SecureRandom random = new SecureRandom();
	    StringBuilder sb = new StringBuilder();
	    // кожна ітерація випадково обирає символ із заданого діапазона і додає його до `StringBuilder`
	    for (int i = 0; i < len; i++){
	        int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
	    return sb.toString();
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
	private static LocalDate datar() {//випадкова дата народження
		long minDay = LocalDate.of(1900, 1, 1).toEpochDay();
	    long maxDay = LocalDate.of(2005, 3, 29).toEpochDay();
	    long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
	    LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
	    return randomDate;
	}
	public void printy() {
		if (this !=null){
			System.out.println("ID: "+this.IDnum);
			System.out.println("PIB: "+this.Surname+"  "+this.Name);
			System.out.println("Address: "+this.Address);
			System.out.println("Date of Birth: "+this.birth);
			System.out.println("Password: "+this.password);
			System.out.println();
		}
		
	}
}

