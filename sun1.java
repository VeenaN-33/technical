import java.util.*;
public class sun1 {
   public static void main(String[] args) {
    String st="welcome";
RemoveVowels(st);
   }
    public static void RemoveVowels (String st){
       for(int i=0;i<st.length();i++){
        char ch = st.charAt(i);
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
            continue;
        }
    System.out.println(ch);   
    } 

    }
   } 

