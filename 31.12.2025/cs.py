arr=["3", "30", "34", "5", "9"]
for pass_num in range ( 0, len(arr)-1):
  for iter_in in range ( 0, len(arr)- (pass_num+1) ):
        s1s2 = arr[iter_in] + arr [ iter_in + 1]
        s2s1 = arr[iter_in+1] + arr [ iter_in ]
        if s2s1 > s1s2:
            temp = arr [ iter_in]
            arr [ iter_in ] = arr [ iter_in +1 ]
            arr [ iter_in + 1] = temp
res = "".join(arr)
print(arr)
print(res)


