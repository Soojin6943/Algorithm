N, M = map(int, input().split())

A = list()
B = list()

for i in range(N):
    In = list(map(int, input().split()))
    A.append(In)

for i in range(N):
    In = list(map(int, input().split()))
    B.append(In)

for i in range(N):
    for j in range(M):
        print(A[i][j]+B[i][j], end=" ")
    print()