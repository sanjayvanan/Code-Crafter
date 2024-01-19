import java.util.*;

class First_and_last_occurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {10, 5, 5, 5, 5, 9, 12,12, 16};
        int target = s.nextInt();
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int i=0;
        while(i<arr.length){
            if (arr[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
            i++;
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence at index " + firstOccurrence);
            System.out.println("Last occurrence at index " + lastOccurrence);
        } else {
            System.out.println("Element not found.");
        }
        s.close();
    }
}