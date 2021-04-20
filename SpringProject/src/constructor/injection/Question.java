package constructor.injection;

import java.util.Iterator;
import java.util.List;

public class Question {
	int id;
	String name;
	List<String> answers;
	
	
	Question(){}
	Question(int id,String name,List<String> answers){
		super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	
}
