package allproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class commonElements {

    public static void main(String[] args){

        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first array - ");
        n = sc.nextInt();
        System.out.println("Enter the length of second array - ");
        m = sc.nextInt();

        int[] a =  new int[n];
        int[] b = new int[m];

        System.out.println("Enter the values of first array - ");
        for (int i =0 ; i <n;i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the values of second array - ");
        for (int i =0 ; i <m;i++){
            b[i] = sc.nextInt();
        }

    sc.close();

        TreeMap<Integer,Integer> mp1=new TreeMap<>();
        TreeMap<Integer,Integer> mp2=new TreeMap<>();
        TreeMap<Integer,Integer> mp3=new TreeMap<>();

        for (int i = 0 ; i <n ; i++){
            if(mp1.containsKey(a[i])){
                mp1.put(a[i], mp1.get(a[i])+1);

            }else{
                mp1.put(a[i] ,1);
            }
        }

        for (int i = 0 ; i <m ; i++){
            if(mp2.containsKey(b[i])){
                mp2.put(b[i], mp2.get(b[i])+1);

            }else{
                mp2.put(b[i] ,1);
            }
        }


        for(Map.Entry<Integer, Integer> en :  mp1.entrySet()){
            int k = en.getKey();
            int v = en.getValue();

            if(mp2.containsKey(k)){
                mp3.put(k , Math.min(v , mp2.get(k)));
            }

        }

        ArrayList <Integer> ans = new ArrayList<Integer>();

        for(Map.Entry<Integer, Integer> en : mp3.entrySet()){
            int k = en.getKey();
            int v = en.getValue();

            for(int i =0;i<v;i++){
                ans.add(k);
            }

        }


        System.out.println("Printing sorted common array - ");
       
        for (Integer i : ans) {
            System.out.print(i+" ");
        }












    }

}
