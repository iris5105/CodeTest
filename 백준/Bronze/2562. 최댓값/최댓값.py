su = list()
i=0
co=0
num=0
while True :
    if i==9:
        break
    su.append(int(input()))
    i+=1
for i in range(len(su)):
    test=int(su[i])
    if test>num  :
        num=test
        co=i+1
print(num,co,sep="\n")
