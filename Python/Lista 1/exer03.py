sal = float(input("Digite o seu salário:\n"))
aumento = int(input("Digite o aumento:\n"))
novoSal = sal + (sal*(aumento/100))
print("Seu novo salário é:",novoSal,"após o aumento de:",aumento,"%")