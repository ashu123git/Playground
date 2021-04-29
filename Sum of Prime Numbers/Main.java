def prime(num):
  flag = 0
  if num == 1:
    return False
  elif num == 2:
    return True
  else:
    for j in range(2, num):
      if num % j == 0:
        flag = 1
  if flag == 0:
    return True
  else:
    return False
  
def main():
  n = int(input())
  m = int(input())
  lst1 = []
  for i in range(n+1, m):
    if prime(i):
      lst1.append(i)
  print(sum(lst1))
main()