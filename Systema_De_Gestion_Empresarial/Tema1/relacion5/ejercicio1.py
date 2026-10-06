nombre=input("Introduce tu nombre:")
stock=input("Stock:")
hola=int(stock)

if hola<0:
    print(f"Introduce un valor valido")
elif hola==0 :
    print(f"Stock agotado")
elif hola<6 and hola>0 :
    print(f"stock bajo")
else:
    print(f"stock suficiente")
