val = float(input("Digite o valor do empréstimo: \n"))
parcela = int(input("Digite a quantidade de parcelas: \n"))
if parcela <= 3:
    val = val * 0.06
elif parcela > 3 and parcela <= 6:
    val = val * 0.09
elif parcela > 6 and parcela <= 12:
    val = val * 0.22
else:
    val = val * 0.34

print("O valor dos juros será: ",round(val, 2))
