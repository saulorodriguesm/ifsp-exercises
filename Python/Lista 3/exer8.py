maior = menor = contador = 0
while True:
    valor = int(input("Digite um valor\n"))
    if valor < 0:
        break
    if contador == 0:
        maior = valor
        menor = valor
    elif valor > maior:
        maior = valor
    elif valor < menor:
        menor = valor
    contador +=1
print("Maior valor:",maior,"\n")
print("Menor valor:",menor)