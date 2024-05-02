'''
Feu un programa anomenat CalculTirada que calculi la probabilitat en tant per cent de treure per sota d’un valor concret tirant dos daus de sis cares. 

Per fer això, l’estratègia que s’ha considerat és desar dins d’un  el nombre de repeticions de cada tirada possible (sempre entre 2 i 12) i després treballar a partir d’aquests valors, sabent que:

    Probabilitat de treure 2: suma del nombre de tirades que valen 2 * 100 / 36.
    Probabilitat de treure 3 o menys: suma del nombre de tirades que valen 2 o 3 * 100 / 36.
    Probabilitat de treure 4 o menys: suma del nombre de tirades que valen 2 o 3 o 4 * 100 / 36.
    etc.

Es parteix de la descomposició del problema següent, que haureu de seguir per codificar-lo:

    Llegir el valor.
    Processar entrada pel teclat.
    Comprovar si està entre 2 i 12.

Generar tirades.Calcular probabilitat.
A mode de guia, la sortida hauria de ser més o menys com es mostra tot seguit:

Escriu el valor a calcular [2 - 12]. 
18 
El valor no és entre 2 i 12. 
5 
La probabilitat es 27.0%.
'''
CARES_DAU: int = 6

llista_tirades: list[int] = [0] * (CARES_DAU * 2 - 1)

def CalculTirada() -> None:
    llegir_valor()
    generar_tirades()
    mostrar_probabilitat()

def generar_tirades() -> None:
    i:int = 1

    while i <= CARES_DAU:
        j:int = 1
        while j <= CARES_DAU:
            llista_tirades[i + j -2] += 1
            j += 1
        i += 1
def llegir_valor() -> None:
    valor: int = int(input("Escriu el valor a calcular [2 -12] .\n"))
    while not valor_es_correcto(valor):
        valor = input()

    return valor