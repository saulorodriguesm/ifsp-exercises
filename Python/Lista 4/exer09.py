lista = []
soma = 0
for i in range(4):
    nota = float(input("Digite sua nota\n"))
    soma = soma + nota 
    lista.append(nota)
media = round(soma/4, 2)
print("Suas notas são",lista,", sendo assim sua média é",media)
if media >= 7:
    print("Você está aprovado")
elif media >= 4 and media < 7:
    print("Pegou exame")
else:
    print("Reprovou")