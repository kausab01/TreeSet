import java.util.TreeSet;

public class T10 {

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
	     
	     System.out.println(t1);
	     int a=86;
	     int b=29;
	     Integer result=t1.floor(a);
	     Integer Result=t1.floor(b);
	     
	    if(result!=null) {
	    	System.out.println("Less than or equal to "+a+" : "+result);
	    }
	    else {
	    	System.out.println("nah");
	    }
	    	if(Result!=null){
		    	System.out.println("Less than or equal to "+b+" : "+Result);	
		    }
		    else {
		    	System.out.println("nah");
		    }
	}

}
