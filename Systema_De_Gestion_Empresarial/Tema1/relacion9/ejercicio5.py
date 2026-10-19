def calcular_subtotal(precio,cantidad):
    resultado=precio*cantidad
    return resultado

def aplicar_descuento(importe,porcentaje):
    resultado=importe-(importe*porcentaje/100)
    return resultado