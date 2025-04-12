package allproblems;

import java.util.HashMap;
import java.util.Scanner;

public class lenLongestSbString {
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);


System.out.println("Enter the string : ");
String str = sc.nextLine();
 int len =0;
for (int i = 0; i < str.length();i++){

   
    HashMap<Character,Integer> hm = new HashMap<>();
    for(int j = i ; j<str.length();j++){
        if(hm.containsKey(str.charAt(j))){
            break;
        }else{
            hm.put(str.charAt(j) , 1);
            len = Math.max(len , j-i+1);

        }
    }



}
sc.close();
System.out.println("The length is - "+len);

   
    }
    
}
