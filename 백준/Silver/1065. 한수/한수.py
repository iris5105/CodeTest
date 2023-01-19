def CheckNum(i):
    if i<100:
        return True;
    elif i>100 and 1000>i:
        su1 = i//100
        su2 = i%100//10
        su3 = i%10
        if su1-su2 == su2-su3:
            return True
        else :
            return False
    else :
        return False
N = int(input())
num=set(range(1,N+1))
co=0
for i in num:
    Chck = CheckNum(i)
    if Chck==True:
        co+=1
print(co)