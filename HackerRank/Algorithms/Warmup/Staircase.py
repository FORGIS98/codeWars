#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the staircase function below.
def staircase(n):
    myString = ''.rjust(n)

    while(n > 0):
        tmp = list(myString)
        tmp[n - 1] = '#'
        myString = "".join(tmp)
        print(myString)
        n -= 1

if __name__ == '__main__':
    n = int(input())

    staircase(n)
