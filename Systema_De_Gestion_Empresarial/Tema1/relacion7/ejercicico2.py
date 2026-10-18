precios=[2,3,6,1,10]
print(len(precios))
print(sum(precios))
print(min(precios))
print(max(precios))
lineas=[]
for numero, producto in enumerate(precios, start=1):
    lineas.append(f"{numero}. {producto}")

print("\n".join(lineas))
