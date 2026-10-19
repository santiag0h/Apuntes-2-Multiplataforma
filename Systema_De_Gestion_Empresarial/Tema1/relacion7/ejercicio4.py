vector = [
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
disponible=0
for producto in vector:
    producto=producto.copy()
    if producto["stock"]>0:
        print(f"{producto}")
        disponible+=1

print(f"hay {disponible} productos disponibles")

        