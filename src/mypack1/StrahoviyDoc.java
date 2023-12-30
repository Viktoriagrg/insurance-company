package mypack1;

import java.io.Serializable;

public class StrahoviyDoc implements Serializable{
	private String DocID;
	protected String object;
	protected String subject;
	protected String agent;
	protected float SumBeenPaid;
	protected float SumMustPay;
	protected int TypeOfInsuranceRisk;
	
	public StrahoviyDoc(Money hr, Client c, Manager m, String ob) {
		this.DocID = hr.idbase();
		this.object =  ob;
		this.subject = c.PIB();
		this.agent = m.Agency;
		this.SumBeenPaid = hr.sumBeenPaid;
		this.SumMustPay = hr.SumMustPay;
		this.TypeOfInsuranceRisk  = hr.TypeOfRisk;
	}
	
	public void printy() {
		if(this!=null) {
			System.out.println("DOC ID: "+this.DocID);
			System.out.println("Object: "+this.object);
			System.out.println("Subject: "+this.subject);
			System.out.println("Agency: "+this.agent);
			System.out.println("Sum Must Pay: "+this.SumMustPay);
			System.out.println("Sum Been Paid: "+this.SumBeenPaid);
			System.out.println("TypeOfInsuranceRisk: "+this.TypeOfInsuranceRisk);
			System.out.println();
		}
	}
}
