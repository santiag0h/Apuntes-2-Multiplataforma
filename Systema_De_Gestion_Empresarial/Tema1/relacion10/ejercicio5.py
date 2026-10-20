class LineaPedido:
    def __init__(self, producto, precio, cantidad):
        self.producto = producto
        self.precio = precio
        self.cantidad = cantidad

    def subtotal(self):
        subtotal = self.precio*self.cantidad
        return subtotal


class Pedido:
    def __init__(self, cliente, lineas=None):
        self.cliente = cliente
        if lineas is not None:
            self.lineas = lineas
        else:
            self.lineas = []

    def agregar_linea(self, linea):
        self.lineas.append(linea)

    def total(self):
        total = sum(linea.subtotal() for linea in self.lineas)
        return total


pedido1 = Pedido("Carlos")
linea1 = LineaPedido("Camiseta", 15, 2)
linea2 = LineaPedido("Pantalón", 30, 1)
pedido1.agregar_linea(linea1)
pedido1.agregar_linea(linea2)
resultado = pedido1.total()
print(resultado)
