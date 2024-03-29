class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] result = {"a","e","i","o","u"};
        for(String my : result){
            answer = answer.replaceAll(my,"");
        }
        return answer;
    }
}