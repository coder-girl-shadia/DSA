class Solution {
    public long subArrayRanges(int[] nums) {
        int nse[] = findNSE(nums);
        int pse[] = findPSE(nums);
        int nge[] = findNGE(nums);
        int pge[] = findPGE(nums);
        int totalmin = 0;
        int totalmax = 0;
        int total = 0;
        int mod = (int) 1e12 + 7;
        for (int i = 0; i < nums.length; i++) {
            int minright = nse[i] - i;
            int minleft = i - pse[i];
            int maxright = nge[i] - i;
            int maxleft = i - pge[i];
            totalmax = (totalmax + ((maxleft * maxright * nums[i]) % mod)) % mod;
            totalmin = (totalmin + ((minleft * minright * nums[i]) % mod)) % mod;

        }
        total = (totalmax - totalmin) % mod;
        return total;

    }

    public int[] findNSE(int nums[]) {
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stk.isEmpty() && nums[stk.peek()] >= nums[i]) {
                stk.pop();
            }
            arr[i] = (stk.isEmpty() ? nums.length : stk.peek());
            stk.push(i);
        }
        return arr;

    }

    public int[] findPSE(int nums[]) {
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!stk.isEmpty() && nums[stk.peek()] > nums[i]) {
                stk.pop();
            }
            arr[i] = (stk.isEmpty() ? -1 : stk.peek());
            stk.push(i);
        }
        return arr;

    }

    public int[] findNGE(int nums[]) {
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stk.isEmpty() && nums[stk.peek()] <= nums[i]) {
                stk.pop();
            }
            arr[i] = (stk.isEmpty() ? nums.length : stk.peek());
            stk.push(i);
        }
        return arr;

    }

    public int[] findPGE(int nums[]) {
        Stack<Integer> stk = new Stack<>();
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while (!stk.isEmpty() && nums[stk.peek()] < nums[i]) {
                stk.pop();
            }
            arr[i] = (stk.isEmpty() ? -1 : stk.peek());
            stk.push(i);
        }
        return arr;

    }

}