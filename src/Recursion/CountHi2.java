package Recursion;

public class CountHi2 {

    public static int countHi2(String str) {
        if(str.length() < 3){
            if(str.length() == 2 && str.equals("hi")){
                return 1;
            } else{
                return 0;
            }
        }

        if(str.charAt(0) == 'x' && str.charAt(1) == 'h'  && str.charAt(2) == 'i'){
            return countHi2(str.substring(3));
        } else if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi2(str.substring(2));
        } else{
            return countHi2(str.substring(1));
        }
    }


}









