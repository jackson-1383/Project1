def solution(A):
    lowestPossible = 1 
    for numbers in sorted(A):
        if numbers == lowestPossible:
            lowestPossible += 1
        elif numbers > lowestPossible:
            break
    return lowestPossible



if __name__ == "__main__":
    array = [1,3,4,5,6,2]
    print(solution(array))