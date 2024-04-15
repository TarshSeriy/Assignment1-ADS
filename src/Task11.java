
public class Task11 {
    public static String convertToUpper(String s , int index){
        if(index == s.length()){
            return "";
        }
        char character = s.charAt(index);
        int ascii = (int) character;
        if(ascii) <= 122 && ascii >= 97{
            ascii -= 32;
        }
        character = (char) ascii;
        return character + convertCase(s, index + 1);
        System.out.println(converToUpper("abcdef, 0"))
    }

}



