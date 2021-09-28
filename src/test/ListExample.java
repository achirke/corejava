package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class ListExample {

	public static void main(String[] args, LinkedList<String> stack) {
		//ArrayList<E>o-generated method stub
		
		ArrayList<String> list = new ArrayList <String> ();
		
    list.add("Aman");
    list.add("Nisha");
    list.add("Bhavesh");
    list.add("Aman");
    
    System.out.println(list);
    System.out.println(list.get(2));
    for(int i=0;i<list.size();i++) {
    	System.out.println(list.get(i));
    	
    }
    Iterator <String> itr = list.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    	
    	
    }
    for(String data:list) {
    	System.out.println(data);
    }
    
  
    Collections.sort(list, Collections.reverseOrder());
    Collections.reverse(list);
    System.out.println(list);
    
    
    LinkedList<String> list1 = new LinkedList <String> ();
    
    list1.add("shubham");
    list1.add("ashvini");
    list1.add("tushar");
    
    list1.addFirst("raj");
    list1.addLast("ganesh");
    
    System.out.println(list1);
    
   
    Stack<String> Stack = new Stack <String> ();
    
    
    stack.push("name1");
    stack.push("name2");
    stack.pop();
    
    stack.push("name3");
    stack.push("name4");
    stack.pop();
    
    
    System.out.println(stack.peek());
    
     		

	}

}
