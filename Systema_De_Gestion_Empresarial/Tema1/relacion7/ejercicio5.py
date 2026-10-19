categorias = ["categoria1", "categoria2", "categoria1", "categoria4"]
productos = ["Telefono", "ordenadores", "coches", "mesas", "mesas"]
categorias_unicas = set(categorias)
print(categorias_unicas)
user = input("Escribe el producto que quieras buscar: ").strip().lower()
for producto in productos:
    if user in producto:
        print(producto)
