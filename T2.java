import java.util.TreeSet;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> t=new TreeSet<String>();
        
        t.add("BLACK ");
        t.add("GREEN ");
        t.add("ORANGE ");
        t.add("RED ");
        t.add("WHITE ");
        
        for(String line: t){
        	System.out.println(line);
        }
	}

}
