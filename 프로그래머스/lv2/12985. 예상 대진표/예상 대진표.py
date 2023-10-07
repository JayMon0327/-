def solution(N, A, B):
    round = 0

    while A != B:
        A = (A + 1) // 2
        B = (B + 1) // 2
        round += 1

    return round