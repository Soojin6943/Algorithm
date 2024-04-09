N = int(input())
A = list(map(int,input().split()))

if 1 <= N <= 1000000:
    print(min(A), max(A))
