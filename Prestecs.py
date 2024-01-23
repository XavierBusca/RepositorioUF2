Anyadir = 1
Eliminar = 2
Listar = 3
Pregunta = 0


Llista = {}
LlibrePrestats = {}

while Pregunta != 4:
   Pregunta = int(input("Que quieres hacer? 1- Añadir, 2- Eliminar, 3- Listar: "))
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
