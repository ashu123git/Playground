str1 = input()
d = {}
for i in str1:
  d[i] = d.get(i, 0) + 1
c = sorted(d)
for i in c:
  print("{}{}".format(i, d[i]), end='')
