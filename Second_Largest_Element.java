public class Second_Largest_Element {
    public static void main(String[] args) {

        int[] arr = {10,5,20,8};

        int result = solution(arr);

        System.out.println("Second Largest: " + result);
    }

    public static int solution(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max)
            {
                secondmax=arr[i];
            }  
        }

       if(secondmax==Integer.MIN_VALUE)return -1;

       return secondmax;
    }
}
