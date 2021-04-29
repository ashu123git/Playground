n = int(input())
nums = [x for x in input().split()]
left = ''
right = ''
for i in nums:
  if int(i) == 0:
    left += str(i)
  else:
    right += str(i)
total = left+right
for i in total:
  print(i, end=' ')
