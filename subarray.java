// import java.util.*;

// public class subarray {
//     public static void main(String[] args) {
//         String strs[] = { "sci", "soc", "mat", "Geo", "sanjay", "sci", "new", "sanjay" };
//         String first = "sci", last = "sanjay";
//         int distance = 0, cdis = Integer.MIN_VALUE;
//         boolean foundFirst = false;

//         for (int i = 0; i < strs.length; i++) {
//             if (strs[i].equals(first)) {
//                 foundFirst = true;
//                 int j;
//                 for (j = i; j < strs.length; j++) {
//                     if (strs[j].equals(last)) {
//                         int dist = j - i;
//                         distance += dist;
//                         break;
//                     }
//                 }
//                 i = j;
//             }
//         }
//         if (!foundFirst) {
//             System.out.println("First string not found");
//         } else {
//             System.out.print(distance);
//         }
//     }
// }




import java.util.*;
public class subarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str[] ={"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog", "and", "then", "quick", "fox", "jumps", "again", "over", "the", "lazy", "dog"};

        int min_distance = str.length;
        String word1 = sc.next();
        String word2 = sc.next();
        int index1 = -1;
        int index2 = -1;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(word1)){
                index1 = i; 
            }
            if(str[i].equals(word2)){
                index2 = i; 
            }

            if(index1 != -1  &&  index2 !=-1){
                int current_distance = Math.abs(index1 - index2); 
                if(current_distance<min_distance){
                    min_distance = current_distance;}
            }
        }
        System.out.println(min_distance);

    }

}