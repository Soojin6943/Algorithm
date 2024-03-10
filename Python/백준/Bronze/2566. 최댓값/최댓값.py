In = list()
M = []

for i in range(9):
    In.append(list(map(int,input().split())))
    M.append(max(In[i]))
    
print(max(M))

for i in range(9):
    for j in range(9):
        if In[i][j] == max(M):
            print("%d %d" %(i+1, j+1))
            exit(0)