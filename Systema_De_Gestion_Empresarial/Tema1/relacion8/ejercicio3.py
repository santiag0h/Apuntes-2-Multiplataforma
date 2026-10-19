def aplicar_descuentos(importe, porcentaje=0):
    porcentaje = importe*porcentaje/100
    final = importe-porcentaje
    return final


llamar1 = aplicar_descuentos(20)
print(llamar1)
llamar2 = aplicar_descuentos(20, 10)
print(llamar2)
