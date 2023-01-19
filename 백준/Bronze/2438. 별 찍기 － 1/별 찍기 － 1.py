import sys
input = sys.stdin.readline
t=int(input())
for i in range(t):
    for j in range(i+1):
        print("*",end="")
    print("")