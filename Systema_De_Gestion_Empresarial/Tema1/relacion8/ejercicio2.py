def clasificar_stock(stock):
    if stock==0:
        return "Agotado"
    elif stock<5:
        return "Stock bajo"
    else:
        return "Stock suficiente"
stock=int(input("Introduce la stock "))
resutado=clasificar_stock(stock)
print(resutado)