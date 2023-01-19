def min_max(n):
    min=1000001
    max=-1000001
    num=0
    L=input().split()
    for i in range(0,n):
        num=int(L[i])
        if num<min:
            min=num
        if num>max:
            max=num
    print(min,max)

n=int(input())
L=[]
min_max(n)