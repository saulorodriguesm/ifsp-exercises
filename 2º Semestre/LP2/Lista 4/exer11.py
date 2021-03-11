numeros = []
par = []
impar = []
for i in range(10):
    numero = int(input("Digite um número\n"))
    numeros.append(numero)
    if numero % 2 == 0:          
        par.append(numero)
    else:
        impar.append(numero)
print("Os números digitados foram",numeros,"dentre eles esses são pares",par,"e estes são ímpares",impar)
