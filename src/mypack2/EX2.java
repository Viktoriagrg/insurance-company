package mypack2;
import mypack1.Client;
import mypack1.Manager;
import mypack1.Money;
import mypack1.Orzanization;
import mypack1.StrahoviyDoc;
import mypack1.VIPclient;
import mypack1.derevatyv;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeSet;
class MyException extends Exception {}
public class EX2 {

	public void perevirka1(Map<Integer,Orzanization> k) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("organization.dat")))
        {
            oos.writeObject(k);
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 

	}
	public void perevirka2(Map<Integer,Client> k) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("client.dat")))
        {
            oos.writeObject(k);
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 

	}
	public void perevirka3(Map<Integer,Manager> k) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("manager.dat")))
        {
            oos.writeObject(k);
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 

	}
	public void perevirka4(Map<Integer,VIPclient> k) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vipclient.dat")))
        {
            oos.writeObject(k);
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 

	}
	public void perevirka5(Map<Integer,Money> k) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("money.dat")))
        {
            oos.writeObject(k);
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 

	}
	public void perevirka6(Map<Integer,StrahoviyDoc> k) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("strahoviydoc.dat")))
        {
            oos.writeObject(k);
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 

	}
	public void perevirka7(TreeSet<derevatyv> k) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("derevatyv.dat")))
        {
            oos.writeObject(k);
        }
        catch(Exception ex){
             
            System.out.println(ex.getMessage());
        } 

	}
}
