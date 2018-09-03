import timeit
start = timeit.default_timer()

def bubble_sort(list):
	for i in range(len(list)-1, 0, -1):
		for j in range(i):
			if(list[j] > list[j + 1]):
				list[j], list[j+1] = list[j+1], list[j]
param = [76, 89, 345 ,23, 1, 45, 96678, 46, 2313, 1]
bubble_sort(param)
print(param)

stop = timeit.default_timer()

print('Time: ', stop - start) 