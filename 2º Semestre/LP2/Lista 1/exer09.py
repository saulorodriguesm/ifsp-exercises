cheque1 = float(input("Digite o valor do primeiro cheque:\n"))
cheque2 = float(input("Digite o valor do segundo cheque:\n"))
salarioAtual = (cheque1 + cheque2) - ((cheque1 * 0.038) + (cheque2 * 0.038))
print("O seu salário atual é:",round(salarioAtual, 2))