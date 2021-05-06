
def convert(num):
    num = num/1024
    num = num/1024
    return num
def calcPerc(lista, num):   
    num = float(num) * 100
    num = num / sum(lista)
    return num

inputUrl = open("usuarios.txt", "r")
lista = inputUrl.readlines()
inputUrl.close()
report = "ACME Inc.  Uso do espaco em disco pelos usuarios\n"
report += "-------------------------------------------------------\n"
report += "Nr.\tUsuario\t\tEspaco utilizado\t % do uso\n"
user = []
storage = []
perc = []
sumVar = 0
for numero in lista:
    sumVar += (float(numero[14:]))
for i in lista:
    user.append(i[0:14])
    num = convert(int(i[14:]))
    storage.append(num)
for i in range (len(user)):
    numPerc = calcPerc(storage, storage[i])
    perc.append(numPerc)
    report += str(i+1) + "\t"
    report += user[i] + "\t"
    report += str(round((storage[i]), 2)) + "\tMB" + "\t\t"
    report += str(round((perc[i]), 2)) + "\n"

outputUrl = open("relatorio.txt", "w")
outputUrl.writelines(relatorio)