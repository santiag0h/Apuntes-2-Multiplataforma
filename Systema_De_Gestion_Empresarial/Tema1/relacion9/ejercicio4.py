import csv
from pathlib import Path

ruta = Path(__file__).with_name("modulo.csv")
lista = [
    {
        "nombre": "coches",
        "precio": 2000,
        "stock": 100
    },
    {
        "nombre": "tostadoras",
        "precio": 20,
        "stock": 5000
    },
    {
        "nombre": "ventiladores",
        "precio": 40,
        "stock": 0
    },
    {
        "nombre": "Camisetas",
        "precio": 40,
        "stock": 30
    }

]
with open(ruta, "w", encoding="utf-8") as archivo:
    for parte in lista:
        escritor = csv.DictWriter(
            archivo, fieldnames=["nombre", "precio", "stock"])
        escritor.writeheader()
        escritor.writerows(lista)

with open(ruta, "r", encoding="utf-8") as archivo:
    for linea in archivo:
        print(linea.strip())