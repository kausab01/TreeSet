import java.util.TreeSet;

public class T12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     TreeSet<Integer> t1=new TreeSet<Integer>();
	     
	     t1.add(10);
	     t1.add(22);
	     t1.add(36);
	     t1.add(25);
	     t1.add(16);
	     t1.add(70);
	     t1.add(82);
	     t1.add(89);
	     t1.add(14);
	     
	     System.out.println("OG TREESET "+t1);
	     boolean a=t1.remove(70);
	     System.out.println("Removes 70 from the list: ");
	
	     System.out.println("after removing "+t1);
	}

}
