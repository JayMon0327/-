from collections import deque

def solution(priorities, location):
    answer = 0
    queue = deque([(v, i) for i, v in enumerate(priorities)]) 
    while queue:
        front = queue.popleft()
        if any(front[0] < q[0] for q in queue): 
            queue.append(front)
        else:
            answer += 1
            if front[1] == location: 
                break
    return answer
