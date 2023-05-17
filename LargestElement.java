public class LargestElement {
    public static void main(String[] args) {
        int[] n = {1, 2, 4, 5, 6};
        int largest = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > largest) {
                largest = n[i];
            }
        }

        System.out.println(largest);
    }
}
