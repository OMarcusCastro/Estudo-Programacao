print("escreva a quantidade de valores q")

q  =  int(input())

n = int(input("entre com n: "))

ma = n

k=0
while n==ma:
    k+=1
    n = int(input("entre n"))
    if n!=ma:
        ma2 = n

if ma<ma2:
    aux = ma
    ma=ma2
    ma2=aux
    
i=0
while i<q-k-1:
    n = int(input('entre n:'))

    if n> ma:
        ma2=ma
        ma=n
    elif n>ma2 and n!=ma:
        ma2=n
    i+=1

print(ma)
print(ma2)



# 
# i = 0

# while i< q-1:
#     i+=1
#     n = int(input("n: "))

#     if n>ma:
#         ma2=ma
#         ma=n
#     elif n>ma2 and n!=ma:
#         ma2=n


# print(ma)
# print(ma2)

