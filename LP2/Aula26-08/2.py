result = {}
while True:
    nome = input("Digite o seu nome\n")
    if nome == "":
        break
    nota1 = float(input("Digite a nota 1\n"))
    nota2 = float(input("Digite a nota 2\n"))

    result[nome] = [nota1, nota2]
print(result)