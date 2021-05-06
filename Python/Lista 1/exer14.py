face = int(input("Digite a quantidade de faces: \n"))
aresta = int(input("Digite a quantidade de arestas: \n"))
if(face > 0 and aresta > 0):
    vertices  = aresta - face + 2
    print("Número de vértices: ", vertices)
else:
    print("Apenas números inteiros e positivos")