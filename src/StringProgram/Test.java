package StringProgram;

import java.util.*;
import java.util.Map.Entry;






public class Test {

	public static void main(String[] args) {
		
        
        String str = "I Love java";
        
        findDuplicate(str);
        System.out.println("Try programiz.pro");
	
		
		
	     }
	
    public static void findDuplicate(String s){
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
        if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i), map.get(s.charAt(i))+1);
        }
        else{
            map.put(s.charAt(i),1);
        }
        }
        
        for(Map.Entry<Character, Integer> en : map.entrySet()){
           if(en.getValue()>1)
            System.out.println(en.getKey()+ " "+ en.getValue());
        }
        
    }

	}


