/**
 * _1_TWO_Sum
 */
public class _1_TWO_Sum {
    
    public static void main(String[] args) {
       int arr [] ={1,3,3}; 
       int target =6;
       int sumIndexes [] = twoSum(arr,target);
       System.out.println(sumIndexes[0]+"\t"+sumIndexes[1]);
    }

    private static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (target == arr[i]+arr[j]) {
                    return new int[] {
                        i,j
                    };
                }
            }
        }

        return new int[]{-1,-1};
    }


}