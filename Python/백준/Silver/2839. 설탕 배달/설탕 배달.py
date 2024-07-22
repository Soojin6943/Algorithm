N = int(input())



if N % 5 == 0:
    print(N//5)
else:
    cnt = 0
    while N > 0:
        N -= 3
        cnt += 1
        if N % 5 == 0:
            print(cnt + N//5)
            break
        elif 1<= N <=2:
            print("-1")
            break
        elif N == 0:
            print(cnt)
            break

        