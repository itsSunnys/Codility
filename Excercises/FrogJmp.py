# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

""" 
Requirement: X is current postin, T is dest, and D is jump distance, find min jumps

Approach: divide Y by X and if modulo not equal to 0 add 1

https://app.codility.com/demo/results/training35DS7M-98Z/
"""


def solution(X, Y, D):
    # Implement your solution here

    return (int)((Y - X)/D if (Y-X) % D == 0 else (Y - X)/D + 1)
