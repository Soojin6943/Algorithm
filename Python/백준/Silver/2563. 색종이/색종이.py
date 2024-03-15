N = int(input())

Arr = [[0 for i in range(101)] for j in range(101)]

for i in range(N):
    L, U = map(int, input().split())
    for i in range(L, L+10):
        for j in range(U, U+10):
            Arr[i][j] = 1

result = 0
for i in Arr:
    result += i.count(1)

print(result)

# N = int(input())
# Arr = list()

# for i in range(N):
#     L, U = map(int,input().split())
#     R = [L, L+10, U, U+10]
#     Arr.append(R)
# sum = 0
# for i in range(N):
#     for j in range(i+1, N):
#         if Arr[i][0] < Arr[j][0] < Arr[i][1]:
#             if Arr[i][2] < Arr[j][2]< Arr[i][3]:
#                 sum += (Arr[i][1] - Arr[j][0])*(Arr[i][3]-Arr[j][2])
#             elif Arr[i][2] < Arr[j][3] < Arr[i][3]:
#                 sum += (Arr[i][1] - Arr[j][0])*(Arr[j][3] - Arr[i][2])
#         elif Arr[i][0] < Arr[j][1] < Arr[i][1]:
#             if Arr[i][2] < Arr[j][2]< Arr[i][3]:
#                 sum += (Arr[j][1] - Arr[i][0])*(Arr[i][3]-Arr[j][2])
#             elif Arr[i][2] < Arr[j][3] < Arr[i][3]:
#                 sum += (Arr[j][1] - Arr[i][0])*(Arr[j][3] - Arr[i][2])

# result = 100 * N - sum
# print(result)