destino=input("Pon un destino (PENINSULA, BALEARES o CANARIAS): ").strip().upper()
pedido=int(input("Pon el total del pedido: "))
if destino=="PENINSULA" and pedido>=100:
    print(f"El envio cuesta con pedido incluido {pedido}")
elif destino=="PENINSULA" and pedido<100:
    print(f"El envio cuesta con pedido incluido {pedido+6}")
elif destino=="BALEARES":
    print(f"El envio cuesta con pedido incluido {pedido+12}")
elif destino=="CANARIAS":
    print(f"El envio cuesta con pedido incluido {pedido+18}")
else:
    print("El destino no es valido")