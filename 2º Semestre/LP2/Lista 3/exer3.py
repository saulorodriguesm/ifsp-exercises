a = 0
b = 0
c = 0
d = 0
e = 0
f = 0
for item in range(20):
    dado = int(input("Digite o número sorteado\n"))
    print("Número sorteado foi",dado)
    if dado == 1:
        a = a + 1
    elif dado == 2:
        b = b + 1
    elif dado == 3:
        c = c + 1
    elif dado == 4:
        d = d + 1
    elif dado == 5:
        e = e + 1
    elif dado == 6:
        f = f + 1
print("O número 1 foi sorteado",a,"vezes\n")
print("O número 2 foi sorteado",b,"vezes\n")
print("O número 3 foi sorteado",c,"vezes\n")
print("O número 4 foi sorteado",d,"vezes\n")
print("O número 5 foi sorteado",e,"vezes\n")
print("O número 6 foi sorteado",f,"vezes\n")