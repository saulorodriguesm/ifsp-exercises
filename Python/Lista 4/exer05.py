telefone = input("Digite um telefone\n")
traco = False
for i in telefone:
    if i == '-':
        traco = True
if len(telefone) == 7 or len(telefone) == 8 and traco:
    telefone = '3' + telefone 
print("Seu telefone é",telefone)