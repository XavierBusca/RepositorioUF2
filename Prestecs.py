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
    if PREGUNTA == ANYADIR:
        anyade= input("Escribe el nombre del libro: ")
        Llista.append(anyade)
    if PREGUNTA == ELIMINAR:
        elimina = input("Escribe el nombre del libro que vas a eliminar: ")
        Llista.pop(elimina)
    if PREGUNTA == Listar:
        print(Llista)
    if PREGUNTA == ANYADIRPRESTEC:
        anyade3= input("Escribe el nombre del libro: ")
        LlibrePrestats.append(anyade3)
    if PREGUNTA == Listar:
        print(LlibrePrestats)
    if PREGUNTA == DEVOLVERPRESTEC:
        