package mypack2;
import java.io.*;
import java.util.*;

import mypack1.Client;
import mypack1.Manager;
import mypack1.Money;
import mypack1.Orzanization;
import mypack1.StrahoviyDoc;
import mypack1.VIPclient;
import mypack1.derevatyv;

public class EX1 {
	public Map<Integer,Orzanization> reading1() throws FileNotFoundException {
		Map<Integer,Orzanization> newOrg= new HashMap<Integer,Orzanization>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("organization.dat")))
        {
        	newOrg=((HashMap<Integer,Orzanization>)ois.readObject());
        }
        catch(Exception ex){
              
            System.out.println(ex.getMessage());
        }
		return newOrg;
		
	}
	public Map<Integer,Client> reading2() throws FileNotFoundException {
		Map<Integer,Client> newCL= new HashMap<Integer,Client>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("client.dat")))
        {
        	newCL=((HashMap<Integer,Client>)ois.readObject());
        }
        catch(Exception ex){
              
            System.out.println(ex.getMessage());
        }
		return newCL;
		
	}
	
	public Map<Integer,Manager> reading3() throws FileNotFoundException {
		Map<Integer,Manager> newCL= new HashMap<Integer,Manager>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("manager.dat")))
        {
        	newCL=((HashMap<Integer,Manager>)ois.readObject());
        }
        catch(Exception ex){
              
            System.out.println(ex.getMessage());
        }
		return newCL;
		
	}
	
	public Map<Integer,VIPclient> reading4() throws FileNotFoundException {
		Map<Integer,VIPclient> newCL= new HashMap<Integer,VIPclient>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vipclient.dat")))
        {
        	newCL=((HashMap<Integer,VIPclient>)ois.readObject());
        }
        catch(Exception ex){
              
            System.out.println(ex.getMessage());
        }
		return newCL;
		
	}
	
	public Map<Integer,Money> reading5() throws FileNotFoundException {
		Map<Integer,Money> newCL= new HashMap<Integer,Money>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("money.dat")))
        {
        	newCL=((HashMap<Integer,Money>)ois.readObject());
        }
        catch(Exception ex){
              
            System.out.println(ex.getMessage());
        }
		return newCL;
		
	}
	
	public Map<Integer,StrahoviyDoc> reading6() throws FileNotFoundException {
		Map<Integer,StrahoviyDoc> newCL= new HashMap<Integer,StrahoviyDoc>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("strahoviydoc.dat")))
        {
        	newCL=((HashMap<Integer,StrahoviyDoc>)ois.readObject());
        }
        catch(Exception ex){
              
            System.out.println(ex.getMessage());
        }
		return newCL;
		
	}
	
	public TreeSet<derevatyv> reading7() throws FileNotFoundException {
		TreeSet<derevatyv> newCL= new TreeSet<derevatyv>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("derevatyv.dat")))
        {
        	newCL=((TreeSet<derevatyv>)ois.readObject());
        }
        catch(Exception ex){
              
            System.out.println(ex.getMessage());
        }
		return newCL;
		
	}
}
