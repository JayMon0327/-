def gcd(a, b): # b가 0이 될때까지 반복문, 최대공약수찾는 함수
    while b:
        a, b = b, a % b
    return a

def solution(numer1, denom1, numer2, denom2):
    new_numer = numer1 * denom2 + numer2 * denom1
    new_denom = denom1 * denom2
    greatest_common_divisor = gcd(new_numer, new_denom)
    
    result = [new_numer // greatest_common_divisor, new_denom // greatest_common_divisor]
    return result