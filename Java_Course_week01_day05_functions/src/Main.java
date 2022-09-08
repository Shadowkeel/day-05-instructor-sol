import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int[] array={1,23,4,12,2,2,2,4,4,4,5};
printUnique(array);
        System.out.println(vowels("mohammed"));

split("mohammed is the best instructor");

    }


public static void printUnique(int[] array){
    for (int i = 0; i < array.length ; i++) {
        int j;
        for ( j = 0; j <i ; j++) {
            if (array[i]==array[j]){
                break;
            }
        }
        if (i==j){
            System.out.println(array[i]);
        }
    }
}
public static int vowels(String word){
        int count=0;
    for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'){
            count++;
        }
    }
    return count;
}

public static void split(String sentence){
        String[] arra=sentence.split(" ");
    for (int i = 0; i < arra.length; i++) {
        System.out.println(arra[i]);
    }
}
}


