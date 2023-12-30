package mypack1;

public class VIPclient extends Client{
	protected float increasing;
	protected String TypeOfVIP;
	public VIPclient(String surname, String name, String address, float inc, String Ty) {
		super(surname, name, address);
		this.increasing = inc;
		this.TypeOfVIP = Ty;
	}
	public VIPclient(Client c,float inc, String Ty) {
		super(c.Surname, c.Name, c.getAddress());
		this.increasing = inc;
		this.TypeOfVIP = Ty;
	}
	public float iu() {
		return this.increasing;
	}
	public void printy() {
		if (this !=null){
			System.out.println("ID: "+this.IDnum);
			System.out.println("PIB: "+this.Surname+"  "+this.Name);
			System.out.println("Address: "+this.Address);
			System.out.println("Date of Birth: "+this.birth);
			System.out.println("Password: "+this.password);
			System.out.println("VIP type: "+this.TypeOfVIP);
			System.out.println("increasing: "+this.increasing);
			System.out.println();
		}
		
	}
}
