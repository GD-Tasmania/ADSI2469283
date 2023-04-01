# a:str="Juan"
# b="hola "
# c="como estan asdsad"
# # print(f"{a} sigue el texto {b+c}")
# # print("como" in c)
# print(b.__len__())

# trafficLight="verde"
# prendido=True
# intermitente=False

# if (prendido==True):
#     print("El semaforo esta prendido")
#     if (intermitente==True):
#         print("El semaforo esta intermitente")
#     else:
#         print("El semaforo no esta intermitente")
#         if(trafficLight=="verde"):
#             print("El semaforo esta en verde, puede avanzar")
#         elif(trafficLight=="amarillo"):
#             print("El semaforo esta en amarillo")
#         elif(trafficLight=="rojo"):
#             print("El semaforo esta en rojo, ¡Detengase!")
#         else:
#             print("El semaforo esta dañado")
# else:
#     print("El semaforo esta apagado")

# cajero automatico
# cedulaBD=1092852
# dineroBD=200000

# dinero=0
# cedula=0
# menu="1. Retiro","2. Consignacion","3. Consultar saldo"
# menu=0

# def consultar():
#     cedula=int(input("Ingrese el numero de cedula: "))
#     if(cedulaBD==cedula):
#         print('''Opciones:
#         1. Retirar
#         2. Consignar
#         3. Consultar''')
#         menu=int(input("Ingrese la opcion: "))
#         if(menu==1):
#             dinero=int(input("Cantidad a retirar: "))
#             if(dineroBD<dinero):
#                 print("Saldo insuficiente")
#             else:
#                 print("Su saldo ahora es de: "+str((dineroBD-dinero)))
#         elif(menu==2):
#             dinero=int(input("Cantidad a consignar: "))
#             print("Su saldo ahora es de: "+str((dineroBD+dinero)))
#         elif(menu==3):
#              print("Su saldo es de: "+str(dineroBD))
#         else:
#          print("Cedula no encontrada")


# menu="1.continuar","2.salir"
# def consultar():
#     print

# start = 2
# while start >= 5:
#     print(start)
#     start+=1

# opcion=1

# while opcion != 3:
#     print("1. Consultar \n 2. Actualizar")
#     opcion=int(input("Ingrese una opcion: > "))
# else:
#     print("....")

# city = ["Armenia","New York","Madrid","Tokio","Reykjavik"]

# x = list("Python")
# print(x)
# print(type(x))
# print(list(range(5)))

# shopping = ["Agua","Huevos","Aceite","Sal","Limón"]

# print(shopping[::-1])
# print(shopping[2:4])
# shopping.append("Atún")
# shopping.insert(1,"Jamón")
# print(shopping)

# numbers=[]

# for i in range(21):
#     if i%2==0:
#         numbers.append(i)

# print(numbers)


# def quarter_of(month):
#     # your code here
#     if(month>0 and month<4):
#         return 1
#     elif(month>3 and month<7):
#         return 2
#     elif(month>6 and month<10):
#         return 3
#     else:
#         return 4
# def quarter_of(n):
#     return (n + 2) // 3

# print(quarter_of(4))

def warn_the_sheep(queue):
    num=len(queue)
    cad=""
    for i in range (1,num+1):
        print(queue[num-i])
        if(queue[num-i][0]=="w"):
            cad="Oi! Sheep number"+[(num-i)+1]+"! You are about to be eaten by a wolf!"
    return "hola"

print(warn_the_sheep(['sheep', 'sheep', 'sheep', 'sheep', 'sheep', 'wolf', 'sheep', 'sheep']))