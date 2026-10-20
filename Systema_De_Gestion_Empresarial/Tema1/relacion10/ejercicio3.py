class Cliente:
    def __init__(self, nombre, email, ciudad):
        self.nombre = nombre
        self.email = email
        self.ciudad = ciudad

    def cambiar_ciudad(self, nueva_ciudad):
        self.ciudad = nueva_ciudad

    def ficha(self):
        mensaje = "El usuari "+self.nombre+" de email "+self.email + " ha fichado"
        return mensaje

    def donde_ficha(self):
        mensaje = "El usuario "+self.nombre+" ficha en " + self.ciudad
        return mensaje
    
cliente1=Cliente("Santi","santihidalgotaoufiki@gmail.com","Granada")
donde1=cliente1.donde_ficha()
print(donde1)
cliente1.cambiar_ciudad("maracena")
ficha=cliente1.ficha()
print(ficha)
donde2=cliente1.donde_ficha()
print(donde2)
