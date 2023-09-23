def solution(s):
    binary_transform_count = 0  
    removed_zero_count = 0  

    while s != "1":  
        new_s = ""
        for char in s:
            if char == "1":
                new_s += char
            else:
                removed_zero_count += 1

        binary_transform_count += 1
        s = bin(len(new_s))[2:] 

    return [binary_transform_count, removed_zero_count]