def solution(n, left, right):
    result = []
    
    for i in range(left, right + 1):
        row = i // n
        col = i % n
        max_value = max(row, col)
        result.append(max_value + 1)
    
    return result
