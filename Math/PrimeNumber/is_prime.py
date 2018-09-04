import math
import timeit

def is_prime(x):
    if x <= 1:
        return False
    elif x <= 3:
        return True
    elif x % 2 == 0:
        return False
    else:
        for i in range(3, int(math.sqrt(int(x))) + 1, 2):
            if x % i == 0:
                return False
        return True

if __name__ == "__main__":
    start = timeit.default_timer()
    
    print(is_prime(7))
    
    stop = timeit.default_timer()
    print('Time: ', stop - start) 
    
