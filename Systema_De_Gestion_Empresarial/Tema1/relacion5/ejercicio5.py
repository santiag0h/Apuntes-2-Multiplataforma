tienda=float(input("Pon las ventas de la tienda: "))
web=float(input("Pon las ventas de la web: "))
telefono=float(input("Pon las ventas de la telefono: "))
if(tienda>(web and telefono)):
    print("tienda ha generado mas dinero")
elif(web>(tienda and telefono)):
    print("web ha generado mas dinero")
elif(telefono>(web and tienda)):
    print("telefono ha generado mas dinero")
elif(tienda==web or tienda==telefono):
    print("ha ocurrido un empate")

