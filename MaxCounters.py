# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")


"""increase corr counter givne from the array values  if value is one larger than the
    current max then set all of them to max

    Appraoch. have an array of the counters, traverse through A and check values, keep  track of highest 
    Approach2. have a max_to_set to keep track of the highest when we get N+1, save the time for uncalled
    counters if there were lower values to set than max_to_set

    first attempt: https://app.codility.com/demo/results/training2B8DBP-QP2/
    optimization fix: https://app.codility.com/demo/results/training5RBKPH-KWS/
    
    Explanation: faster since now the loop doesn't run for every item but just once at the end, effort was saved by
    having each assignments compute the value to set, and final loop to set all to the max values if it 
    was not called.
"""
def solution(N, A):
    counters = [0] * N
    highest = 0
    max_to_set = 0

    for item in A:
        if item == N + 1:
            max_to_set = highest
        else:
            counters[item - 1] = max(counters[item - 1], max_to_set) + 1
            if counters[item - 1] > highest:
                highest = counters[item - 1]

    for i in range(N):
        counters[i] = max(counters[i], max_to_set)

    return counters
