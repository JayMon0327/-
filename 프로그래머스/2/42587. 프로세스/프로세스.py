from collections import deque

def solution(priorities, location):
    answer = 0
    queue = deque([(v, i) for i, v in enumerate(priorities)])  # (중요도, 인덱스) 쌍으로 큐에 저장
    while queue:
        front = queue.popleft()
        if any(front[0] < q[0] for q in queue):  # 대기중인 프로세스 중 우선순위가 더 높은 경우
            queue.append(front)
        else:
            answer += 1
            if front[1] == location:  # 찾고자 하는 프로세스인 경우
                break
    return answer
