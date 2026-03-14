package gopaljilab.dsa.array;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int size = nums.length;
        k %= size;
        int count = 0;

        for (int start = 0; count < size; start++) {
            int currentIndex = start;
            int prevNum = nums[start];

            do {
                int next = (currentIndex + k) % size;
                int temp = nums[next];
                nums[next] = prevNum;
                prevNum = temp;
                currentIndex = next;
                count++;
            } while (start != currentIndex);
        }
        return nums;
    }
}
