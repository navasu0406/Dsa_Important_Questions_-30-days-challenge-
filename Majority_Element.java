import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};

        int result = solution(arr);

        System.out.println("Majority Element: " + result);
    }

    public static int solution(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            if(map.get(arr[i])>arr.length/2)
            {
                return arr[i];
            }
        }
        return -1;

    }
}
