#arr = [1,0,0,1,1,0,1,1,1,1,1,0,0]
arr = [ 1,0,0,0,1,1,0,1 ]
#                     ^
#     1 1   0 3  1 2  0 1  1 1
# ctr 1 1  2 3 1 2 1 
# prev 1 0 1 0 
prev = arr [ 0 ]
ctr = 1
res = 0
for iter in range (1, len(arr)):
    curr = arr [ iter ]
    if curr == prev:
        ctr+=1
    else:
        print(prev, ' ', ctr)
        count_of_sa = (ctr * (ctr+1)//2)
        res += count_of_sa
        ctr = 1
        prev = curr
print(prev, ' ', ctr)
count_of_sa = (ctr * (ctr+1)//2)
res += count_of_sa        
print(res)        
                       
                       

                       
