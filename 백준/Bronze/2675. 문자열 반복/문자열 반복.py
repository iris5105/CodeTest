T = int(input())
for i in range(T):
    s=input()
    s=s.split()
    for j in range(len(s[1])):
        for k in range(int(s[0])):
            print(s[1][j],end="")
    print()