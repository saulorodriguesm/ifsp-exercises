num = float(input("Digite um número positivo: \n"))
if(num > 0):
    quadrado = num ** 2
    cubo = num ** 3
    raizQuad = num ** (1/2)
    raizCub = num ** (1/3)
    soma = quadrado + cubo
    print("O número digitado foi:",num,"\nO número digitado ao quadrado:",quadrado,"\nO número digitado ao cubo:",cubo,"\nA raíz do número digitado é:",raizQuad,"\nA raíz cúbica do número digitado é:",raizCub,"\nSoma do quadrado e cubo:",soma)
else:
    print("Somente números positivos são aceitos")