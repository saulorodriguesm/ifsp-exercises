val1 = int(input("Digite um lado: \n"))
val2 = int(input("Digite outro lado: \n"))
val3 = int(input("Digite outro lado: \n"))
if (val1 + val2) < val3 or (val1 + val3) < val2 or (val2 + val3) < val1:
    result = "Esse não é um triângulo :/"
elif val1 == val2 and val1 == val3:
    result = "Triângulo Equilátero"
elif (val1 == val2 and val1 != val3) or (val2 == val3 and val1 != val3) or (val1 == val3 and val2 != val3):
    result = "Triângulo Isósceles"
else:
    result = "Triângulo Escaleno"
print("Este é um triângulo...:",result)
