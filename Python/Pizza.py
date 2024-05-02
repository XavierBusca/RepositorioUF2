pizza = []
TiposPizza = [[],[],[],[]]
while True:
    print("1. Presa de comandes")
    print("2. Preparacio de pizzes")
    print("3. Gestio de estoc")
    print("4. Processament de pagaments")
    Pregunta=int(input("Que quieres hacer? "))

    def PresaComandes():
        Comandes = int(input("Que quieres pedir para comer? 1. Pizza 4 quesos 2. Pizza BBQ, 3. Pizza jamon y queso, 4. Pizza Carbonara "))
        if Comandes == 1:
            print("Has pedido una pizza 4 quesos. ")
            pizza.append(Comandes)
            TiposPizza[0].append(Comandes)
        elif Comandes == 2:
            print("Has pedido una pizza BBQ. ")
            TiposPizza[1].append(Comandes)
        elif Comandes == 3:
            print("Has pedido una pizza jamon y queso. ")
            TiposPizza[2].append(Comandes)
        elif Comandes == 4:
            print("Has pedido una pizza carbonara. ")
            TiposPizza[3].append(Comandes)
        else:
            print("No has seleccionado ninguna pizza")
    
    #def PreparacioPizzes()
    if Pregunta == 1:
        PresaComandes()
    elif Pregunta == 2:

    elif Pregunta == 3:

    elif Pregunta == 4:

    break
