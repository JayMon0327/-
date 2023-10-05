def is_valid(s):
    stack = []
    for char in s:
        if char in '([{':
            stack.append(char)
        else:
            if not stack:
                return False
            top = stack.pop()
            if char == ')' and top != '(':
                return False
            if char == ']' and top != '[':
                return False
            if char == '}' and top != '{':
                return False
    return not stack

def solution(s):
    answer = 0
    for i in range(len(s)):
        rotated_s = s[i:] + s[:i]
        if is_valid(rotated_s):
            answer += 1
    return answer


