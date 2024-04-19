from BubbleSort import bubble_sort
from QuickSort import quick_sort
from MergeSort import merge_sort
import time



def read_ord1():
    result = [""] * 1000

    try:
        with open("C:\\Users\\erikp\\jt\\dataUP\\ord1.txt", "r") as file_ord1:
            for i in range(1000):
                result[i] = file_ord1.readline().strip()
                #print(i)

            #print(result[745])
            #print("Size:", len(result))

    except IOError as e:
        print(e)

    return result

def read_tal1():
    result = [0] * 1000

    try:
        with open("C:\\Users\\erikp\\jt\\dataUP\\tal1.txt", "r") as file_tal1:
            for i in range(1000):
                result[i] = float(file_tal1.readline().strip())
                #print(i)

            #print(result[745])
            #print("Size:", len(result))

    except IOError as e:
        print(e)

    return result


def main():

    arrD = read_tal1()
    arrStr = read_ord1()
    t0 = time.time_ns()
    bubble_sort(arrStr)
    
    t1 = time.time_ns()
    tRes = t1 -t0 
    print(tRes)


main()

