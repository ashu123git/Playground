from math import *
def find_gcd(n1, n2):
  lst1 = [n1, n2]
  lst2 = []
  d ={}
  ans = []
  for i in lst1:
    for j in range(1, int(sqrt(i))+1):
      if i % j == 0:
        if j == int(i/j):
          lst2.append(j)
        else:
          lst2.append(j)
          lst2.append(i//j)
  for i in lst2:
    d[i] = d.get(i, 0) + 1
  for i, j in d.items():
    if j == 2:
      ans.append(i)
  return max(ans)


def main():
  num = int(input())
  lst1 = [int(x) for x in input().split()]
  lcm = lst1[0]
  for num1 in range(1, num):
    lcm = (lcm*lst1[num1])//find_gcd(lcm, lst1[num1])
  print(lcm)
main()