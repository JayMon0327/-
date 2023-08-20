a = 777
print(a)

a = -5
print(a)

a = a + 5
print(a)

a = int(1e9)
print(a)

#직접 데이터를 넣어 초기화
a= [1,2,3,4,5,6,7,8,9]
print(a)

#네 번째 원소만 출력
print(a[3])

#크기가 N이고, 모든 값이 0인 1차원 리스트 초기화
n = 10
a = [0] * n
print(a)

a = [1,2,3,4,5,6,7,8,9]

#두 번째 원소부터 네 번째 원소까지
print(a[1:4])

a = [i for i in range(10)]
print(a)

# N X M 크기의 2차원 리스트 초기화
n = 4
m = 3
array = [[0] * m for _ in range(n)]
print(array)

# 문자열 자료형
data = "Don`t you know \"Python\"?"
print(data)

# 튜플 사용 예제
a = (1,2,3,4,5,6,7,8,9)
#네 번째 원소만 출력
print(a[3])
#두 번째 원소부터 네 번째 원소까지
print(a[1:4])

# 사전자료형
a = dict()
a['홍길동'] = 97
a['이순신'] = 98

print(a)

b = {
  '홍길동' : 97,
  '이순신' : 98
}
print(b)

key_list = list(b.keys())
print(key_list)

# 입출력 방식
# n = int(input())
# data = list(map(int,input().split())) # 중요 ! 

# print(n)
# print(data)


# 조건문
a = -5 

if a >= 0:
    print("a >= 0")
elif a >= -10:
    print("0 > a >= -10")
else:
    print("-10 > a ")

a = 15

if a <=20 and a >= 0:
    print("Yes")


#for 변수 in 리스트:
#    실행할 소스코드
array = [9, 8, 7, 6, 5]
for x in array:
    print(x)
# 9
# 8
# 7
# 6
# 5

result = 0
# i는 1부터 9까지의 모든 값을 순회
for i in range(1, 10):
    result += i
print(result)
#45

result = 0

for i in range(1, 10):
    if i % 2 == 0;
        continue
    result += i

print(result)
#25

i = 1

while True:
    print("현재 i의 값:", i)
    if i == 5:
        break
    i += 1
# 현재 i의 값: 1
# 현재 i의 값: 2
# 현재 i의 값: 3
# 현재 i의 값: 4
# 현재 i의 값: 5

scores = [90, 85, 77, 65, 97]

for i in range(5):
    if scores[i] >= 80:
        print(i + 1, "번 학생은 합격입니다.")

# 1 번 학생은 합격입니다.
# 2 번 학생은 합격입니다.
# 5 번 학생은 합격입니다.

scores = [90, 85, 77, 65, 97]
cheating_student_list = {2,4}

for i in range(5):
    if i + 1 in cheating_student_list:
        continue
    if scores[i] >= 80:
        print(i + 1, "번 학생은 합격입니다.")
# 1 번 학생은 합격입니다.
# 5 번 학생은 합격입니다.

