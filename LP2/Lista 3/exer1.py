menorIdadeFem = 150
qtdFem = qtdExpFem = qtdMasc = qtdExpMasc = qtdIdadeMasc = somaIdadeMasc = 0
while True:
    idade = int(input("Digite a sua idade\n"))
    if(idade == 0):
        break
    sexo = input("Digite o seu sexo (M ou F)\n")
    xp = input("Têm experiência no serviço (S ou N)\n")
    if(sexo == "F"):
        qtdFem = qtdFem + 1
        if(xp == "S"):
            if(menorIdadeFem > idade):
                menorIdadeFem = idade
            if(idade <= 21):
                qtdExpFem = qtdExpFem + 1
    if(sexo == "M"):
        qtdMasc = qtdMasc + 1
        if(xp == "S"):
            somaIdadeMasc = somaIdadeMasc + idade
            qtdExpMasc = qtdExpMasc + 1
        if(idade >= 45):
            qtdIdadeMasc = qtdIdadeMasc + 1
if somaIdadeMasc != 0 and qtdExpMasc != 0:
    media = somaIdadeMasc / qtdExpMasc
else:
    media = 0
if(qtdFem == 0):
    menorIdadeFem = 0
print("O número de candidatos do sexo feminino:",qtdFem,"\n")
print("O número de candidatos do sexo masculino:",qtdMasc,"\n")
print("A idade média dos homens que já tem experiência no serviço:",media,"\n")
print("A porcentagem dos homens com mais de 45 anos entre o total dos homens:",qtdIdadeMasc,"\n")
print("O número de mulheres com idade inferior a 21 anos e com experiência no serviço:",qtdExpFem,"\n")
print("A menor idade entre as mulheres que já tem experiência no serviço:",menorIdadeFem,"\n")