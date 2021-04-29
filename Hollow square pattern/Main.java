c = '* '
n = int(input())
print(c*n)
for i in range(n-2):
    print(c+'  '*(n-2)+c)
print(c*n)
