n = int(input())
max = 0
tot=0
num=input().split()
for i in range(n):
    su=int(num[i])
    if su>max :
        max=su
    tot+=su
print(tot/max/n*100)