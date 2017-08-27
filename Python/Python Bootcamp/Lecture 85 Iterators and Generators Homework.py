from random import randint
def gensquares(N):
  for x in range(N):
    yield x**2

for x in gensquares(10):
  print(x)

def rand_num(low,high,n):
  for x in range(n):
    yield randint(low,high)

for num in rand_num(1,10,12):
  print(num)

s = iter('hello')
print(next(iter(s)))
print(next(iter(s)))
print(next(iter(s)))
print(next(iter(s)))
print(next(iter(s)))

my_list = [1, 2, 3, 4, 5]
gencomp = (item for item in my_list if item > 3)
comp = [item for item in my_list if item > 3]

for item in gencomp:
  print(item)

print(comp)
