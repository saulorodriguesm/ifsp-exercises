val = float(input("Digite o valor de vendas: \n"))
if val <= 5000.00:
    val = val * 0.02
elif val > 5000.00 and val <= 10000.00:
    val = val * 0.05
elif val > 10000.00 and val <= 15000.00:
    val = val * 0.07
else:
    val = val * 0.09

print("Sua comissão é:",round(val, 2))