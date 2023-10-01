def solution(n):
    count_one_n = bin(n).count('1')
    
    next_num = n + 1
    while True:
        if bin(next_num).count('1') == count_one_n:
            return next_num
        next_num += 1


