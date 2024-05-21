# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

# given that each array always has odd number of elements, same value can be paired and find the value of the un-paired element

# approach: O(N) traverse the array, store the values if repeated remove from set, return the left over number
# assume given structure A will follow

#https://app.codility.com/demo/results/trainingHRFXBE-XRD/

def solution(A):
    # Implement your solution here
    
    collected = set()
    for item in A:
        if (item in collected):
            collected.remove(item)
        else:
            collected.add(item)
    return collected.pop()
