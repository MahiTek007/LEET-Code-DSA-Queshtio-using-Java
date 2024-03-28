public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {2};
        int val = 3;
        int k =removeElement(nums,val);
        for (int i : nums) {
            System.out.print(i);
        }
        System.out.println("\t"+k);
    }
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length-1; i++) {
           if (val !=nums[i]) {
                nums[k++]=nums[i];
           }
        }
        return k;
    }
}
