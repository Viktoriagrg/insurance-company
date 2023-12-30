package mypack2;
import java.security.SecureRandom;
import java.util.*;
import java.io.*;
import mypack1.Client;
import mypack1.Manager;
import mypack1.Money;
import mypack1.Orzanization;
import mypack1.StrahoviyDoc;
import mypack1.VIPclient;
import mypack1.derevatyv;

public class UNIT {
	public static void main(String []args) throws FileNotFoundException {
		
		
		int quant1 = 10;
		Map<Integer,Orzanization> w = new HashMap<Integer,Orzanization> ();
		w = org(quant1);
		EX2 l = new EX2();
		EX1 x = new EX1();
		l.perevirka1(w);
		w.clear();
		int quant2 = 40;
		Map<Integer,Manager> mm = new HashMap<Integer,Manager> ();
		w = x.reading1();
		mm = man(quant2,w);
		l.perevirka3(mm);
		mm.clear();
		w.clear();
		
		int quant3 = 200;
		Map<Integer,Client> c = new HashMap<Integer,Client> ();
		c = cl(quant3);
		l.perevirka2(c);
		c.clear();
		int quant4 = quant3/5;
		Map<Integer,Client> vip = new HashMap<Integer,Client>();
		Map<Integer,VIPclient> vc = new HashMap<Integer,VIPclient>();
		int k =0;
		c = x.reading2();
		for(int i = 0;i<quant3;i++) {
			if(i%5==0) {
				vip.put(k,c.get(i));
				k++;
			}
		}
		c.clear();
		vc = vcl(vip);
		vip.clear();
		l.perevirka4(vc);
		vc.clear();
		int quant5 = 500;
		Map<Integer,StrahoviyDoc> mas = new HashMap<Integer,StrahoviyDoc>();
		Map<Integer,Money>mon=new HashMap<Integer,Money>();
		c = x.reading2();
		vc = x.reading4();
		mm = x.reading3();
		mon = mon(quant5, mas, c, vc, mm);
		l.perevirka5(mon);
		c.clear();
		vc.clear();
		mm.clear();
		ArrayList<StrahoviyDoc> a = new ArrayList<StrahoviyDoc>();
		ArrayList<String> agentstvo = new ArrayList<String>();
		ArrayList<Integer> years = new ArrayList<Integer>();
		ArrayList<Float> budget = new ArrayList<Float>();
		for(int i = 0; i < quant5; i++) {
			a.add(mas.get(i));
		}
		l.perevirka6(mas);
		mas.clear();
		w = x.reading1();
		for(int i = 0; i < quant1; i++) {
			agentstvo.add(w.get(i).Title);
			years.add(w.get(i).goda());
			budget.add(w.get(i).groshyky());
		}
		w.clear();
		Map<Integer,derevatyv> b = new HashMap<Integer,derevatyv>();
		TreeSet<derevatyv> myderevatyv = new TreeSet<derevatyv>();
		b = derevoyiba(a, agentstvo,years,budget);
		for(int i = 0; i < agentstvo.size(); i++) {
			myderevatyv.add(b.get(i));
		}
		b.clear();
		l.perevirka7(myderevatyv);
		myderevatyv.clear();
		Scanner sc = new Scanner(System.in);//створюємо об'єкт класу сканер для зчитування даних
		int q=1;
		while(q!=0) {
			menu();
			q=sc.nextInt();
			switch(q) {
			case 1:
				w = x.reading1();
				System.out.println();
				System.out.println("List of Organizations: ");
				System.out.println();
				for(int i=0; i<quant1;i++) {
					w.get(i).printy();
				}
				w.clear();
				break;
			case 2:
				c = x.reading2();
				System.out.println();
				System.out.println("List of Clients: ");
				System.out.println();
				for(int i=0; i<quant3;i++) {
					c.get(i).printy();
				}
				c.clear();
				break;
				
			case 3:
				mm = x.reading3();
				System.out.println();
				System.out.println("List of Managers: ");
				System.out.println();
				for(int i=0; i<quant2;i++) {
					mm.get(i).printy();
				}
				mm.clear();
				break;
			case 4:
				vc = x.reading4();
				System.out.println();
				System.out.println("List of VIP-Clients: ");
				System.out.println();
				for(int i=0; i<quant3/5;i++) {
					vc.get(i).printy();
				}
				vc.clear();
				break;
			case 5:
				mon = x.reading5();
				System.out.println();
				System.out.println("List of Money: ");
				System.out.println();
				for(int i=0; i<quant5;i++) {
					mon.get(i).printy();
				}
				mon.clear();
				break;
			case 6:
				mas = x.reading6();
				System.out.println();
				System.out.println("List of Documents: ");
				System.out.println();
				for(int i=0; i<quant5;i++) {
					mas.get(i).printy();
				}
				mas.clear();
				break;
			case 7:
				myderevatyv = x.reading7();
				System.out.println();
				System.out.println("Sorted Derevatyv: ");
				System.out.println();
				System.out.println();
				for (derevatyv h: myderevatyv) {
		            h.printy();
		        }
				myderevatyv.clear();
				break;
			case 8:
				myderevatyv = x.reading7();
				for (derevatyv h: myderevatyv) {
		            h.btwbud(25000, 40000);
		        }
				myderevatyv.clear();
				break;
			case 9:
				myderevatyv = x.reading7();
				for (derevatyv h: myderevatyv) {
		            h.searchbtwquntcl(40, 50);
		        }
				myderevatyv.clear();
				break;
			case 10:
				myderevatyv = x.reading7();
				for (derevatyv h: myderevatyv) {
		            h.searchbtwyear(2, 6);
		        }
				myderevatyv.clear();
				break;
			default:
				q=0;
				break;
			}
			
		}
	}
	public static void menu() {
		System.out.println("Введіть 1 для виводу Організацій та інформації про них");
		System.out.println("Введіть 2 для виводу Клієнтів та інформації про них");
		System.out.println("Введіть 3 для виводу Менеджерів та інформації про них");
		System.out.println("Введіть 4 для виводу ВІП клієнтів та інформації про них");
		System.out.println("Введіть 5 для виводу Грошових транзакцій та інформації про них");
		System.out.println("Введіть 6 для виводу Документів та інформації про них");
		System.out.println("Введіть 7 для виводу відсортованого деревативу");
		System.out.println("Введіть 8 для пошуку організацій з бюджетом між 25000 і 40000");
		System.out.println("Введіть 9 для пошуку організацій з кількістю клієнтів від 40 до 50");
		System.out.println("Введіть 10 для пошуку організацій з досвідом роботи від 2 до 6 років");
	}
	public static Map<Integer,Orzanization> org(int quantity) {
		Map<Integer,Orzanization>w=new HashMap<Integer,Orzanization>();
		for(int i = 0;i<quantity;i++) {
			ArrayList<String> dep=new ArrayList<String>();
			int k = (int)(Math.random()*10+2);
			for(int j = 0; j < k; j++) {
				dep.add(generateRandomnab(12));
			}
			w.put(i, new Orzanization(generateRandomnab(8), dep, (float)Math.random()*100000+1000, (int)(Math.random()*10+1)));
		}
		return w;
	}
	public static Map<Integer,Client> cl(int quantity) {
		Map<Integer,Client> c = new HashMap<Integer,Client> ();
		for(int i = 0;i<quantity;i++) {
			c.put(i,new Client(generateRandomnab((int)Math.random()*10+10),generateRandomnab((int)Math.random()*5+6),generateRandomnab((int)Math.random()*14+40)));
		}
		return c;
	}
	public static Map<Integer,Manager> man(int quantity, Map<Integer,Orzanization> or) {
		Map<Integer,Manager> mm = new HashMap<Integer,Manager> ();
		int k=0;
		for(int i = 0;i<quantity;i++) {
			mm.put(i,new Manager(generateRandomnab((int)Math.random()*10+10),generateRandomnab((int)Math.random()*5+6),generateRandomnab((int)Math.random()*14+40),or.get(k),(int)Math.random()*5+20,(int)Math.random()*5+6));
			k++;
			if(k>=or.size())k=0;
		}
		return mm;
	}
	public static Map<Integer,VIPclient> vcl(Map<Integer,Client> a) {
		Map<Integer,VIPclient> vc = new HashMap<Integer,VIPclient>();
		int randnum;
		for(int i = 0; i < a.size(); i++) {
			randnum = (int)(Math.random()*(5-1)+1);
			switch(randnum) {
				case 1:
					vc.put(i, new VIPclient(a.get(i),(float)1.0,"iron"));
					break;
				case 2:
					vc.put(i, new VIPclient(a.get(i),(float)2.5,"copper"));
					break;
				case 3:
					vc.put(i, new VIPclient(a.get(i),(float)3.5,"silver"));
					break;
				case 4:
					vc.put(i, new VIPclient(a.get(i),(float)5.0,"gold"));
					break;
				case 5:
					vc.put(i, new VIPclient(a.get(i),(float)10.0,"platinum"));
					break;
				default: break;
			}
		}
		return vc;
	}
	public static Map<Integer,Money>mon(int quantity, Map<Integer,StrahoviyDoc>mas,Map<Integer,Client>cl,Map<Integer,VIPclient>vip,Map<Integer,Manager>man){
		Map<Integer,Money>m=new HashMap<Integer,Money>();
		int randnum1, randnum2, randnum3, type;
		float inc, paid;
		ArrayList<VIPclient> list = new ArrayList<VIPclient>();
		for(int i = 0; i < vip.size(); i++) {
			list.add(vip.get(i));
		}
		for(int i = 0; i < quantity; i++) {
			randnum1 = (int)(Math.random()*cl.size());
			randnum2 = (int)(Math.random()*man.size());
			randnum3 = (int)(Math.random()*(20-6)+6);
			type = (int)(Math.random()*(8-1)+1);
			paid =(float)(Math.random()*(100000-1000)+1000);
			int k=-1;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(j).getAddress1()==cl.get(j).getAddress1()) {
					k = j;
					j=list.size();
				}
			}
			if(k>=0) {
				inc = 1 + (float)(0.01*(list.get(k).iu()));
			}
			else {
				inc = 1;
			}
			m.put(i, new Money(paid, type, inc)) ;
			mas.put(i, new StrahoviyDoc(m.get(i),cl.get(randnum1),man.get(randnum2),generateRandomnab(randnum3))) ;
		}
		return m;
	}
	public static Map<Integer,derevatyv> derevoyiba(ArrayList<StrahoviyDoc> a, ArrayList<String> agentstvo,ArrayList<Integer> yea,ArrayList<Float> grosh) {
		Map<Integer,derevatyv> b = new HashMap<Integer,derevatyv>();
		for(int i = 0; i < agentstvo.size(); i++) {
			b.put(i, new derevatyv(a, agentstvo.get(i),yea.get(i), grosh.get(i)));
		}
		return b;
	}
	public static String generateRandomnab(int len){
	    final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    SecureRandom random = new SecureRandom();
	    StringBuilder sb = new StringBuilder();
	    // кожна ітерація випадково обирає символ із заданого діапазона і додає його до `StringBuilder`
	    for (int i = 0; i < len; i++){
	        int randomIndex = random.nextInt(chars.length());
	        sb.append(chars.charAt(randomIndex));
	    }
	    return sb.toString();
	}
}
