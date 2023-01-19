def les_num(n,x):
    i=0
    test=input().split(" ")
    for i in range(n):
        a=int(test[i])
        if a<x:
            L.append(a)
    for i in range(len(L)):
        print(L[i], end=" ")

#main
n,x = map(int,input().split())
L=[]
les_num(n,x)