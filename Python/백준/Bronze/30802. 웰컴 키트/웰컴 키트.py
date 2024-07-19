N = int(input())
size = list(map(int, input().split()))
T, P = map(int, input().split())

cnt = 0
for i in size:
    if 0 < i < T:
        cnt += 1
    elif i == 0:
        cnt += 0
    else:
        if i % T == 0:
            cnt += i//T
        else:
            cnt += (i//T) + 1

print(cnt)
print(N//P, N%P)
