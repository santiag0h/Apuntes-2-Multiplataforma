total=int(input("Pon la cantidad que puso el cliente "))
premium=input("El cliente es premium? pon S/N ")
if total>500 or (total>250 and premium=="S" ):
    print("el pedido es prioritario")
else:
    print("el pedido no es prioritario")
