import java.util.TreeSet;

public class T8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> t=new TreeSet<String>();
        
        t.add("BLACK ");
        t.add("GREEN ");
        t.add("ORANGE ");
        t.add("RED ");
        t.add("WHITE ");
        
        System.out.println("TREESET 1 : "+t);
        TreeSet<String> t2=new TreeSet<String>();
        
        t2.add("BLACK ");
        t2.add("YELLOW ");
        t2.add("ORANGE ");
        t2.add("VOILET ");
        t2.add("RED ");
        
        System.out.println("TREESET 2 : "+t2);
        
        for(String s: t){
        	if(t2.contains(s))
        	   {
        		System.out.println("yes");
        	   }
        	else{
        	System.out.println("no");
        	  }
        }
	}

}
