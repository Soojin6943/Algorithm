arr = list()

while True:
    n = list(map(int,input().split()))
    
    if n[0] == 0 and n[1] == 0 and n[2] == 0:
        break
    else:
        arr.append(n)

for j in arr:
    j.sort()
    if j[0]**2 + j[1] ** 2 == j[2]**2:
        print("right")
    else:
        print("wrong")
    # print(j)
    
# print(arr)