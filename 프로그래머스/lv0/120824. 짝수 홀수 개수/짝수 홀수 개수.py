def solution(num_list):
    count1 = 0
    count2 = 0
    for i in num_list:
        if i % 2 == 0:
            count1 += 1
        else:
            count2 += 1
    count = [count1,count2]
    return count