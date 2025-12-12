public class TwoSumDemo {

    
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) { //outer loop(picks the first number first)
            for (int j = i + 1; j < nums.length; j++) {  //inner loop(helps in pairing with the first number)
                if (nums[i] + nums[j] == target) {
                    // return indices
                    return new int[] { i, j };
                }
            }
        }
        return null;  
    }

   
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]]);
        } 
        else
             {
            System.out.println("No solution found.");
        }
    }
}