T = int(input())

for i in range(T):
    arr = list(input())
    
    cnt = 0
    sum = 0
    
    for i in range(len(arr)):
        if arr[i] == 'O':
            cnt += 1
            sum += cnt
        elif arr[i] == 'X':
            cnt = 0
    
    print(sum)
    

