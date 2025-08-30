public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 1, 2, 3}
        boolean[] visited = new boolean[arr.length]; // track visited indices

        System.out.println("Frequency of each Unique element: ");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue; // skip already counted elements

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // mark duplicate as visited
                }
            }
            System.out.println("Frequency of "+arr[i] + " : " + count);
        }
    }
}

