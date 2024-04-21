class Solution {
    public int solution(int hp) {
        int ants = 0;
        
        // 장군개미의 수 계산
        int generals = hp / 5;
        ants += generals;
        hp -= generals * 5;

        // 병정개미의 수 계산
        int soldiers = hp / 3;
        ants += soldiers;
        hp -= soldiers * 3;

        // 일개미의 수 계산
        ants += hp;  // 남은 hp는 모두 일개미가 처리

        return ants;
    }
}
