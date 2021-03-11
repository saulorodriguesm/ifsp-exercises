val1 = int(input("Digite um número: \n"))
val2 = int(input("Digite mais um número: \n"))
operacao = input("Qual operação deseja? (Multiplicação - Soma - Subtração - Divisão)\n")
if operacao == "Multiplicação":
    val = val1 * val2
elif operacao == "Soma":
    val = val1 + val2
elif operacao == "Subtração":
    val = val1 - val2
elif operacao == "Divisão":
    val = val1 / val2
else:
    val = "Digite uma das operações sugeridas :)"
print("O resultado da operação é:",val)
