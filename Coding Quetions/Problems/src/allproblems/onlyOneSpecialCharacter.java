package allproblems;

public class onlyOneSpecialCharacter {
    public static void main(String[] args){


        StringBuffer val = new StringBuffer("KHUSHI@@KHUSHBOO@@@@@@@@@@MUSKAN@@@@@MUSHU@JAY@@JAYU");

        while(val.toString().contains("@@")){
           
               val = new StringBuffer(val.toString().replaceAll("@@", "@"));
            
        }

        System.out.println("Priting new value of VAl -"+val);
        
    }

}
