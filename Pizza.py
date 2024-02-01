'''
Imagineu-vos que heu estat contractats per dissenyar el sistema de gestió d'una pizzeria. 
L'objectiu és desenvolupar un conjunt de funcions que permetin gestionar diferents tasques relacionades amb el funcionament de la pizzeria. Això inclou la presa de 
comandes, la preparació de pizzes, la gestió de l'estoc d'ingredients i el processament dels pagaments.
Recordeu fer servir disseny top down, i mantenir un baix acoblament i una alta cohesió.
'''
pizza = []
def PresaComandes():
    Comandes = int(input("Que quieres pedir para comer? 1. Pizza 4 quesos 2. Pizza BBQ, 3. Pizza jamon y queso, 4. Pizza Carbonara "))
    if Comandes == 1:
        print("Has pedido una pizza 4 quesos. ")
    elif Comandes == 2:
        print("Has pedido una pizza BBQ. ")
    elif Comandes == 3:
        print("Has pedido una pizza jamon y queso. ")
    elif Comandes == 4:
        print("Has pedido una pizza carbonara. ")
