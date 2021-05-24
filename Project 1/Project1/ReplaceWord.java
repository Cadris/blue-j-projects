import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		
		System.out.println("Enter the string:");
		String arr[] = sc.nextLine().split(" ");
		
		System.out.println("Enter the word to be searched:");
		String find=sc.next();
		
		System.out.println("Enter the word to be replaced:");
		String reap=sc.next();
		
		if(new ReplaceWord().find(arr, find, reap)) {
		    for(String ele : arr) System.out.print(ele);
		}else{
		    System.out.println("The word "+find+" not found");
		}
	}
	
	public boolean find(String arr[], String f, String r){
	    boolean flag = false;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i].equals(f)){
	            arr[i]=r;
	            flag=true;
	        }
	    }
	    return flag;
	}
	
}
