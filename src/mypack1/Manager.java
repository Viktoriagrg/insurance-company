package mypack1;

import java.security.SecureRandom;

public class Manager extends Human {
	public String Agency;
	protected String Department;
	protected int QuantityOfDeals;
	protected int YearsOfSetvice;
	public Manager(String surname, String name, String address, Orzanization org, int quantityOfDeals, int yearsOfSetvice) {//перший конструктор для працівника зі стажем
		this.phoneNum = generateRandomnum(10);
		this.Surname = surname;
		this.Name = name;
		this.Address = address;
		this.Agency = org.Title;
		int i = (int) (Math.random()*(org.Departments.size()-0)+0);
		this.Department = org.Departments.get(i);
		this.QuantityOfDeals = quantityOfDeals;
		this.YearsOfSetvice = yearsOfSetvice;
	}
	public Manager(String surname, String name, String address, Orzanization org) {//другий конструктор для новачка
		this.phoneNum = generateRandomnum(10);
		this.Surname = surname;
		this.Name = name;
		this.Address = address;
		this.Agency = org.Title;
		int i = (int) (Math.random()*(org.Departments.size()-0)+0);
		this.Department = org.Departments.get(i);
		this.QuantityOfDeals = 0;
		this.YearsOfSetvice = 0;
	}
	
	protected void ChangeDepart(String Depart){//зміна відділу
		this.Department = Depart;
	}
	protected void Addyear() {//плюс рік стажу
		this.YearsOfSetvice++;
	}
	protected void Adddeal() {//плюс угода
		this.QuantityOfDeals++;
	}
	protected void changeADR(String shoto) {//зміна адреси виклик із батьківського класу
		super.changeAddress(shoto);
	}
	protected void changeMOB(String shoto) {//зміна номеру виклик із батьківського класу
		super.changePhoneNum(shoto);
	}
	public String getAddress1() {//видача адреси виклик із батьківського класу
		return super.getAddress();
	}
	public String getPhoneNum1() {//видача номеру виклик із батьківського класу
		return super.getPhoneNum();
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
	public void printy() {
		if (this !=null){
			System.out.println("Agency: "+this.Agency);
			System.out.println("PIB: "+this.Surname+"  "+this.Name);
			System.out.println("Address: "+this.Address);
			System.out.println("Department: "+this.Department);
			System.out.println("Phone number: "+this.phoneNum);
			System.out.println();
		}
		
	}
}
