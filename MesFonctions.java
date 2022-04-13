import java.util.ArrayList;
import java.util.Scanner;





public class MesFonctions{

    public void estPalindrome(String s){
        //////// FONCTION ITERATIVE
        
               /* On teste le premier caractere avec le dernier
        et s'ils sont egaux, le programme continu
        On deroule la boucle while et on teste
        le caractere suivant(i+1) avec (longeur-(i+1))
        jusqu'a ce i soit egale à longueur/2,
        sinon le booleen egale reçoit false
       */
        
        int i=0, longueur = s.length()-1;
        boolean egale = false;
        while(i<longueur/2 && egale){
           if(s.charAt(longueur-i)!= s.charAt(i))
           {
               egale = false;
               System.out.println(s+"n'est un palindrome");
           }else{
               egale = true;
               System.out.println(s+"est un palindrome");
                       }
           i++;
        }
    
    }

}