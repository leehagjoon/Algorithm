class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] result = num_str.split("");
        for(int i = 0; i < result.length; i++){
            answer += Integer.parseInt(result[i]);
        }
        return answer;
    }
}