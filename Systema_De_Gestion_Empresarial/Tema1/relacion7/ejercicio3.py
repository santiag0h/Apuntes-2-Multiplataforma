
diccionario = {
    "nombre": "santiago",
    "ciudad": "Granada",
    "email": "santi@gmail.com",
    "activo": "si"
}
cliente_anterior = diccionario.copy()
diccionario["telefono"] = "722340572"
diccionario["ciudad"] = "Maracena"
print(f"{cliente_anterior}\n{diccionario}")
