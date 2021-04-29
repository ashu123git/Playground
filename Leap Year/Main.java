def leap(year):
  if year % 4 == 0:
    if year % 100 == 0:
      if year % 400 == 0:
        return True
      return False
    return True
  pass

def main():
  n = int(input())
  res = leap(n)
  if res == 1:
    print("LEAP YEAR")
  else:
    print("NOT LEAP YEAR")
main()