#hints for the code

#nod → Number of days

#f1, f2, f3 → Three airlines

#Each airline has a fixed schedule:

#Airline 1 flies every f1 days

#Airline 2 flies every f2 days

#Airline 3 flies every f3 days


nod = int(input())   # Takes input values
f1 = int(input())    #Total number of days  and Three flight intervals
f2 = int(input())     #Total number of days  and Three flight intervals
f3 = int(input())     #Total number of days  and Three flight intervals
res=0
for day in range ( 1, nod+1):
    divCtr=0
    if day % f1 == 0 : divCtr+=1
    if day % f2 == 0 : divCtr+=1
    if day % f3 == 0 : divCtr+=1
    if divCtr == 1: res+=1
print(res)


