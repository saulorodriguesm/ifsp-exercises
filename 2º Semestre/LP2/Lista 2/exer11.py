val = int(input("Digite um número: \n"))
if val < 0:
    status = "Negativo"
elif val == 0:
    status = "Zero"
else:
    status = "Positivo"
print("Número digitado é: ",status)
