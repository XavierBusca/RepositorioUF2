ANYADIR = 1
ELIMINAR = 2
LLISTAR = 3
ANYADIRPRESTEC = 4
DEVOLVERPRESTEC = 5
PREGUNTA = 0


Llista = []
LlibrePrestats = []

while PREGUNTA != 6:
    PREGUNTA = int(input("Que quieres hacer? 1- Añadir, 2- Eliminar, 3- Listar, 4- Anyadir Prestamo, 5- DevolverPrestec. Si quieres salir pulsa cualquier numero diferente a los ya mencionados : "))
    if PREGUNTA == 1:
        anyade= input("Escribe el nombre del libro: ")
        Llista.append(anyade)

    if PREGUNTA == 2:
        elimina = input("Escribe el nombre del libro que vas a eliminar: ")
        Llista.remove(elimina)

    if PREGUNTA == 3:
        print('Libreria', Llista)
        print('Libros prestados', LlibrePrestats)

    if PREGUNTA == 4:
        prestamo= input("Escribe el nombre del libro que quieres hacer el prestamo: ")
        Llista.remove(prestamo)
        LlibrePrestats.append(prestamo)

    if PREGUNTA == 5:
        devolucion= input("Que libro quieres devolver? ")
        LlibrePrestats.remove(devolucion)
        Llista.append(devolucion)
