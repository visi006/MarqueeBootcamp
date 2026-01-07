#prime List
pl = [ 2,7,13,19]
n = int(input())
feed_num = 2
sun_ctr = 1 # super ugly number counter
while True:
    num = feed_num
    #print(num, end =' ' )
    cf = 2
    coming_out = False
    while  num != 1: #4
         if num % cf == 0: #2
             if cf not in pl:
                 coming_out = True
                 break
             else:
                while num % cf == 0 and num != 1:
                    num//=cf
         cf+=1
    if coming_out == False:
       # print(feed_num, end =  ' ')
        sun_ctr+=1
    if sun_ctr == n:
        print(feed_num)
        break
    feed_num+=1





