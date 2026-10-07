nombre=input("Introduce el nombre del producto:")
precio=float(input("Introduce el precio:"))
cantidad=int(input("Introduce la cantidad:"))
descuento=float(input("Introduce el descuento:"))
total1=((precio*cantidad)/100)*descuento
total2=(precio*cantidad)-total1
print(f"Con precio {precio}, cantidad{cantidad} y descuento{descuento}%, el total es:{total2:.2f}")