comprobar = 1
while comprobar != 0:
    opcion = int(input("Introduce una opcion 1,2,3,0 "))
    if opcion == 0:
        comprobar = 0
        print("Te has salido")
    elif opcion == 1:
        print("Te has dado el alta")
    elif opcion == 2:
        print("Has hecho una consulta")
    elif opcion == 3:
        print("has subido el informe")
    else:
        print("pon una opcion valida")
