c = int(input())

for i in range(c):
    n = input().split()
    tot=0
    co=0
    for j in range(1,len(n)):
        tot+=int(n[j])
    avg=tot/(len(n)-1)
    for k in range(1,len(n)):
        if int(n[k])>avg :
            co+=1
    upavg = (co/(len(n)-1))*100
    print("%.3f"%(upavg), end="%\n")