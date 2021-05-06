cpf = input("Digite seu CPF\n")
if len(cpf) == 14 and cpf[3] == "." and cpf[7] == "." and cpf[11] == "-":
    print("É um CPF")
else:
    print("Não é um CPF")