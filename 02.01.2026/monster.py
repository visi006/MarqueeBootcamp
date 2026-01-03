the problem statement is given by :

While playing an RPG game, you were assigned to complete one of the hardest quests in this game. There are n monsters you'll need to defeat in this quest. Each monster i is described with two integer numbers - poweri and bonusi. To defeat this monster, you'll need at least poweri experience points. If you try fighting this monster without having enough experience points, you lose immediately.
You will also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order. The quest turned out to be very hard - you try to defeat the monsters but keep losing repeatedly. Your friend told you that this quest is impossible to complete. Knowing that, you're interested, what is the maximum possible number of monsters you can defeat?
Input
The first line contains an integer, n, denoting the number of monsters.
The next line contains an integer, e, denoting your initial experience.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents power of the corresponding monster.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents bonus for defeating the corresponding monster.
Sample cases:

Input 2 123 78 130 10 0
Output 2
Output description
Initial experience level is 123 points. Defeat the first monster having power of 78 and bonus of 10. Experience level is now 123+10=133. Defeat the second monster.

Input 3 101 100 304 100 1 523
Output 2

the python code of the above problem statement is given by:

take input
qsort( data, noe, sizeof every element, cmp(elem1, elem2)
into ds

4                int
100              int 
110              []
100
250
200
100              []
100
50
10
make two list into list of tuple

sort

sorted 

'''



nom = int(input())
init_energy = int(input())
iter_energy = 0
iter_bonus = 0
ener = []
bonu = []
for iter_energy in range( 0, nom):
    ener.append(int(input()))
for iter_bonus in range( 0, nom):
    bonu.append(int(input()))
tupl_list = list ( zip(ener,bonu))
print(tupl_list)
sorted_list = sorted( tupl_list, key = lambda data: (data[0],-data[1]))
print(sorted_list)
killed_mon = 0
for tup in sorted_list:
    if init_energy >= tup[0]:
        init_energy+= tup[1]
        killed_mon+=1
print(killed_mon)        











