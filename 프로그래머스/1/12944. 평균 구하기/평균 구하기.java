class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double result = 0;
        for(int num : arr){
            answer += num;
        }
        result = answer / arr.length;
        return result;
    }
}