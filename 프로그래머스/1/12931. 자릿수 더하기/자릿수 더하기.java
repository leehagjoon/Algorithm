import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = Integer.toString(n);
        for(int i = 0; i < result.length(); i++){
            answer += Integer.parseInt(result.substring(i,i+1));
        }
        return answer;
    }
}