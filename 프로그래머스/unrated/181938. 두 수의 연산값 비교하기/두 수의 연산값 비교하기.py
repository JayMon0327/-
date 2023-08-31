def solution(a, b):
    answer = 0
    
    ab = int(str(a)+str(b))
    ba = 2 * a * b
    if ab == ba:
        answer += ab
    else:
        answer= max(ab,ba)
    return answer