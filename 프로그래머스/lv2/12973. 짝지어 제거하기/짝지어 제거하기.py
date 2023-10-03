def solution(S):
    stack = []

    for char in S:
        if not stack:
            stack.append(char)
        elif stack[-1] == char:
            stack.pop()
        else:
            stack.append(char)

    if not stack:
        return 1
    else:
        return 0