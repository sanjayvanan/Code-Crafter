package Arrays;

public class secminandmax {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 6, 9, 0,0};

        if (arr.length < 2) {
            System.out.println("Array size is less than 2");
            return;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }

            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondMax);
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("The second smallest element is: " + secondMin);
        }
    }

}

