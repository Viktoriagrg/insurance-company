package mypack1;
import java.io.Serializable;
import java.util.ArrayList;

public class Orzanization implements Serializable{
	public String Title;
	protected ArrayList <String> Departments;
	private float Budget;
	protected int YearsOfService;
	public Orzanization(String title, ArrayList <String> departments, float b, int y) {
		this.Title = title;
		this.Departments = new ArrayList<String>();
		this.Departments = departments;
		this.Budget = b;
		this.YearsOfService = y;
	}
	protected void changeTitle(String h) {
		this.Title = h;
	}
	protected void AddDep(String h) {
		if(this.Departments.contains(h)==false) {
			this.Departments.add(h);
		}
		
	}
	protected void changeBud(float sum) {
		this.Budget += sum; 
	}
	protected void plusyear() {
		this.YearsOfService++;
	}
	public int goda() {
		return this.YearsOfService;
	}
	public float groshyky() {
		return this.Budget;
	}
	public void printy() {
		if (this !=null){
			System.out.println("Title: "+this.Title);
			for(int i = 0; i<this.Departments.size();i++) {
				System.out.println("Department: "+this.Departments.get(i));
			}
			System.out.println("Budget: "+this.Budget);
			System.out.println("Years Of Service: "+this.YearsOfService);
			System.out.println();
		}
		
	}
}
