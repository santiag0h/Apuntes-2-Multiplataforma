for i in range(3):
    meses = int(input("Introduce un numero de meses: "))
    for a in range(meses):
        productos = int(input("Introduce una cantidad de productos: "))
        print(f"El producto {i+1} tiene {productos} productos el mes {a+1}")
