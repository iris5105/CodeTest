a,b=map(int,input().split())
c=b-45
if(b>=45):
    print(a,c)
elif(c<0):
    if a==0:
        a=23
    else :
        a=a-1
    b=60+c
    print(a,b)
else :
    if a==0:
        a=23
    else :
        a=a-1
    print(a,c)