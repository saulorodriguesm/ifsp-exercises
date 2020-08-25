val = float(input("Digite o seu salário: \n"))
if val <= 1250.00:
    val = 0
elif val > 1900.00 and val <= 2700.00:
    val = val * 0.25
elif val > 1250.00 and val <= 1900.00:
    val = val * 0.11
else:
    val = val * 0.275

print("O valor de desconto é de: ",round(val, 2))