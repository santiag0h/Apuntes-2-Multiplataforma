print("1) listar productos")
print("2) añadir producto,")
print("3) modificar stock")
print("4) buscar por nombre")
print("5) guardar en CSV")
print("0) salir")
lista = [
    {
        "nombre": "coches",
        "categoria": "automoviles",
        "precio": 2000,
        "stock": 100
    },
    {
        "nombre": "tostadoras",
        "categoria": "electrodomesticos",
        "precio": 20,
        "stock": 5000
    },
    {
        "nombre": "ventiladores",
        "categoria": "electrodomesticos",
        "precio": 40,
        "stock": 0
    },
    {
        "nombre": "Camisetas",
        "categoria": "Ropa",
        "precio": 40,
        "stock": 30
    }

]


def listar_producto():
    for producto in lista:
        productos = producto.copy()
        print(f"{productos}")


def anadir_producto():
    nombre = input("Añade el nombre: ")
    categoria = input("Añade la categoria: ")
    precio = input("Añadele un precio: ")
    stock = input("Añade un stock ")
    nuevo_producto = {
        "nombre": nombre,
        "categoria": categoria,
        "precio": precio,
        "stock": stock
    }
    lista.append(nuevo_producto)
    print("nuevo producto añadido")


def buscar_por_nombre():
    buscar = input("Busca un producto: ")
    encontrado = 1
    for producto in lista:
        if buscar in producto["nombre"]:
            print(f"Hemos encontrado este producto: {producto}")
            encontrado = 0
    if encontrado == 1:
        print("No hemos podido encontrar su producto")


def modificar_stock():
    buscar = input("Busca un producto: ")
    encontrado = 1
    for producto in lista:
        if buscar in producto["nombre"]:
            nuevo = input(
                "Hemos encontrado el producto correctamente introduzca una nueva stock:")
            producto["stock"] = nuevo
            print(f"Hemos modificado el stock correctamente")
            encontrado = 0
    if encontrado == 1:
        print("No hemos podido encontrar su producto")


def guardar_en_csv():
    with open("ejercicio1.csv", "w", encoding="utf-8") as archivo:
        
        for producto in lista:
            archivo.write(f"{producto['nombre']};{producto['categoria']};{producto['precio']};{producto['stock']}\n")
        print("Guardado en CSV correctamente.")      


eleccion = 1
while eleccion != 0:
    try:
        eleccion = int(input("Elije: "))
    except ValueError:
        print("introduce un numero valido")
        continue
    if eleccion == 1:
        listar_producto()
    if eleccion == 2:
        anadir_producto()
    if eleccion == 3:
        modificar_stock()
    if eleccion == 4:
        buscar_por_nombre()
    if eleccion ==5:
        guardar_en_csv()
