import timeit

def main():
	start = timeit.default_timer()
	list = [1, 2, 4, 56, 75, 67, 56, 7, 56, 75647, 657, 123]
	print(linear_search(list, 67))

	stop = timeit.default_timer()
	print('Time: ', stop - start) 
	return

def linear_search(list, target):
	for i in range(len(list)):
		if list[i] == target:
			return i
	return -1

if __name__ == '__main__':
	main()
