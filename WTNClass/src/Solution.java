import java.util.*;
public class Solution {
        public int largestNumber (int[] arr, int n){
            String result = String.valueOf(arr[0]);
            for (int i = 1;i < n;i++){
                result = compare(result,String.valueOf(arr[i]));
            }
            return Integer.parseInt(result);
        }
        public String compare (String x, String y ){
            StringBuilder sb1 = new StringBuilder(x);
            StringBuilder sb2 = new StringBuilder(y);
            sb1.append(y);
            sb2.append(x);
            if (Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())){
                return sb1.toString();
            }
            else {
                return sb2.toString();
            }
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.largestNumber(arr, n));
    }
}