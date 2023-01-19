a,b=map(int,input().split())
c=int(input())
if a+(int((b+c)/60))<=23 :
    a=a+(int((b+c)/60))
    b=(b+c)%60
    print(a,b)
else:
    a=a+(int((b+c)/60))-24
    b=(b+c)%60
    print(a,b)
