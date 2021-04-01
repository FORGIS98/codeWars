def midd(txt):
    if len(txt)%2 == 0:
        return txt[int(len(txt)/2 - 1) : int(len(txt)/2 + 1)]

    return txt[int(len(txt)/2)]

print("Test :: ", midd("ab c de"))
print("Test :: ", midd("ab cd ef"))
