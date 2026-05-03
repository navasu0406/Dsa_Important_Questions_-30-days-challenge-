public class Sort_0_1_2 {
     public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};

        solution(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void solution(int[] arr) {
       int start=0;
       int mid=0;
       int end=arr.length-1;

       while(mid<=end)
       {
          switch(arr[mid])
          {
            case 0:
               swap(arr,start,mid);
               start++;
               mid++;
               break;
            case 1:
               mid++;
               break;
            case 2:
              swap(arr,mid,end);
              end--;
              break;
          }
       }
    }
    public static void swap(int [] arr,int a,int b)
    {
         int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
    }
}
