import sys


def count(code, word):
    counter = 0
    for i in word:
        counter += code[i]

    return counter


def winner(code, words):
    if count(code, words[0]) == count(code, words[1]):
        return "-"

    return words[0] if count(code, words[0]) > count(code, words[1]) else words[1]


def parse_code(code):
    dic = {}
    if "=" in code:
        code = code.split(",")
        for i in code:
            key, value = i.split("=")
            dic[key] = float(eval(value))

    elif ":" in code:
        dic = eval(code)
    else:
        code = list(eval(code))
        for i in code:
            key, val = i
            dic[key] = val

    return dic


if __name__ == "__main__":
    with open(sys.argv[1]) as file:
        input = file.readlines()
        input = [line.rstrip() for line in input]

    for i in range(int(input.pop(0))):
        words, code = input.pop(0).split("|")
        words = words.split("-")
        code = parse_code(code)
        print("Case #%(case)d: %(winner)s" %
              {"case": (i+1), "winner": winner(code, words)})
