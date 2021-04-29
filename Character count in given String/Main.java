n = input()
if len(n) > 20:
  print("Invalid Input")
else:
  lst1 = [n[0]]
  lst2 = [1]
  j = 0
  for i in range(len(n)):
    if i+1 < len(n):
      if n[i+1] != n[i]:
        lst1.append(n[i+1])
        j += 1
        lst2.append(1)
      else:
        lst2[j] += 1
  for i in range(len(lst1)):
    print('{}{}'.format(lst1[i], lst2[i]), end='')