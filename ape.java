class Ape{
	private int hands;
	private int legs;

	public Ape(){

	}
	public Ape(int h,int l){
		hands =h;
		legs = l;
	}
	public int getLegs(){
		return legs;
	}

	public int getHands(){
		return hands;
	}

	public void setHands(int h) {
		if(h>=0 && h<=2)
		hands = h;
	}
 
	public void setLegs(int l) {
		if(l>=0 && l<=2)
		legs = l;
	}
}
class Human extends Ape{
	private String name;

	public Human(){
		super();
	}
	public Human(String str,int h,int l)
	{
		super(h,l);
		name = str;
	}

	public String getName(){
		return name;
	}

	public void setName(String str){
		name = str;
	}

	public int  getHands()
	{
		return super.getHands() + 1; 
	}
	public int getHands()
	{
		return super.getHands();
	}
}

public class ape{

	public static void main(String[] args){
		Human a = new Human("human" , 2,2);
		// System.out.println( a.getName()+ "has "  + a.getHands() + " hands " + a.getLegs() + " legs");
		System.out.println("hands " + a.getHands());
	}
}	