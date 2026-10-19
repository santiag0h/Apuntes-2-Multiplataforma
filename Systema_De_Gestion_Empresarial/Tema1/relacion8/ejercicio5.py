def pedir_datos():
    cliente = input("Introduce el nombre de un cliente: ")
    precio = int(input("Introduce el precio: "))
    cantidad = int(input("Introduce una cantidad: "))
    descuento = int(input("Introduce un decuento: "))
    datos = [cliente, precio, cantidad, descuento]
    return datos


def calcular_datos(datos):
    resultado = datos[2]*(datos[1]-(datos[1]*datos[3]/100))
    return resultado

def mostrar_resumen(resultado,datos):
    print(f"El cliente es {datos[0]} el precio es {datos[1]} la cantidad es {datos[2]} y el descuento es {datos[3]}")
    print(f"El resultado final es {resultado}")


def main():
    datos = pedir_datos()
    resultado = calcular_datos(datos)
    mostrar_resumen(resultado,datos)
main()