class Solution {
    public String solution(String code) {
      int mode = 0;
         String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;
            else if (i % 2 == mode) answer += code.charAt(i);
        }
        return "".equals(answer) ? "EMPTY" : answer;
    }
}