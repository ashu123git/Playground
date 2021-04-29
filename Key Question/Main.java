s = input()
lst1 = []
for i in s:
  lst1.append(int(i))
lst1.sort()
s1 = ''
for i in lst1:
  s1 += str(i)
for i in s1:
  print(i, end=' ')
