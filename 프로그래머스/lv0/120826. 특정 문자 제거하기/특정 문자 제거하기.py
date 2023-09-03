def solution(my_string, letter):
    result = "".join([char for char in my_string if char != letter])
    return result
