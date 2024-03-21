class Libro:
    def __init__(self, titulo, autor, ejemplares_disponibles):
        self.titulo = titulo
        self.autor = autor
        self.ejemplares_disponibles = ejemplares_disponibles

    def prestar(self):
        if self.ejemplares_disponibles > 0:
            self.ejemplares_disponibles -= 1
            print(f"Libro prestado: {self.titulo}, Autor: {self.autor}")
        else:
            print(f"No hay ejemplares disponibles de {self.titulo}")

    def devolver(self):
        self.ejemplares_disponibles += 1
        print(f"Libro devuelto: {self.titulo}, Autor: {self.autor}")

    def informacion(self):
        print(f"Título: {self.titulo}, Autor: {self.autor}, Ejemplares Disponibles: {self.ejemplares_disponibles}")


class Socio:
    def __init__(self, nombre, apellido, numero_socio):
        self.nombre = nombre
        self.apellido = apellido
        self.numero_socio = numero_socio

    def solicitar_prestamo(self, libro, fecha_prestamo):
        print(f"Préstamo solicitado por {self.nombre} {self.apellido}, Número de Socio: {self.numero_socio}")
        prestamo = Prestamo(libro, self)
        prestamo.registrar_prestamo(fecha_prestamo)

    def devolver_prestamo(self, libro):
        print(f"Devolución de préstamo por {self.nombre} {self.apellido}, Número de Socio: {self.numero_socio}")
        prestamo = Prestamo(libro, self)
        prestamo.devolver_prestamo()

    def informacion(self):
        print(f"Nombre: {self.nombre}, Apellido: {self.apellido}, Número de Socio: {self.numero_socio}")


class Prestamo:
    def __init__(self, libro, socio):
        self.libro = libro
        self.socio = socio

    def registrar_prestamo(self, fecha_prestamo):
        print(f"Préstamo registrado - Libro: {self.libro.titulo}, Socio: {self.socio.nombre} {self.socio.apellido}, Fecha: {fecha_prestamo}")
        self.libro.prestar()

    def devolver_prestamo(self):
        print(f"Devolución de préstamo - Libro: {self.libro.titulo}, Socio: {self.socio.nombre} {self.socio.apellido}")
        self.libro.devolver()

    def informacion(self):
        print(f"Libro: {self.libro.titulo}, Socio: {self.socio.nombre} {self.socio.apellido}")


class App:
    def exec(self):
        # Crear libros
        libro1 = Libro("LOTR", "J.R.R. Tolkien", 5)
        libro2 = Libro("1984", "George Orwell", 3)

        # Crear socios
        socio1 = Socio("Clark", "Kent", 101)
        socio2 = Socio("Bruce", "Wayne", 102)

        # Realizar acciones
        libro1.informacion()
        socio1.solicitar_prestamo(libro1, "2024-03-01")
        libro1.informacion()
        libro2.informacion()
        socio2.solicitar_prestamo(libro2, "2024-03-01")
        libro2.informacion()
        libro1.informacion()
        socio1.devolver_prestamo(libro1)
        libro1.informacion()


App().exec()
