T = int(input())
def fact(a):
    result = 1
    for i in range(a):
        result *= (i+1)
    return result
    
for i in range(T):
    N, M = map(int,input().split())
    
    print(int(fact(M)/(fact(N)*fact(M-N))))
    