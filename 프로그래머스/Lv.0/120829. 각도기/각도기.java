class Solution {
    public int solution(int angle) {
        /*0~90미만 예각 1
        90도 직각 2
        90~180도 미만 둔각 3
        180도 평각 4
        */
        if(angle >= 0 && angle < 90){
            return 1;
        }else if(90 < angle && angle < 180){
            return 3;
        }else if(angle == 180){
            return 4;
        }else {
            return 2;
        }
    }
}