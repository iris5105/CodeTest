su = int(input())
L=[]
L.append(1)
L.append(1)
for i in range(2,su):
    L.append(L[i-1]+L[i-2])
print(L[su-1])
