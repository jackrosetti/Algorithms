"""
This method of dynamic programming is much more efficient than something like native recursion. We do fewer calculations as we
store each number into a list. Rather than calculate n-1 and n-2 eah time, we only have to calculate based on the last number
stored in our memo
"""


def fib(n, memo = {0: 0, 1: 1}):
    if n not in memo:
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo)
    return memo[n]

