public class _9_pallindrom_number {
    public static void main(String[] args) {
         int num =121;
        boolean status= isPallindrome(num);
        if (status) {
            System.out.println("Number is Pallindrime");
        }else{
            System.out.println("Number is  Not Pallindrime");
        }
    }

    private static boolean isPallindrome(int num) {
       String numString= Integer.toString(num);
        // char [] numchar= numString.toCharArray();
        // int left = 0;
        // int right= numchar.length-1;

        // while (left<=right) {
        //     if (numchar[left]!=numchar[right]) {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }

        int left =0;
        int right =numString.length()-1;
        while (left<=right) {
            if (numString.charAt(left)!=numString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
       return true;
    }
}
