comprobar=1
while comprobar==1:
    try:
        resultado=int(input("Introduce un numero: "))
        comprobar=0
        print(resultado)
        
    except ValueError:
        print("Ha ocurrido un error introduce un numero")
        continue