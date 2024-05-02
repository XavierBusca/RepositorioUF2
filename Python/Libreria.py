ANYADIR = 1
ELIMINAR = 2
LISTAR = 3
PREGUNTA = 0


Llista = {}


while PREGUNTA != 4:
    PREGUNTA = int(input("Que quieres hacer? 1- Añadir, 2- Eliminar, 3- Listar. Si quieres salir pulsa cualquier numero diferente a los ya mencionados : "))
    if PREGUNTA == 1:
        anyade= input("Escribe el nombre del libro: ")
        Llista.append(anyade)

    if PREGUNTA == 2:
        elimina = input("Escribe el nombre del libro que vas a eliminar: ")
        Llista.remove(elimina)      
    else:
            print("No hay libros por eliminar")
    if PREGUNTA == 3:
        print(Llista)
