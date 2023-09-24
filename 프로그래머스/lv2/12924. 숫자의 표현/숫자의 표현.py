def solution(n):
    count = 0  # 방법의 수를 저장하는 변수
    for i in range(1, n + 1):
        current_sum = 0
        j = i
        while current_sum < n:
            current_sum += j
            j += 1
        if current_sum == n:
            count += 1
    return count
