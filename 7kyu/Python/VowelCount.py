import re

def vowelCount(txt):
    count = 0
    pattern = re.compile("[aeiou]")
    for i in txt:
        if(pattern.match(i)):
            count += 1
    return count

# Only lower case count!
print("Returns :: ", vowelCount("abcdefghi"))
print("Returns :: ", vowelCount("Some One Special"))
print("Returns :: ", vowelCount("Hello There My Friend"))
