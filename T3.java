import java.util.TreeSet;

public class T3 {

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
        
        t2.add("BLUE ");
        t2.add("YELLOW ");
        t2.add("GREY ");
        t2.add("VOILET ");
        t2.add("COFFEE ");
        
        System.out.println("TREESET 2 : "+t2);
        
        t.addAll(t2);
        System.out.println("\n NEW TREESET : "+t);
        
	}

}
