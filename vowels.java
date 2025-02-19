import java.util.*;

public class vowels {
    String isVowel(char c){
        c=Character.toLowerCase(c);
        if(c = 'a' || c = 'e' || c = 'i' || c = 'o' || c = 'u'){
            return "Yes";
        }else{
            return "No";
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " -> " + obj.isVowel(ch));
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " -> " + obj.isVowel(ch));
        }
    }
}