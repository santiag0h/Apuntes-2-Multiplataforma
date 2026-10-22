import csv
from pathlib import Path

Ruta = Path(__file__).with_name("ejercicio2.csv")





    

def busqueda_por_texto(clientes):
        busqueda=input("Pon el nombre del cliente: ").strip().lower()
        encontrado=0
        for cliente in clientes:
            if busqueda in cliente["nombre"].lower():
                print("EL cliente esta en los archivos: ")
                encontrado=1
        if encontrado==0:
            print("no encontrado")



def desactivacion(clientes):
    busqueda=input("Pon el nombre del cliente: ").strip().lower()
    for cliente in clientes:
        if busqueda in cliente["nombre"].lower():
            print("EL cliente ha sido borrado: ")
            clientes.remove(cliente)
            encontrado=1
        if encontrado==0:
            print("no encontrado")
    


def listado(clientes):
    if clientes!=[]:
        for clave in clientes:
            print(f"El cliente {clave['nombre']} tiene de email {clave['email']} y es de la ciudad {clave['ciudad']} y está {clave['activo']}")
            
    else:
        print("No hay clientes registrados")

def guardado(clientes):
    with open(Ruta, "w", newline="", encoding="utf-8") as archivo:
        escritor = csv.DictWriter(
            archivo, fieldnames=["nombre", "email", "ciudad", "activo"])
        escritor.writeheader()
        escritor.writerows(clientes)
    return len(clientes)


def carga():
    lista=[]
    with open(Ruta, "r", newline="", encoding="utf-8") as archivo:
        lector = csv.DictReader(archivo)
        for fila in lector:
            lista.append({
                "nombre": fila["nombre"],
                "email": fila["email"],
                "ciudad": fila["ciudad"],
                "activo": fila["activo"].strip().lower() == "true",
            })
    
        print("archivo leido correctamente")
    return lista
def dar_alta(clientes):
    nombre=input("Introduce el nombre ")
    email=input("Introduce el email ")
    ciudad=input("Introduce el ciudad ")
    activo=input("Introduce el activo ")
    clientes.append({
        "nombre": nombre,
        "email": email,
        "ciudad": ciudad,
        "activo": activo,
    })
def main():
    clientes=[]
    comprobar=1
    while comprobar==1:
        try:
            Eleccion=int(input("Introduce un numero: "))
            if Eleccion==1:
                guardado(clientes)
               
            elif Eleccion==2:
                clientes=carga()
            elif Eleccion==3:
                listado(clientes)
            elif Eleccion==4:
                dar_alta(clientes)
            elif Eleccion==5:
                busqueda_por_texto(clientes)
            elif Eleccion==6:
                desactivacion(clientes)
            if Eleccion==0:
                return


        except ValueError:
            print("Ha ocurrido un error introduce un numero")
            continue



if __name__ == "__main__":
    main()

# hay que hacer lo if is main o algo asi para practicarlo para el examen
