horas = float(input("Digite a quantidade de horas trabalhadas: \n"))
salMin = float(input("Digite o salário mínimo: \n"))
salHora = salMin/2
salBruto = salHora * horas
imposto = salBruto * 0.03
salReceber = salBruto - imposto
print("O salário que você receberá é:",round(salReceber, 2))