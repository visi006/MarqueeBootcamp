Given an array of integers arr[] of length n representing non-negative integers, return the array that contains the find the smallest possible number greater than the given number by rearranging its digits of the number, if it is not possible the result will be -1

Input
[2736,956321,65421,54854654]
Output
[2763,961235,-1,   54855446]

Python code for the given problem statement :

num = int(input())
copy_num = num
num_list=[]
while copy_num!=0:
    digit = copy_num %10
    num_list.insert(0,digit)
    copy_num//=10

print(num_list)    
for iter in range(len(num_list)-1,-1,-1):
    if num_list[iter-1] < num_list[iter]:
        break
digit = num_list[iter-1]    
large = num_list[iter]
large_ind = iter
for walk in range ( iter, len(num_list)-1):
    if num_list[walk] > digit and num_list[walk] < large:
        large = num_list [ walk ]
        large_ind = walk
temp = num_list [ iter - 1]
num_list [ iter - 1] = num_list [ large_ind]
num_list [ large_ind ] = temp

print(num_list)

#    5456321
