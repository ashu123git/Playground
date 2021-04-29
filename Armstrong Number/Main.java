n = input()
length = len(n)
lst1 = []
for i in n:
  lst1.append(int(i)**length)
if sum(lst1) == int(n):
  print("ARMSTRONG")
else:
  print("NOT AN ARMSTRONG")