inputUrl = open("input.txt", "r")
ipList = inputUrl.readlines()
inputUrl.close()
correctIp = list()
wrongIp = list()

for i in range (len(ipList)):
    listing = ipList[i].rsplit(".")
    if (len(listing) == 4 and int(listing[0]) <= 255 and int(listing[0]) >= 0 and int(listing[1]) <= 255 and int(listing[1]) >= 0 and int(listing[2]) <= 255 and int(listing[2]) >= 0 and int(listing[3]) <= 255 and int(listing[3]) >= 0):
        correctIp.append(ipList[i])
    else:
        wrongIp.append(ipList[i])

outputUrl = open("output.txt", "w")
outputUrl.write("[Enderecos válidos:]\n")
outputUrl.writelines(correctIp)
outputUrl.write("[Enderecos inválidos:]\n")
outputUrl.writelines(wrongIp)
outputUrl.close()