def convert(arr):
    return ''.join(str(i) for i in arr)

txt = convert([1,2,3,4,5,6,7,8,9,0])
print("Returns: ", '(' + txt[0:3] + ') ' + txt[3:6] + '-' + txt[6:])
