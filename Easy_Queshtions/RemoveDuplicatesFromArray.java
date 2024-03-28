/**
 * RemoveDuplicatesFromArray
 */
public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        int nums [] = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(i);
        }
        System.out.println("\t"+k);
    }

    private static int removeDuplicates(int[] nums) {
        int k =0;           //Elements =>0,0,1,1,1,2,2,3,3,4  
                            //indexs   =>0,1,2,3,4,5,6,7,8,9
        for (int i =1; i < nums.length; i++) {
           if (nums[k]!=nums[i]) {
                 k++;
                nums[k]=nums[i];
           }
        }

        return k+1;
    }
}