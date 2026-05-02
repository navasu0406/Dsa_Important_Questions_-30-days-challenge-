public class Sort_0_1_2 {
     public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};

        solution(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void solution(int[] arr) {
       int zero=0;
       int one=0;
       int two=0;

       for(int i=0; i<arr.length ;i++)
       {
          if(arr[i]==0)
          {
            zero++;
          }
          else if(arr[i]==1)
          {
            one++;
          }
          else{
            two++;
          }
       }
       int k=0;
       while(zero!=0)
       {
        arr[k]=0;
        zero--;
        k++;
       }
       while(one!=0)
       {
        arr[k]=1;
        one--;
        k++;
       }
       while(two!=0)
       {
        arr[k]=2;
        two--;
        k++;
       }
    }
}
