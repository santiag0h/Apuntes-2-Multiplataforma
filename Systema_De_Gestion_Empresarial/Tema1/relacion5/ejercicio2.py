Precio=int(input("Introduce el precio:"))
cantidad=int(input("Introduce la cantidad:"))
if cantidad<5:
    print(f"Con {Precio} EUR y {cantidad} unidades, el total tras el descuento debe ser {Precio*cantidad} EUR.")
elif cantidad<10:
    print(f"Con {Precio} EUR y {cantidad} unidades, el total tras el descuento debe ser {(Precio*cantidad)-(Precio*cantidad*0.05)} EUR.")
else:
    print(f"Con {Precio} EUR y {cantidad} unidades, el total tras el descuento debe ser {(Precio*cantidad)-(Precio*cantidad*0.10)} EUR.")