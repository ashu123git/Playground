elem = ['break', 'case', 'continue', 'default', 'defer', 'else', 'for', 'func', 'goto', 'if', 'map', 'range', 'return', 'struct', 'type', 'var']
str1 = input()
if str1 in elem:
  print("{} is a keyword".format(str1))
else:
  print("{} is not a keyword".format(str1))
