def solution(arr1, arr2):
    answer = []
    
    row_len = len(arr1)
    col_len = len(arr2[0])
    
    for _ in range(row_len):
        answer.append([0] * col_len)
    
    for i in range(row_len):
        for j in range(col_len):
            for k in range(len(arr2)):
                answer[i][j] += arr1[i][k] * arr2[k][j]
    
    return answer
