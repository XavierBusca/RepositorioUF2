pizza = []
while True:
    print("1. Presa de comandes")
    print("2. Preparacio de pizzes")
    print("3. Gestio de estoc")
    print("4. Processament de pagaments")

    def PresaComandes(pizza):
        Comandes = int(input("Que quieres pedir para comer? 1. Pizza 4 quesos 2. Pizza BBQ, 3. Pizza jamon y queso, 4. Pizza Carbonara "))
        if Comandes == 1:
            print("Has pedido una pizza 4 quesos. ")
            pizza.append(Comandes)
        elif Comandes == 2:
            print("Has pedido una pizza BBQ. ")
        elif Comandes == 3:
            print("Has pedido una pizza jamon y queso. ")
        elif Comandes == 4:
            print("Has pedido una pizza carbonara. ")
        else:
            print("No has seleccionado ninguna pizza")
    break

print(pizza)