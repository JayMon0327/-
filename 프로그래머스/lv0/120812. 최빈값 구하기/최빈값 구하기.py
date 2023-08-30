def solution(array):
    max_count = 0
    answer = -1
    
    for num in array:
        count = array.count(num)
        
        if count > max_count:
            max_count = count
            answer = num
        elif count == max_count and num != answer:
            answer = -1
            
    return answer