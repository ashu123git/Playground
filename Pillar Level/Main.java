numPlayers = int(input())
lst1 = [int(x) for x in input().split()] 
health1, health2 = [int(x) for x in input().split()]
c = 0
for i in lst1:
  if (health1 % i == 0) and (health2 % i == 0):
    c += 1
print(c)
