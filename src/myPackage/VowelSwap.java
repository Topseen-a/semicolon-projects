package myPackage;

public class VowelSwap{
    public static void main(String[] args){

System.out.println(swapVowels("dayo", 'i'));
    }


    public static String swapVowels(String word, char check){

        String reverseWord = "";
        char character = ' ';

        for (int count = 0; count < word.length(); count ++){
            
            character = word.charAt(count);

            if (character == check){
                reverseWord += character;
                for (int index = word.length()- 1; index > 0; index--){
                    if (index == count){
                        break;
                    }
                    reverseWord += word.charAt(index);      
                }
                break;
            }
            else {
                reverseWord += word.charAt(count);
            }
        }
        return reverseWord;
    }
}
