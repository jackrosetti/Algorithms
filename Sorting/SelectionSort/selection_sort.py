import random
import timeit

def main():
	start = timeit.default_timer()
	
	temp_array = []
	for i in range(25):
		temp_array.append(random.randint(1, 10000))
	print(temp_array)
	print (selection_sort(temp_array))

	stop = timeit.default_timer()

	print('Time: ', stop - start) 

	

def selection_sort(array):
	length = len(array)
	for i in range(0, length):
		minimum = i
		for j in range(i+1, length):
			if(array[minimum] > array[j]):
				minimum = j
		if(minimum != i):
			array[minimum], array[i] = array[i], array[minimum]
	return array


if __name__ == '__main__':
	main()
