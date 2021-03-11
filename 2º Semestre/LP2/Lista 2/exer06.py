val = float(input("Digite o valor da compra: \n"))
if val <= 50.00:
    val = val * 0.05
elif val > 50.00 and val <= 100.00:
    val = val * 0.08
elif val > 100.00 and val <= 150.00:
    val = val * 0.12
else:
    val = val * 0.15

print("O valor de desconto é de: ",round(val, 2))
