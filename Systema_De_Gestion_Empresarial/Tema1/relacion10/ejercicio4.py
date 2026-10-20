class empleado:
    def __init__(self,nombre,salario):
        self.nombre=nombre
        self.salario=salario

class Comercial(empleado):
    def __init__(self,nombre,salario,ventas):
        super() .__init__(nombre,salario)
        self.ventas=ventas

    def calcular_bonus(self):
        bonus=self.ventas*0.05
        return bonus

    def resumen(self):
        devolver=f"El usuario {self.nombre}  tiene un salario de  {self.salario}"
        return devolver
comercial1=Comercial("santiago",1600,5000)
bonus=comercial1.calcular_bonus()
resumen=comercial1.resumen()
print(f"{resumen} y se le sumara un bonus de {bonus}")