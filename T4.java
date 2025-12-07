import java.util.TreeSet;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> t2=new TreeSet<String>();
        
        t2.add("BLUE ");
        t2.add("YELLOW ");
        t2.add("GREY ");
        t2.add("VOILET ");
        t2.add("COFFEE ");
        
        System.out.println("TREESET 2 : "+t2);
        
       
        for(String s: t2.descendingSet()){
        	System.out.println(s);
        }
        

    
	}

}
