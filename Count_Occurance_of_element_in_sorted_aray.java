public class Count_Occurance_of_element_in_sorted_aray {
public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4};
        int target = 2;

        int result = solution(arr, target);

        System.out.println("Count: " + result);
    }

    public static int solution(int[] arr, int target) {

        int lb = lowerBound(arr, target);
        int ub = upperBound(arr, target);

        // target not present
        if(lb == arr.length || arr[lb] != target) {
            return 0;
        }

        return ub - lb;
    }

    public static int lowerBound(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        int ans = arr.length;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int upperBound(int[] arr, int target) {

        int start = 0, end = arr.length - 1;
        int ans = arr.length;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
