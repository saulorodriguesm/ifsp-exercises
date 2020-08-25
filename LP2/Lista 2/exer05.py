val = float(input("Digite o valor total de serviços: \n"))
if val <= 5000.00:
    val = val * 0.04
elif val > 5000.00 and val <= 10000.00:
    val = val * 0.06
elif val > 1000.00 and val <= 20000.00:
    val = val * 0.13
else:
    val = val * 0.16

print("O valor do imposto de ISS é: ",round(val, 2))
