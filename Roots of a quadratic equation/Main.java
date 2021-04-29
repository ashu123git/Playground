from math import *
a = int(input())
b = int(input())
c = int(input())
disc = (b*b - 4*a*c)
if disc > 0:
  root1 = (-b + sqrt(disc))/(2*a)
  root2 = (-b - sqrt(disc))/(2*a)
  print("root1 = {:.2f}  root2 = {:.2f}".format(root1, root2))
elif disc == 0:
  root1 = (-b + disc)/(2*a)
  print("root1 = {:.2f}  root2 = {:.2f}".format(root1, root1))
else:
  real = -b/(2*a)
  imaginary = sqrt(-disc)/(2*a)
  root1 = ('root1 = {:.2f} + {:.2f}i'.format(real, imaginary))
  root2 = ('root2 = {:.2f} - {:.2f}i'.format(real, imaginary))
  print('{}  {}'.format(root1, root2))
