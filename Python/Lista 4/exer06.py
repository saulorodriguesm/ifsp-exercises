import random
animais = ['gato','cachorro','cavalo','jumento','peixe','zebra','papagaio','girafa','pomba','lagosta']
escolhida = random.choice(animais)
shuffled = list(escolhida)
random.shuffle(shuffled)
shuffled = "".join(shuffled)
print("A palavra embaralhada é",shuffled,"\n")
tentativa = input("Qual a palavra embaralhada?\n")
if escolhida == tentativa.lower():
    print("Você acertou, parabéns")
else:
    print("Você errou")
print("A palavra era",escolhida)
