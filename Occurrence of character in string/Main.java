str1 = input()
str2 = ''
for i in str1:
  if i == ' ':
    continue
  else:
    str2 += i
d = {}
for i in str2:
  d[i] = d.get(i, 0) + 1
lst1 = []
for i in d.values():
  lst1.append(i)
c = max(lst1)
for i, j in d.items():
  if j == c:
    print(i)
    break
