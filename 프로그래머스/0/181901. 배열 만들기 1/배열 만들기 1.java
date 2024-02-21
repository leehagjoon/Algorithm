class Solution {
    public int[] solution(int n, int k) {
        int c = n/k;
        int[] answer = new int[c];
        for(int i = 0; i < c; i++){
            answer[i] = k * (i +1);
        }
        return answer;
    }
}