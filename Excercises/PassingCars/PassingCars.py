# https://app.codility.com/demo/results/trainingC9N6GD-CJC/

# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    result = 0
    pSum = [0] * len(A)
    for i in range(0, len(A)):
        if i == 0:
            pSum[i] = 0 + A[i]
        pSum[i] = A[i] + pSum[i - 1]
    # print(f"test{pSum}")

    for i in range(0, len(A)):
        if A[i] == 0:
            result = result + (pSum[len(A) - 1] - pSum[i])

    if result > 1000000000:
        return -1
    
    return result