T = int(input())

for i in range(T):
    H, W, N = map(int, input().split())
    num = N//H +1
    floor = N%H
    
    if floor == 0:
        num = N//H
        floor = H
    print(floor*100+num)
