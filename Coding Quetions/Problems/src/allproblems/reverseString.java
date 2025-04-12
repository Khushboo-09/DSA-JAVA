package allproblems;

public class reverseString {

    public static void main(String args[]){
// LaxmanSinghSaini
        StringBuffer str = new StringBuffer("abcd");
      System.out.println("Printing length - "+str.length());

        for (int i = 0 ,j = str.length()-1; i <=(str.length() /2) && j >=(str.length() /2 )  ;i++ ,j--){

           
            char tmp = str.charAt(i);

            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, tmp);
           


        }


        System.out.println("Printing - "+str);
    }

}
