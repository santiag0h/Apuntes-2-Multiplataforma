class Producto:
    def __init__(self, nombre, stock):
        self.nombre = nombre
        self.stock = stock

    def Reponer(self, cantidad):
        self.stock += cantidad

    def Vender(self, cantidad):
        if self.stock >= cantidad:
            self.stock -= cantidad
            return "true"
        else:
            return "false"
producto1=Producto("coches",100)
producto1.Reponer(200)
producto1.Vender(500)

print(producto1.stock)