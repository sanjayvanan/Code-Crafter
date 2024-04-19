package Arrays;

public class repeatedElement {
    public static void main(String[] args){
        int arr[] = {1,2,2,3,3,3,4,4,4,4,4,4,4,5,5,5,5,5};
        int frequent =1;
        int Maxfrequent =1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                frequent++;
            }
            else{
                Maxfrequent = Math.max(frequent,Maxfrequent);
                frequent = 1;
            }
        }
        Maxfrequent = Math.max(frequent, Maxfrequent);
        System.out.println(Maxfrequent);

    }
}
