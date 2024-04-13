# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

# for loop for cycling inner through the array, repeated in onother K times 
# moving element by setting index [i] to [i+1] and move last element to [1]
# extra arr needed to avoid replacement
# better approach: use %

def solution(A, K):
    if (K == 0 or len(A) == 1 or len(A) == 0):
        return A
    # Implement your solution here
    B = [0]*len(A)
    for _ in range(K):
        B[0] = A[len(A) - 1]
        for i in range(len(A) - 1):
            B[i+1] = A[i]
        for i in range(len(A)):
            A[i] = B[i]
    return A 
