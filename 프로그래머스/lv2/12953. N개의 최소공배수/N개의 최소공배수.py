import math

def solution(arr):
    def lcm(x, y):
        return x * y // math.gcd(x, y)
    
    answer = arr[0]
    
    for num in arr[1:]:
        answer = lcm(answer, num)
    
    return answer