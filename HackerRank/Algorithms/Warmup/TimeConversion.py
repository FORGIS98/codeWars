#!/bin/python3

import os
import sys

#
# Complete the timeConversion function below.
#
def timeConversion(s):
    hours = int(s[:2])

    print(hours)
    if(hours == 12):
        hours = 0
    if(s[8] == "P"):
        hours += 12

    return ("%02d" % hours + s[2:8])


if __name__ == '__main__':
    # f = open(os.environ['OUTPUT_PATH'], 'w')

    # s = input()

    # result = timeConversion(s)
    print(timeConversion("07:05:45PM")) # 

    # f.write(result + '\n')

    # f.close()

