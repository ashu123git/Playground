c = '*'
n = int(input())
for i in range(n-1):
    print(' '*i + ((n*2)-1-(2*i))*c + ' '*i)
for i in range(n):
    print((n-(i+1))*' ' + (i+1)*c + (i*c).ljust(n+1))
