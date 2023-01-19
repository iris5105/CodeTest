su = int(input())
su1=su
co=0
while True:
    while True:
        a=su1//10
        b=su1%10
        c=(a+b)%10
        su1=b*10+c
        co+=1
        break
    if  su1==su :
        break
print(co)