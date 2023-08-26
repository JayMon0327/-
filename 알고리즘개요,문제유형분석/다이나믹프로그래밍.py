

#피보나치 함수(Fibonacci Function)을 재귀함수로 구현
def fibo(x):
    if x == 1 or x == 2:  # 언제 재귀함수가 멈출지 명시
        return 1
    return fibo(x - 1) + fibo(x - 2)

print(fibo(4))
# 3




#피보나치수열: 탑다운 다이나믹 프로그래밍 소스코드

#한 번 계산된 결과를 메모이제이션 하기 위한 리스트 초기화
d = [0] * 100

#피보나치 함수를 재귀함수로 구현(탑다운 다이나믹 프로그래밍)
def fibo(x):
    #종료조건(1혹은 2일때 1을 반환)
    if x == 1 or x == 2:
        return 1
    #이미 계산한 적 있는 문제라면 그대로 반환
    if d[x] != 0:
        return d[x]
    #아직 계산하지 않은 문제라면 점화식에 따라서 피보나치 결과 반환
    d[x] = fibo(x - 1) + fibo(x - 2)
    return d[x]

print(fibo(99))

# 218922995834555169026





# 피보나치 수열: 보텀업 다이나믹 프로그래밍 소스코드

#앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
d = [0] * 100

#첫 번째 피보나치 수와 두 번째 피보나치 수는 1
d[1] = 1
d[2] = 1
n = 99

#피보나치 함수 반복문으로 구현(보텀업 다이나믹 프로그래밍)
for i in range(3, n + 1):
    d[i] = d[i - 1] + d[i - 2]

print(d[n])
# 218922995834555169026




# 문제 개미전사

#정수 N을 입력받기
n = int(input())
#모든 식량 정보 입력 받기
array = list(map(int, input().split()))

#앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
d= [0] * 100

#다이나믹 프로그래밍 진행(보텀업)
d[0] = array[0]
d[1] = max(array[0], array[1])
for i in range(2, n):
    d[i] = max(d[i - 1], d[i - 2] + array[i])

#계산된 결과 출력
print(d[n - 1])





# 문제 1로 만들기

#정수 X를 입력받기
x = int(input())

#앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
d = [0] * 30001

#다이나믹 프로그래밍 진행(보텀업)
for i in range(2, x + 1):
    #현재의 수에서 1을 빼는 경우
    d[i] = d[i - 1] + 1
    #현재의 수가 2로 나누어 떨어지는 경우
    if i % 2 == 0:
        d[i] = min(d[i], d[i // 2] + 1)
    #현재의 수가 3으로 나누어 떨어지는 경우
    if i % 3 == 0:
        d[i] = min(d[i], d[i // 3] + 1)
		#현재의 수가 3으로 나누어 떨어지는 경우
    if i % 5 == 0:
        d[i] = min(d[i], d[i // 5] + 1)

print(d[x])





#문제 효율적인 화폐 구성

#정수 N,M을 입력받기
n, m = map(int,input().split())
#N개의 화폐 단위 정보를 입력받기
array = []
for i in range(n):
    array.append(int(input()))

#한 번 계산된 결과를 저장하기 위한 DP 테이블 초기화
d = [10001] * (m + 1)

#다이나믹 프로그래밍 진행(보텀업)
d[0] = 0
for i in range(n):
    for j in range(array[i], m + 1):
        if d[j - array[i]] != 10001: # (i - k) 원을 만드는 방법이 존재하는 경우
            d[j] = min(d[j], d[j - array[i]] + 1)

#계산된 결과 출력
if d[m] == 10001: #최종적으로 M원을 만드는 방법이 없는 경우
    print(-1)
else:
    print(d[m])






# 문제 금광

#테스트 케이스(Test Case) 입력
for tc in range(int(input())):
    #금광 정보 입력
    n, m = map(int, input*(.split())
    array = list(map(int, input().split()))
    #다이나믹 프로그래밍을 위한 2차원 DP 테이블 초기화
    dp =[]
    index = 0
    for i in range(n):
        dp.append(array[index:index + m])
        index += m
    #다이나믹 프로그래밍 진행
    for j in range(1, m):
        for i in range(n):
            #왼쪽 위에서 오는 경우
            if i == 0: left_up = 0
            else: left_up = dp[i - 1][j - 1]
            #왼쪽 아래에서 오는 경우
            if i == n - 1: left_down = 0
            else: left_down = dp[i + 1][j - 1]
            #왼쪽에서 오는 경우
            left = dp[i][j - 1]
            dp[i][j] = dp[i][j] + max(left_up, left_down, left)
result = 0
for i in range(n):
    result = max(result, dp[i][m - 1])
print(result)






# 문제 병사 배치하기

n = int(input())
array = list(map(int, input().split()))
#순서를 뒤집어 '최장 증가 부분 수열' 문제로 변환
array.reverse()

#다이나믹 프로그래밍을 위한 1차원 DP 테이블 초기화
dp = [1] * n

#가장 긴 증가하는 부분 수열(LIS) 알고리즘 수행
for i in range(1,n):
    for j in range(0,i):
        if array[j] < array[i]:
            dp[i] = max(dp[i],dp[j] + 1)

#열외해야 하는 병사의 최소 수를 출력
print(n - max(dp))