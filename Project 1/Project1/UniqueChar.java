import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter the sentence:");
		char line[]=sc.nextLine().toCharArray();
		UniqueChar ob = new UniqueChar();
		
		if(ob.isValid(line)==false){
		    System.out.println("Invalid Sentence");
		    System.exit(0);
		}
		boolean flag;
		String ret="";
		
		for(char ele : line){
		    System.out.println(ele);
		    flag=ob.isUnique(line, ele);
		    if(flag){
		      ret+=ele+"\n";
		      System.out.println(ele);
		    } 
		}
		
 		if(ret.length()>0) System.out.println("Unique characters:\n"+ret);
 		else System.out.println("No unique characters");
	}
	
	public boolean isUnique(char[] arr, char c){	    
	    for(char ele : arr){
	        if(c==ele) return false;
	    }
	    return true;
	}
	public boolean isValid(char arr[]){
	    for(char ele : arr){
	        if(Character.isLetter(ele)==false && ele!=' ')
	            return false;
	    }
	    return true;
	}

}
