def multiples(num):
    res = 0
    for x in range(3, num):
        if(x % 3 == 0 and x % 5 == 0):
            res += x
        elif(x % 3 == 0):
            res += x
        elif(x % 5 == 0):
            res += x
    return res

print(multiples(10) == 23)
print(multiples(20) == 78)
print(multiples(30) == 195)
