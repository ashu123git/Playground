def fact(n):
  if n == 1:
    return 1
  else:
    return (n*fact(n-1))
  pass

def main():
  num = int(input())
  res = fact(num)
  print(res)
main()