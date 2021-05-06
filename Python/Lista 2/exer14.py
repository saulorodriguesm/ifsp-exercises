val1 = input("Melhor matéria do 2º Semestre: \n a) LP2 \n b) ADM \n c) SO \n d) ESW \n")
val2 = input("\nMelhor time do Brasil: \n a) Flamengo \n b) Palmeiras \n c) São Paulo \n d) Corinthians\n")
val3 = input("\nMelhor herói: \n a) Superman \n b) Batman\n c) Homem-Aranha\n d) Hulk\n")
resultado = 0
if val1 == "a":
    resultado = resultado + 1
if val2 == "d":
    resultado = resultado + 1
if val3 == "b":
    resultado = resultado + 1
print("Você acertou ",resultado," questões")
print("As respostas corretas são:\n Melhor matéria do 2º Semestre: LP2\n Melhor time do Brasil: Corinthians\n Melhor herói: Batman")
