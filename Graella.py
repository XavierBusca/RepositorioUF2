'''
Descompon aquest codi en funcions més petites per millorar la seva modularitat i reutilització. 

Pista: Volem poder moure'ns per una graella bidimensional.
.
Codi Python:
'''

class GraellaBidimensional:
    def __init__(self, x, y):
        self.coordenada = (x, y)

    def moure_dreta(self):
        x, y = self.coordenada
        nova_coordenada = (x + 1, y)
        return nova_coordenada

    def moure_esquerra(self):
        x, y = self.coordenada
        nova_coordenada = (x - 1, y)
        return nova_coordenada

    def moure_amunt(self):
        x, y = self.coordenada
        nova_coordenada = (x, y + 1)
        return nova_coordenada

    def moure_avall(self):
        x, y = self.coordenada
        nova_coordenada = (x, y - 1)
        return nova_coordenada

graella = GraellaBidimensional(0, 0)

# Executar moviments
nova_coordenada = graella.moure_dreta()
print(f"Nova coordenada després de moure a la dreta: {nova_coordenada}")

nova_coordenada = graella.moure_amunt()
print(f"Nova coordenada després de moure amunt: {nova_coordenada}")