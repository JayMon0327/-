def solution(s):
    tokens = s.split()
    result = 0
    count = 0
    
    for token in tokens:
        if token == "Z":
            result -= count
        else:
            count = int(token)
            result += count
    return result
    