class cliente:
    def __init__(self,nombre,email,ciudad,activo):
        self.nombre=nombre
        self.email=email
        self.ciudad=ciudad
        self.activo=activo

    def dar_alta(self):
        self.activo=True

    def listado(self):
        resultado=f"El cliente {self.nombre} tiene de email {self.email} y es de la ciudad {self.ciudad} y esta {self.activo}"
        return resultado
    def busqueda_por_texto():
        hola=1
    def desactivacion(self):
        self.activo=False
    def guardado():
        hola=1
    def carga():
        hola=1

clientes=[]
cliente1=cliente("santi","santi@gmail.com","Granada",False)
clientes.append(cliente1)
cliente1.dar_alta()

mostrar=cliente1.listado()
print(mostrar)
#hay que hacer que se active escribiendo el usuario 1,2,3,4,5...
#hay que hacer lo if is main o algo asi para practicarlo para el examen 