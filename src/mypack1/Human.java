package mypack1;
import java.io.*;
public abstract class Human implements Serializable {//абстрактний клас
	protected String phoneNum;//номер телефону
	protected String Surname;
	protected String Name;
	protected String Address;
	public String PIB() {
		String pib = Name+' '+Surname;
		return pib;
	}
	public String getAddress() {
		return Address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	protected void changePhoneNum(String NewNum) {
		this.phoneNum = NewNum;
		return;
	}
	protected void changeAddress(String NewAddress) {
		this.Address = NewAddress;
		return;
	}
}

