def solution(code):
    mode = 0
    ret = ""
    
    if len(code) == 0:
        return "EMPTY"
    
    for idx in range(len(code)):
        if mode == 0:
            if code[idx] != "1":
                if idx % 2 == 0:
                    ret += code[idx]
            else:
                mode = 1
        elif mode == 1:
            if code[idx] != "1":
                if idx % 2 == 1:
                    ret += code[idx]
            else:
                mode = 0

    if len(ret) == 0:
        return "EMPTY"
    
    return ret