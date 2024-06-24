package Strings;

import java.util.*;
class Addthe_Numbers{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        StringBuffer buff = new StringBuffer("");
        String str = s.nextLine();
        int sum =0;
        char[] carr =  str.toCharArray();
       
        for(int i =0;i<carr.length;i++){
            if(Character.isDigit(carr[i])){
                buff.append(carr[i]);
            }
            else{
                if(buff.length()>0){
                    sum += Integer.parseInt(buff.toString());
                    buff.setLength(0);
                }
            }
        }
        if(buff.length() >=0){
            sum+= Integer.parseInt(buff.toString());
        }
       
        System.out.println(sum);
    }
}