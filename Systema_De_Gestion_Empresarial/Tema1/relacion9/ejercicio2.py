def leer_entero(mensaje,minimo,maximo):
    comprobar=1
    while comprobar==1:
        try:
            resultado=int(input(f"{mensaje}: "))
            if(resultado<minimo or maximo<resultado):
                print("el numero no esta en el rango: ")
                continue
            else:
                comprobar=0      
                return resultado 
            
        except ValueError:
            print("Ha ocurrido un error introduce un numero")
            continue
resultado=leer_entero("Introduce un numero entre(1-100)",1,100)
print(resultado)