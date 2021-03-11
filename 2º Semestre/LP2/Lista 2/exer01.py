val = float(input("Digite o valor do salário mínimo: \n"))
if val <= 600.00:
    val = val - (val * 0.07)
elif val > 600.00 and val <= 800.00:
    val = val - (val * 0.09)
elif val > 800.00 and val <= 1200.00:
    val = val - (val * 0.09)
else:
    val = val - (val * 0.11)

print("O valor líquido que será recebido é:",round(val, 2))