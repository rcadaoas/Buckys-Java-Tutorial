package bucky;

public class tuna {
	
	//Time Class
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s){
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
	}
	
	public String toMilitary()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	
	
	//multiple class
//	private String girlName;
//	
//	public tuna(String name){
//		girlName = name;
//	}
//	
//	public void setName(String name){
//		girlName = name;
//	}
//	public String getName(){
//		return girlName;
//	}
//	
//	public void saying(){
//		System.out.printf("Your first gf was %s", getName());
//		
//	}
//	
//	public void simpleMessage(String name){
//		System.out.println("Hello " + name);
//	}
	
//	public void simpleMessage()
//	{
//		System.out.println("This is another class");
//	}
}
