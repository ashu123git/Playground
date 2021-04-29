d = {}
str1 = input()
for i in str1:
  d[i] = d.get(i, 0) + 1
c = 0
for i, j in d.items():
  if j == 1:
    c += 1
print(c)
