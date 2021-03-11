dicionario = {}
for i in range(2):
    palavra = input("Digite uma palavra\n")
    dicionario[i] = [palavra, len(palavra)]
print(dicionario)
if dicionario[0][0] == dicionario[1][0]:
    print("Conteúdo iguais")
if dicionario[0][1] == dicionario[1][1]:
    print("Comprimento iguais")