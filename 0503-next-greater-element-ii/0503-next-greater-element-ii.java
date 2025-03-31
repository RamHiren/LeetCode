class Solution {
    public int[] nextGreaterElements(int[] arr) {
         int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2*n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i % n]) {
                stack.pop();
            }

            if(i < n){
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(arr[i % n]);
        }

        return result;
    }
}