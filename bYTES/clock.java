import java.util.*;
class main
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int time = s.nextInt();
        int regulartime=0 ;
        if(time >12){
            while(time>12){
                
                regulartime +=1;
                --time;
            }
        }
        System.out.println("this is the regular time "+regulartime);
        
    }
}
