str = input()
test = dict()
for i in range(26):
    test[i]=-1

for i in range(len(str)):
    if test[ord(str[i])-97]==-1:
        test[ord(str[i])-97]=i

for i in range(len(test)):
    print(test[i],end=" ")