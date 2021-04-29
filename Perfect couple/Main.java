n = int(input())
nums = [int(x) for x in input().split()]
x = int(input())
lst1 = []
flag = 0
for i in range(len(nums)):
  for j in range(i+1, len(nums)):
    if nums[i]+nums[j] == x:
      flag = 1
      lst1.append(nums[i])
      lst1.append(nums[j])
      break
    else:
      continue
if flag == 0:
  print('No perfect couple found!')
else:
  print('Perfect couple: {} {}'.format(lst1[0], lst1[1]))
