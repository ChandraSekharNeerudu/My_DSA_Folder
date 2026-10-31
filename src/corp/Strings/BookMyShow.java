package corp.Strings;
class InvalidDetailsException extends RuntimeException{
	public InvalidDetailsException(String str)
	{
		super(str);
	}
}
interface Movie{
	String M_NAME="RRR";
	int PRICE=250;
}
abstract class Theatre{
	private String Mname;
	private int price;
	public abstract void Display(String Mname,int price);
	public Theatre() {
		
	}
	public Theatre(String Mname,int price)
	{
		this.Mname=Mname;
		this.price=price;
	}
	public String getMname() {
		return Mname;
	}
	public int getPrice()
	{
		return price;
	}
}
public class BookMyShow extends Theatre {

	public BookMyShow(String Mname, int price) {
		super(Mname, price);
	}
	public BookMyShow() {
		super();
	}

	@Override
	public void Display(String Mname,int price) {
		if(Mname.equalsIgnoreCase(Movie.M_NAME)&&price==Movie.PRICE)
		{
			System.out.println("Ticket Booked Succefully "+Movie.M_NAME+":"+Movie.PRICE);		
		}
		else throw new InvalidDetailsException("invalid details");
	}
	
	void main() {
		BookMyShow obj=new BookMyShow("rrr",240);
		obj.Display(obj.getMname(), obj.getPrice());
	}

}
