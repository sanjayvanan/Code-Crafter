public class years {
    public static void main(String[] args) {
        String numbers = "12 23 34 45 56";
        String[] parts = numbers.split(" ");

        int[] integers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            integers[i] = Integer.parseInt(parts[i]);
        }
        for (int num : integers) {
            System.out.println(num);


            
        }
    }
}




