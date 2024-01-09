import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호를 사전순으로 정렬합니다.
        Arrays.sort(phone_book);

        // 인접한 전화번호끼리 비교하여 접두어인지 확인합니다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        // 어떤 번호가 다른 번호의 접두어인 경우가 없으면 true를 반환합니다.
        return true;
    }
}