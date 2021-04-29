s, n, m = int(input()), int(input()), int(input())
p = s**n
q = p%10
r = q**m
t = r%1000000007
print(t)
