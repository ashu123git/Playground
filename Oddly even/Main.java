num = input()
c = 0
d = 0
for i in range(len(num)):
  if (i+1) % 2 == 0:
    d = d + int(num[i])
  else:
    c = c + int(num[i])
print(abs(c-d))
