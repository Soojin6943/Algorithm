Arr = []
for i in range(5):
    Arr.append(input())

for i in range(15):
    for j in range(5):
        if i < len(Arr[j]):
            print(Arr[j][i], end="")
