def solution(s):
    numbers = s.split()
    numbers = [int(num) for num in numbers]
    
    min_num = min(numbers)
    max_num = max(numbers)

    result = f"{min_num} {max_num}"
    return result