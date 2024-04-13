def solution(N):
    # Convert N to binary representation
    binary_representation = bin(N)[2:]

    # Initialize variables to keep track of the current and maximum gap lengths
    current_gap = 0
    max_gap = 0

    # Iterate through the binary representation
    for digit in binary_representation:
        if digit == '0':
            current_gap += 1
        else:
            if current_gap > max_gap:
                max_gap = current_gap
            current_gap = 0

    return max_gap
