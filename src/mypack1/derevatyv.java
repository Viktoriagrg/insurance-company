package mypack1;

import java.io.Serializable;
import java.util.ArrayList;
public class derevatyv implements Comparable<derevatyv>, Serializable{
	protected String agency;
	protected int years;
	protected int quantityOfClients;
	protected float Budget;
	protected float SumBeenPaid;//по всіх документах
	protected float SumMustPay;//аналогічно
	protected float averrisk;
	public derevatyv(ArrayList<StrahoviyDoc> a, String w, int yea,float denga) {
		this.agency = w;
		this.quantityOfClients = unique(a,w);
		this.SumBeenPaid = summa(a,0,w);
		this.SumMustPay = summa(a,2,w);
		this.averrisk = summa(a,1,w);
		this.years = yea;
		this.Budget = denga;
	}
	public int unique(ArrayList<StrahoviyDoc> a, String agen) {
		ArrayList <String> h = new ArrayList <String>();
		for(int i = 0;i<a.size();i++) {
			if(a.get(i).agent.compareTo(agen)==0) {
				if(!(h.contains(a.get(i).subject))){
					h.add(a.get(i).subject);
				}
			}
		}
		return h.size();
	}
	public float summa(ArrayList<StrahoviyDoc> a, int q, String w) {
		float s = 0;
		if(q==0) {
			for(int i = 0;i<a.size();i++) {
				if(a.get(i).agent.compareTo(w)==0) {
					s+=a.get(i).SumBeenPaid;
				}
			}
		}
		else if(q==1) {
			int k =0;
			for(int i = 0;i<a.size();i++) {
				if(a.get(i).agent.compareTo(w)==0) {
					k++;
					s+=(float)(a.get(i).TypeOfInsuranceRisk)/100;
				}
			}
			s=s/k;
		}
		else {
			for(int i = 0;i<a.size();i++) {
				if(a.get(i).agent.compareTo(w)==0) {
					s+=a.get(i).SumMustPay;
				}
			}
		}
		return s;
	}
	public int compareTo(derevatyv a)
    {
        if (this.averrisk == a.averrisk) {
            return 0;
        } else if (this.averrisk > a.averrisk) {
            return -1;
        } else {
            return 1;
        }
    }
	public void searchagency(String name) {
		if(this.agency==name) printy();
	}
	public void searchbtwquntcl(int a, int b) {
		if((this.quantityOfClients>=a) && (this.quantityOfClients<=b)) printy();
	}
	public void searchbtwyear(int a, int b) {
		if((this.years>=a) && (this.years<=b)) printy();
	}
	public void btwrisk(float a, float b) {
		if((this.averrisk>=a) && (this.averrisk<=b)) printy();
	}
	public void btwbud(float a, float b) {
		
		if((this.Budget>=a) && (this.Budget<=b)) printy();
		
	}
	public void btwsum(float a, float b, int num) {
		if(num == 1) {
			if((this.SumBeenPaid>=a) && (this.SumBeenPaid<=b)) printy();
		}
		else {
			if((this.SumMustPay>=a) && (this.SumMustPay<=b)) printy();
		}
	}
	public void printy() {
		if(this!=null) {
			System.out.println("Agency: "+this.agency);
			System.out.println("Years of service: "+this.years);
			System.out.println("Quantity Of Clients: "+this.quantityOfClients);
			System.out.println("Budget: "+this.Budget);
			System.out.println("Sum Must Pay: "+this.SumMustPay);
			System.out.println("Sum Been Paid: "+this.SumBeenPaid);
			System.out.println("Avarage risk: "+this.averrisk);
			System.out.println();
		}
	}
}
