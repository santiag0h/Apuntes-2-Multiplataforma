"""UD1 · PT1 · Persistencia CSV. Sin print() ni input()."""
import csv

CAMPOS = ["codigo", "propietario", "modelo", "valor", "estado"]


def cargar_bicicletas(ruta):
    """Lee el CSV y devuelve una lista de objetos Bicicleta.

    Convierte el valor a número y respeta el estado del archivo.
    La primera línea contiene las cabeceras indicadas en CAMPOS.
    """
    # TODO: csv.DictReader, with open(..., encoding="utf-8", newline="")
    with open(ruta,"r",encoding="utf-8") as archivo:
        lineas=[]
        #linea para hacer commit final
        for linea in archivo:
            bicicleta={}
            bicicleta.append(linea)
            lineas.append(bicicleta)
    return lineas


def guardar_bicicletas(ruta, bicicletas):
    """Escribe el CSV con cabecera y todas las bicicletas; devuelve True al guardar."""
    # TODO: csv.DictWriter, with open(..., encoding="utf-8", newline="")
    return False
