val = float(input("Digite o valor do produto: \n"))
tipo = input("Digite o tipo do produto: \n")
if tipo == "Cesta Básica":
    val = 0
elif tipo == "Serviços":
    val = val * 0.18
elif tipo == "Eletrônicos":
    val = val * 0.25
else:
    val = val * 0.12

print("O valor do imposto será: ",round(val, 2))