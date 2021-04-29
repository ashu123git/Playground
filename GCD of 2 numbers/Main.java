n1 = int(input())
n2 = int(input())
div_n1 = []
div_n2 = []
for i in range(1, n1//2+1):
  if n1 % i == 0:
    div_n1.append(i)
div_n1.append(n1)
for i in range(1, n2//2+1):
  if n2 % i == 0:
    div_n2.append(i)
div_n2.append(n2)
temp = set(div_n1).intersection(set(div_n2))
final = list(temp)
final.sort(reverse=True)
print(final[0])
