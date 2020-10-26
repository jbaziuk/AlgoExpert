package Recursion;

public class CountHi {

    public static int countHi(String str){
        if (str.length() < 2){
            return 0;
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i'){
            return 1 + countHi(str.substring(2));
        }else{
            return countHi(str.substring(1));
        }
    }



    public static int countHiTheSecond(String str){
        if (str.length() < 2){
            return 0;
        }
        if (str.substring(str.length() - 2).equals("hi")){
            return 1 + countHi(str.substring(0, str.length() -1));
        } else{
            return countHi(str.substring(0, str.length() -1));
        }
    }

}









