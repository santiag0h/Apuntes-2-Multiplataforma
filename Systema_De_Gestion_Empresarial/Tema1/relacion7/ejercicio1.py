productos=["Teclado","Raton","Monitor"]
productos.append("webcam")
productos.remove("Raton")
productos.sort() #ordenar los productos alfabeticamente
for i,producto in enumerate(productos, start=1):
    print(i,productos)