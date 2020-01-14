class persona(object):

    __instance = None
    nombre = None

    def __str__(self):
        return 'nombre:' + ' ' + self.nombre

    def __new__(cls):
        if persona.__instance is None:
            persona.__instance = object.__new__(cls)
        return persona.__instance

nombre_1 = persona()
nombre_1.nombre = "Esteban"
print(nombre_1)
nombre_2 = persona()
nombre_2.nombre = "Mateo"
print(nombre_2)

print(nombre_1)
print(nombre_2)