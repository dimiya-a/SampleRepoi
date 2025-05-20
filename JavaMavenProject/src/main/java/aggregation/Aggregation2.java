package aggregation;

public class Aggregation2 {
	
	String authname ;
	int bookprice;
	Aggregation1 ref;

	public Aggregation2(String authname ,int bookprice ,Aggregation1 ref) {
		// TODO Auto-generated constructor stub
		this.authname=authname;
		this.bookprice =bookprice;
		this.ref=ref;
	}
	
	public void display() {
		
		System.out.println(ref.bookname +" "+ref.bookid);
		System.out.println(authname +" " +bookprice) ;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj1 = new Aggregation1("SherlockHolmes",3413);
		Aggregation2 obj2 = new Aggregation2("Aurther",200,obj1);
		obj2.display();
	

}
}
