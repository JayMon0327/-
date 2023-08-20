# 함수
#def 함수명(매개변수):
#    실행할 소스코드
#    return 반환 값

def add(a, b):
    return a + b

print(add(3,7))
#10

def add(a, b):
    print('함수의 결과:', a + b)

add(3,7)
#함수의 결과: 10

a = 0

def func():
    global a
    a += 1

for i in range(10):
    func()

print(a)
#10

def operator(a,b):
    add_var = a + b
		subtract_var = a - b
		multiply_var = a * b
		divide_var = a / b
    return add_var, subtract_var, multiply_var, divide_var

a, b, c, d = operator(7, 3)
print(a, b, c, d)


#일반적인 add() 메서드 사용
print(add(3, 7)). #10

#람다 표현식으로 구현한 add() 메서드
print((lambda a, b: a+b)(3, 7)). #10

array = [('홍길동', 50), ('이순신', 32), ('아무개', 74)]

def my_key(x):
    return x[1]

print(sorted(array, key=my_key)) # [('이순신', 32), ('홍길동', 50), ('아무개', 74)]
print(sorted(array, key=lambda x: x[1]))  
# [('이순신', 32), ('홍길동', 50), ('아무개', 74)]


list1 = [1, 2, 3, 4, 5]
list2 = [6, 7, 8, 9, 10]

result = map(lambda a, b : a + b, list1, list2)

print(list(result))
# [7, 9, 11, 13, 15]


