member=set(range(1,31))
su=set()
for i in range(28):
    su.add(int(input()))
    i+=1
res=sorted(list(member-su))
for i in range(len(res)):
    print(res[i])