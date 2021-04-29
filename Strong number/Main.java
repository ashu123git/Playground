def fact(n):
  if n == 0:
    return 1
  elif n == 1:
    return 1
  else:
    return n*fact(n-1)
  
def main():
  num = input()
  lst1 = []
  for i in num:
    lst1.append(fact(int(i)))
  if sum(lst1) == int(num):
    print("Yes")
  else:
    print("No")
main()