def prime(num):
  flag = 0
  if num == 2:
    return True
  else:
    for i in range(2, num):
      if num % i == 0:
        flag = 1
    if flag == 0:
      return True
    else:
      return False
    
def main():
  n = int(input())
  lst1 = []
  for j in range(2, n+1):
    if prime(j):
      lst1.append(j)
  print(*lst1)
main()