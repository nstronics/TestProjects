import java.util.ArrayList;
import java.util.List;

public class Java8TestMain {

	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  
	        list.add("one");  
	        list.add("two");  
	        list.add("three");  
	        list.add("four");  
	          
	       
	        list.forEach(  
	            (T)->System.out.println(T)  
	        );  
	        
	        MyAnimalInterface my = (lists, frequency) -> {
	        	System.out.println(lists);
	        };
	        my.cry(list, "50db");
	}

}
