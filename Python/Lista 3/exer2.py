faturamento = 0
valorWatt = 0
valorTotal = 0
qtdCons = 0
while True:
    salario = float(input("Digite o salário mínimo\n"))
    watts = float(input("Digite a quantidade de quilowatts gasto\n"))
    if(watts == 0):
        break
    consumidor = int(input("Seu tipo de consumidor (1-residencial, 2-comercial, 3-industrial)\n"))
    valorWatt = salario / 8
    valorWatts = watts * valorWatt
    if consumidor == 1:
        valorTotal = valorWatts + (valorWatts * 0.05)
    elif consumidor == 2:
        valorTotal = valorWatts + (valorWatts * 0.1)
    elif consumidor == 3:
        valorTotal = valorWatts + (valorWatts * 0.15)
    faturamento = faturamento + valorTotal
    if(valorTotal >= 500 and valorTotal <= 1000 ):
        qtdCons = qtdCons + 1
    print("Valor de cada QuiloWatt:",valorWatt,"\n")
    print("Valor pago do consumidor:",valorTotal,"\n")
print("Faturamento Total da empresa:",faturamento,"\n")
print("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1000,00:",qtdCons)