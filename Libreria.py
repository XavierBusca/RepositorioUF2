ANYADIR = 1
ELIMINAR = 2
LISTAR = 3
PREGUNTA = 0


Llista = {}


while Pregunta != 4:
   Pregunta = int(input("Que quieres hacer? 1- Añadir, 2- Eliminar, 3- Listar. Si quieres salir pulsa cualquier numero diferente a los ya mencionados : "))
   if Pregunta == Anyadir:
       anyade= input("Escribe el nombre del libro: ")
       anyade2= input("Escribe el nom del autor: ")
       Llista[anyade] = anyade2
   else:
       if Pregunta == Eliminar:
           elimina = input("Escribe el nombre del libro que vas a eliminar: ")
           Llista.pop(elimina)
       else:
           if Pregunta == Listar:
               print(Llista)
