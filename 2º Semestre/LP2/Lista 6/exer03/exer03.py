import random
def acertouLetra(letra, palavra):
    acertos = 0
    for i in palavra:
        if letra.lower() in i.lower():
            acertos += 1
    return acertos
def montaEstrutura(palavra, erros, letras):
    existeLetra = False  
    estrutura = "|---------------|\n"
    if erros == 1:
        estrutura += "|               O\n"
    elif erros == 2:
        estrutura += "|              O\n"
        estrutura += "|              |\n"
    elif erros == 3:
        estrutura += "|              O\n"
        estrutura += "|             /|\n"
    elif erros == 4:
        estrutura += "|              O\n"
        estrutura += "|             /|\\\n"
    elif erros == 5:
        estrutura += "|              O\n"
        estrutura += "|             /|\\\n"
        estrutura += "|             /\n"
    elif erros == 6:
        estrutura += "|              O\n"
        estrutura += "|             /|\\\n"
        estrutura += "|             /\\\n"
    estrutura += "|\n" * 4
    estrutura += "|   "                         
    for i in palavra:
        for letra in letrasAcertadas:
            if letra in i.lower():
                estrutura += letra.lower() + " "
                existeLetra = True
        if(not existeLetra):
            estrutura += "_ "  
        existeLetra = False       
    return estrutura
animais = ['gato','cachorro','cavalo','jumento','peixe','zebra','papagaio','girafa','pomba','lagosta']
escolhida = random.choice(animais)
letrasAcertadas = []
letrasTentativas = []
estrutura = montaEstrutura(escolhida, 0, letrasAcertadas)
print(escolhida)
print(estrutura)
erros = 0
acertos = 0
while True:
    if(erros == 6):
        print("Perdeu! Vai de next")
        break
    letra = input("\n\nDigite uma letra: ")
    if letra in letrasTentativas or letra in letrasAcertadas:
        print("Está letra ja foi!")
    else:
        acertou = acertouLetra(letra, escolhida)
        if acertou > 0:
            acertos += acertou
            letrasAcertadas.append(letra)
        else:
            erros += 1        
            letrasTentativas.append(letra) 
        estrutura = montaEstrutura(escolhida, erros, letrasAcertadas)
        print(estrutura)
        print("Letras erradas: ", end = "")
        print(letrasTentativas)
        if acertos == len(escolhida):
            print("Ganhou! Boa")
            break  