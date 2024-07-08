N, M = map(int,input().split())

arr = [list(map(str, input())) for _ in range(N)]

# print(arr)
result = []
for k in range(N-7):
    for m in range(M-7):
        
        cnt1 = 0
        cnt2 = 0

        for i in range(k, k+8):
            for j in range(m, m+8):
                if (i+j) % 2 == 0:
                    if arr[i][j] != "W":
                        cnt1 += 1
                    else:
                        cnt2 += 1
            
                else:
                    if arr[i][j] != "W":
                        cnt2 += 1
                    else:
                        cnt1 += 1

        result.append(cnt1)

        result.append(cnt2)

#print(result)
print(min(result))