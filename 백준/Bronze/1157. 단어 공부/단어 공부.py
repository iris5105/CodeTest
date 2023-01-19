text= input().upper()
res = dict()
max=0
ans = ' '
for i in range(26):
    res[i]=0
for j in range(len(text)):
    res[int(ord(text[j]))-65]+=1
for k in range(26):
    if res[k]>max :
        max=res[k]
        ans=chr(k+65)
    elif max!=0 and res[k]==max :
        ans = '?'
print(ans)