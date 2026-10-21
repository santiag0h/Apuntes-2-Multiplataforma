"""UD1 · PT1 · Clases del sistema BiciAlerta.

No escribas print() ni input() en las clases ni en sus métodos.
"""


class Bicicleta:
    def __init__(self, codigo, propietario, modelo, valor, estado="ROBADA"):
        self.codigo = codigo
        self.propietario = propietario
        self.modelo = modelo
        self.valor = valor
        self.estado = estado


class RegistroRobos:
    def __init__(self):
        # El código de la bicicleta será la clave del diccionario.
        self.bicicletas = {}

    def registrar(self, bicicleta):
        """Devuelve True si se añade; False si el código está repetido."""
        # TODO: comprobar duplicados y añadir al diccionario.
        for bicicleta.codigo in self.bicicletas:#vemos las bicicletas que hay y vemos si son iguales
            return False#devolvemos false ya que no funciona
        else:
            return True#Aqui funciona devovemos true

    def listar(self):
        """Devuelve la lista completa de objetos Bicicleta."""
        # TODO
        return self.bicicletas

    def recuperar(self, codigo):
        """Cambia ROBADA a RECUPERADA. Devuelve True si cambia algo."""
        # TODO: no modificar un código inexistente ni ya recuperado.
        return False

    def buscar(self, texto):
        """Busca por fragmento de propietario o modelo, sin importar mayúsculas."""
        # TODO
        return []

    def resumen(self):
        """Devuelve un diccionario con total, robadas, recuperadas y valor_pendiente."""
        # TODO: sustituir los valores iniciales por el cálculo real.
        return {"total": 0, "robadas": 0, "recuperadas": 0, "valor_pendiente": 0.0}
