frase = input("Digite uma frase\n")
frase = frase.lower()
vogais = ['a','e','i','o','u']
j = 0
k = 0
for i in frase:
    if i in vogais:          
        j+=1
    if i in " ":
        k+=1
print(j)
print(k)