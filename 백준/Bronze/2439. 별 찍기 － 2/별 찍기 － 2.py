import sys
input = sys.stdin.readline
t=int(input())
i=0;
while i<t:
    j=1
    while j<t-i:
        print(' ',end="")
        j+=1
    k=0
    while k<=i:
        print('*',end="")
        k+=1
    print("")
    i+=1