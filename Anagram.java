import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1=sc.nextLine();
        System.out.println("Enter String 2");
        String s2=sc.nextLine();
        int freq[]= new int[256];
        if(s1.length()!=s2.length()){
             System.out.println("Not Anagram");
            sc.close();
            return;
        }
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        boolean isAnagram=true;
        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                isAnagram=false;
                return;
            }
        }
        if(isAnagram){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}