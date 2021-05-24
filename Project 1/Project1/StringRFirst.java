
/**
 * Write a description of class StringRFirst here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringRFirst
{
    public static void main(String[] args) 
    {
        String str = "Java says hello world. Java String tutorial";
         
        //Replace first occurrence of substring "Java" with "JAVA"
        String newStr = str.replaceFirst("Java", "JAVA");
         
        //Replace first occurrence of substring "a" with "A"
        String regexResult = str.replaceFirst("[y]", "A");
         
        System.out.println(newStr);
        System.out.println(regexResult);
    }
    public boolean isUnique(char[] arr, char c){
	    for(char ele : arr){
	        if(c==ele) return false;
	    }
	    return true;
	}
}
