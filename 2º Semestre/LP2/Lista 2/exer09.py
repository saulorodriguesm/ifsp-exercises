val = float(input("Digite o valor total de serviços: \n"))
if val <= 150.00:
    val = val * 0.05
elif val > 150.00 and val <= 300.00:
    val = val * 0.07
elif val > 300.00 and val <= 500.00:
    val = val * 0.10
else:
    val = val * 0.20

print("O desconto será de:",round(val, 2))
