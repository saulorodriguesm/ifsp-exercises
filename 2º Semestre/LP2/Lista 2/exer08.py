val = float(input("Digite o valor da compra: \n"))
if val <= 100.00:
    val = val / 2
    parcela = 2
elif val > 200.00 and val <= 400.00:
    val = val / 4
    parcela = 4
elif val > 100.00 and val <= 200.00:
    val = val / 3
    parcela = 3
else:
    val = val / 5
    parcela = 5

print("O valor das",parcela,"parcelas sem juros é:",round(val, 2))
