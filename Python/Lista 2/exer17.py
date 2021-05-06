massa = float(input("Digite a sua massa: \n"))
altura = float(input("Digite a sua altura: \n"))
imc = massa / (altura * altura)
if imc < 17.00:
    status = "Você precisa comer urgentemente"
elif imc >= 17.00 and imc < 18.50:
    status = "Ta precisando comer um pouquinho mais"
elif imc >= 18.50 and imc < 25.00:
    status = "Ta no peso ideal :)"
elif imc >= 25.00 and imc < 30.00:
    status = "Ta engordando"
elif imc >= 30.00 and imc < 35.00:
    status = "Melhor se previnir, está no nivel Obesidade I"
elif imc >= 35.00 and imc < 40.00:
    status = "Walter Atacante do Goiás"
else:
    status = "Tu é um planeta (Obesidade III)"
print("Seu resultado é:",status)
