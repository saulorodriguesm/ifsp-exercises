palavra = input('Digite algo ai:')
vogais = ['a','e','i','o','u']
palavra_vogal = {}
for i in vogais:
    if i in palavra:
        palavra_vogal[i] = palavra.count(i)
print(palavra_vogal)