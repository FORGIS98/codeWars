#!/bin/python3

import math
import os
import random
import re
import sys

# Important
from itertools import accumulate

# Complete the arrayManipulation function below.
def arrayManipulation(n, queries):
    myList = [0] * n

    for start, end, add in queries:
        myList[start - 1] += add
        if(end < n): 
            myList[end] -= add

    return max(accumulate(myList))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)

    fptr.write(str(result) + '\n')

    fptr.close()

