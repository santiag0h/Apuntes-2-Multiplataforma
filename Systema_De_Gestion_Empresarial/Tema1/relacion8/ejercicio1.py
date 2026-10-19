def calcular_subtotal(precio,cantidad):
    final=precio*cantidad
    return final
precio =int(input("Introduce el precio: "))
cantidad=int(input("Introduce la cantidad: "))

resultado=calcular_subtotal(precio,cantidad)
print(resultado)