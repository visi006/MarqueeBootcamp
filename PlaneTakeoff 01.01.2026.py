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
res=0                  #res stores the number of days where exactly one flight takes off
for day in range ( 1, nod+1):    #Checks each day from Day 1 to Day N
    divCtr=0
    if day % f1 == 0 : divCtr+=1   #Airline 1 flies if day is divisible by f1
    if day % f2 == 0 : divCtr+=1   # Airline 2 flies if day is divisible by f2
    if day % f3 == 0 : divCtr+=1   #Airline 3 flies if day is divisible by f3
    if divCtr == 1: res+=1         #Only count the day if exactly one airline is flying
print(res)                          # print the total count of res values 



