def solution(people, limit):
    # 사람들의 몸무게를 오름차순으로 정렬합니다.
    people.sort()
    
    # 가장 가벼운 사람과 가장 무거운 사람의 인덱스를 초기화합니다.
    lightest = 0
    heaviest = len(people) - 1
    
    # 필요한 구명보트 개수를 초기화합니다.
    boats_needed = 0
    
    while lightest <= heaviest:
        # 가장 가벼운 사람과 가장 무거운 사람의 몸무게 합을 계산합니다.
        total_weight = people[lightest] + people[heaviest]
        
        # 몸무게 합이 무게 제한 이하인 경우 두 명을 함께 보트에 태우고 인덱스를 업데이트합니다.
        if total_weight <= limit:
            lightest += 1
            heaviest -= 1
        else:
            # 몸무게 합이 무게 제한을 초과하는 경우 가장 무거운 사람만 태우고 인덱스를 업데이트합니다.
            heaviest -= 1
        
        # 보트 한 대가 출발했으므로 보트 개수를 증가시킵니다.
        boats_needed += 1
    
    return boats_needed
