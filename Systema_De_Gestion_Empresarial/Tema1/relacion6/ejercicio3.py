total = 0
contador = 0
b = 1
while b != 0:
    a = int(input("Introduce un nuemero "))
    if a != 0:
        contador += 1
        total += a
    else:
        b = 0
print(f"El total es {total} y hay un total de {contador} veces")
