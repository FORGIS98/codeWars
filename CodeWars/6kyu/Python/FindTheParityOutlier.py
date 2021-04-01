def outlier(arr):
    cont = 0
    for i in range(3):
        if arr[i] % 2 == 0:
            cont += 1

    if cont >= 2:
        print(list(filter(lambda x: x%2 != 0, arr))[0])
    else:
        print(list(filter(lambda x: x%2 == 0, arr))[0])


outlier([4, 4, 6, 8, 2, 4, 5, 8, 2, 4, 8])
outlier([1, 3, 5, 7, 3, 7, 3, 2, 7, 1, 3])

