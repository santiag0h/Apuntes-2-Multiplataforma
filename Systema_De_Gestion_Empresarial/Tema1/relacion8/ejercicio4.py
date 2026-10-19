def resumir_importes(importes):
    if importes == []:
        return "none"
    total = sum(importes)
    media = total/len(importes)
    minimo = min(importes)
    maximo = max(importes)
    devuelto = {
        "total": total,
        "media": media,
        "minimo": minimo,
        "maximo": maximo
    }
    return devuelto


lista = [20, 30, 50, 60]
enviar = resumir_importes(lista)
print(enviar)
