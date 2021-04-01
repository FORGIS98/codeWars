def times(arr, i):
    it = 0
    count = 0
    while(it < len(arr)):
        if(arr[it] == i):
            count += 1
        it += 1
    return count

def odd(arr):
    myMap = {}
    for i in arr:
        if(myMap.get(i) == None):
            x = times(arr, i)
            if(x % 2 != 0):
                return i
            myMap[i] = x

print("Res :: ", odd([1, 2, 3, 1, 2, 3, 4]))
print("Res :: ", odd([1, 2, 3, 3, 2]))
print("Res :: ", odd([1, 2, 3, 1, 2, 3, 4, 4, 5, 5, 5]))
