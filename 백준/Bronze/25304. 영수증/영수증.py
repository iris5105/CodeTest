bil = int(input())
num=int(input())
i=0
while i<num:
    pr,qty=map(int,input().split())
    bil-=pr*qty
    i+=1
if bil==0:
    print("Yes")
else:
    print("No")