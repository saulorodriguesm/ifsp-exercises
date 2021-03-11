n1 = float(input("Digite a primeira nota: \n"))
n2 = float(input("Digite a segunda nota: \n"))
n3 = float(input("Digite a terceira nota: \n"))
n4 = float(input("Digite a quarta nota: \n"))
media1 = (n1 + n2 + n3 + n4) / 4
if media1 >= 7:
    status = "APROVADO"
else:
    ne = float(input("Digite a NE\n"))
    media2 =  (n1 + n2 + n3 + n4 + ne) / 5
    media1 = media2
    if media2 >= 5:
        status = "APROVADO EM EXAME"
    else:
        status = "REPROVADO"
print("Voce foi:",status," e a sua média foi: ",media1)

    