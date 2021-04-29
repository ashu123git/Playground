str1 = [x for x in input().split()]
c = ''.join(str1)
val = c.lower()
d = {}
high = 0
key = ''
for i in val:
  d[i] = d.get(i, 0) + 1
for i, j in d.items():
  if j > high:
    high = j
    key = i
s = key.upper()
print("Maximum occurring character is '{}' = {} times.".format(s, high))