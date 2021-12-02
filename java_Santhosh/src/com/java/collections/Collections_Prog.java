package com.java.collections;

import java.util.*;  
class Collections_Prog{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>(); 
list.add("Santhosh");   
list.add("Raj");  
list.add("vysyaraju");  
list.add("Vizag");  
 
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
