import sys
import re


def clean_pokemon(pokemon_list, pokemon_string):
    done = True
    for pokemon in range(len(pokemon_list)):
        if(pokemon_list[pokemon] in pokemon_string):
            pokemon_string = pokemon_string.replace(pokemon_list[pokemon], "")
            done = False

    return (pokemon_string, done)


def search_pokemon(pokemon_list, pokemon_string):
    done = False
    done_reverse = False

    while(not done or not done_reverse):
        pokemon_string = pokemon_string[::-1]
        (pokemon_string, done) = clean_pokemon(pokemon_list, pokemon_string)
        pokemon_string = pokemon_string[::-1]
        (pokemon_string, done_reverse) = clean_pokemon(pokemon_list, pokemon_string)

    return pokemon_string


if __name__ == "__main__":
    with open(sys.argv[1]) as file:
        input = file.readlines()
        input = [line.rstrip() for line in input]

    for i in range(int(input.pop(0))):
        case = input.pop(0).split(" ")
        pokemon_list = []
        pokemon_string = []

        for pokemon in range(int(case[0])):
            pokemon_list.append(input.pop(0))

        for pokemon in range(int(case[1])):
            pokemon_string.append(input.pop(0).replace(" ", ""))

        resultado = search_pokemon(pokemon_list, "".join(pokemon_string))
        print("Case #%(case)d: %(res)s" % {"case": (i+1), "res": resultado})
