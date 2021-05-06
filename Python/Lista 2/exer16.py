valor = int(input("Digite um ano: \n"))
if valor % 400 == 0 or (valor % 4 == 0 and valor % 100 > 0):
    print("Esse ano é bissexto")
else:
    print("Esse ano não é bissexto")

