public class PrefixSum {
    public static void MaxSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // maxSum Subarray
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum;
                if (start == 0) {
                    sum = prefix[end];
                } else {
                    sum = prefix[end] - prefix[start - 1];
                }
                System.out.println(sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String args[]) {
        int array[] = {10,12,24,13,56,7,8};
        MaxSum(array);
    }
}
