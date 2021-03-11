carros = ['Fusca','Gol','Vectra','Uno','Amarok']
consumo = [20.0,18.0,9.5,15.0,5.7]
economico = 9999
j = 0
for i in consumo:    
    print(j+1,"-",carros[j],"-",i,"-",round(1000/i,1),"litros - R$",round(1000/i*2.25,1))
    if i < economico:
        economico = i
        carro = j
    j+=1
print("O menor consumo é do",carros[carro])