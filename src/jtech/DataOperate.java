package jtech;

public class DataOperate {
    public String str(String s){
        String str1 = "abc";
        if(str1.equals(s)){
            return "OK";
        }else{
            return"NG";
        }
    }
    public double tax(int t){
        return t * 1.08;
    }
    public int num(){
        return 10;
    }
    public String str2(){
        String str1 = "01";
        return str1;
    }
    public String str2(String s){
        return s;
    }

}
