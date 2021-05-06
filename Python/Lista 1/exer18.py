import math
velocidade = int(input("Digite o valor da velocidade\n"))
angulo = int(input("Digite o valor do ângulo em graus\n"))
angRad = math.sin(2 * math.radians(angulo))
alcance = (velocidade*velocidade / 9.81) * angRad
print("Alcance é", round(alcance, 2))