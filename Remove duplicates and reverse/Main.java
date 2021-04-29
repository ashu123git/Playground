n = input()
if len(n) > 30:
  print("Invalid Input")
else:
  lst1 = []
  for i in n:
    if i not in lst1:
      lst1.append(i)
  lst1.reverse()
  print(''.join(lst1))
