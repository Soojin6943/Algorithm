X = input()
cnt = 0

while len(X) != 1:
    sum = 0
    for i in range(len(X)):
        sum += int(X[i])
    X = str(sum)
    cnt += 1
    
if (int(X) % 3) == 0:
    print(cnt)
    print("YES")
else:
    print(cnt)
    print("NO")