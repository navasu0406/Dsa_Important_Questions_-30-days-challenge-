public class Max_Sumsubarray_of_Size_K {
    public static void main(String[] args) {

        int[] arr = {2,1,5,1,3,2};
        int k = 3;

        int result = solution(arr, k);

        System.out.println("Max sum: " + result);
    }

    public static int solution(int[] arr, int k) {
        int sum=0;
       
        for(int i=0; i<k; i++)
        {
            sum+=arr[i];
        }
 
         int max=sum;
        for(int i=k; i<arr.length; i++)
        {
            sum=arr[i]+sum-arr[i-k];
            max=Math.max(sum,max);
        }
        return max;
    }
}
