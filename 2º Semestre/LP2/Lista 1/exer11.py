salMin = float(input("Digite o valor do salário mínimo: \n"))
quiloW = float(input("Digite a quantidade de quilowatt: \n"))
valorQuilo = salMin / 700
valorPago = valorQuilo * quiloW
ValorDesc = valorPago - (valorPago* 0.1)
print("Valor de cada quilowatt é:", round(valorQuilo, 2),"\n O valor pago é:",round(valorPago, 2),"\nO valor pago descontado é: ",round(ValorDesc, 2))