nod = int(input())
f1 = int(input())
f2 = int(input())
f3 = int(input())
res=0
for day in range ( 1, nod+1):
    divCtr=0
    if day % f1 == 0 : divCtr+=1
    if day % f2 == 0 : divCtr+=1
    if day % f3 == 0 : divCtr+=1
    if divCtr == 1: res+=1
print(res)
