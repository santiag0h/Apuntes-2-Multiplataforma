class Producto:
    def __init__(self,nombre,precio,stock):
        self.nombre=nombre
        self.precio=precio
        self.stock=stock
    def mostrar(self):
        print(f"El nombre del producto es {self.nombre} su precio es {self.precio} y su stock es {self.stock}")

producto1=Producto("Coche",5000,200)
producto1.mostrar()
producto2=Producto("juguete",30,5000)
producto2.mostrar()