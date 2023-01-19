n= int(input())
for i in range(n):
    str=input()
    co=0
    tot=0
    for j in range(len(str)) :
        if str[j] == "O":
            co+=1
            tot+=co
        else :
            co=0
    print(tot)