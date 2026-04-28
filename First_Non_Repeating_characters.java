import java.util.HashMap;
public class First_Non_Repeating_characters {
      public static void main(String[] args) {

        String s = "loveleetcode";

        int result = solution(s);

        System.out.println("Index: " + result);
    }

    public static int solution(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i))==1)return i;
        }
        return -1;
    }
}
