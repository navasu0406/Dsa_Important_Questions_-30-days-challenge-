public class Remove_Duplicates_SortedArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4};

        int k = solution(arr);

        System.out.println("Unique count: " + k);

        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int solution(int[] arr) {
        int k=1;

        for(int i=1; i<arr.length; i++)
        {
           if(arr[i]!=arr[k-1])
           {
                arr[k]=arr[i];
                k++;
           }
        }

        return k;
    }
}
