package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Car {
    public void drive(){
        System.out.println("Car is driving");
    }

    public void stop(){
        System.out.println("Car is stopped");
    }

    public void drive(String str) throws RuntimeException
    {
        throw new NullPointerException("YOU GOT NULL!");
    }

    public static boolean sameLetters(String f, String s){
        if(f.length() == s.length()){
            for(int i = 0; i < f.length(); i++){
                boolean flag = false;
                for(int j = 0; j < f.length(); j++){

                    if(f.charAt(i) == s.charAt(j)){
                        flag = true;
                    }
                }
                if(!flag){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public static boolean sameLetters1(String f, String s){
        char[] fArr = f.toCharArray(); //"abc" -> ['a']['b']['c]
        char[] sArr = s.toCharArray();
        Arrays.sort(fArr);
        Arrays.sort(sArr);
        return Arrays.equals(sArr,fArr);
    }

    public static String removeDup(String str){
        Set<String> set = new HashSet<>();
        String rev = "";
        for(int i = 0; i < str.length(); i++){
            set.add(String.valueOf(str.charAt(i)));
        }
        for(String letter: set){
            rev+=letter;
        }
        return rev;
    }

    public static void main(String[] args) {
//        System.out.println(sameLetters1("abc", "acb"));
//        System.out.println(sameLetters1("abc", "bca"));
//        System.out.println(sameLetters1("abc","abb"));
        System.out.println(removeDup("asdasxxx"));
    }
}
