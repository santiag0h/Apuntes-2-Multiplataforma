nombre=input("Pon tu nombre:")
nombre_servicio=input("Pon el nombre del servicio:")
precio_unitario=input("Precio")
cantidad=input("Cantidad:")
unt=float(precio_unitario)
cant=int(cantidad)
subtotal=unt*cant
print(f"Con precio {unt:.2f} y cantidad {cant}, el subtotal es {subtotal:.2f} EUR.")