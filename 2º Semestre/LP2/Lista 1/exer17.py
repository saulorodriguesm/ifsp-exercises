valor = int(input("Digite o valor à ser pago: \n"))
if(valor >= 50):
    quant50 = valor // 50
    valor = valor - (quant50 * 50)
    if(valor >= 10):
        quant10 = valor // 10
        valor = valor - (quant10 * 10)
        if(valor < 10):
            quant1 = valor
print("Precisa de: ",quant50,"notas de 50, além de: ",quant10,"notas de 10 e ",quant1,"notas de 1.")