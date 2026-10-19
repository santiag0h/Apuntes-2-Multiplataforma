nombre1=input("Introduce el nombre: ")
ciudad1=input("Introduce la ciudad: ")
nombre2=input("Introduce el nombre: ")
ciudad2=input("Introduce la ciudad: ")
nombre3=input("Introduce el nombre: ")
ciudad3=input("Introduce la ciudad: ")

with open("clientes.txt", "w", encoding="utf-8") as archivo:
    archivo.write(f"El usuario es {nombre1} y su ciudad {ciudad1}.\n")
    archivo.write(f"El usuario es {nombre2} y su ciudad {ciudad2}.\n")
    archivo.write(f"El usuario es {nombre3} y su ciudad {ciudad3}.\n")