from BubbleSort import bubble_sort
from QuickSort import quick_sort
from MergeSort import merge_sort
import time
import sys




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

def printRes(fil, t0, t1):
    tRes = t1 -t0

    with open(fil, 'w') as f:
        f.write(str(tRes))



def main(args):

    fil = args[0]
    metod = args[1]
    nbrTimes = int(args[2])

    fileStr = "C:\\Users\\erikp\\jt\\dataUP\\ord1.txt"


    arrD = read_tal1()
    arrStr = read_ord1()

    for i in range(nbrTimes):
        if(fil == "ord"):
            if(metod == "bubble"):
                t0 = int(time.time_ns() *1000)
                arrStr = read_ord1()
                bubble_sort(arrStr)
                t1 = int(time.time_ns() *1000)
                printRes(fileStr, t0, t1)

            elif(metod == "quick"):
                t0 = int(time.time_ns() *1000)
                arrStr = read_ord1()
                quick_sort(arrStr)
                t1 = int(time.time_ns() *1000)
                printRes(fileStr, t0, t1)

            elif(metod == "merge"):
                t0 = int(time.time_ns() *1000)
                arrStr = read_ord1()
                merge_sort(arrStr)
                t1 = int(time.time_ns() *1000)
                printRes(fileStr, t0, t1)

        elif(fil == "tal"):
            if(metod == "bubble"):
                t0 = int(time.time_ns() *1000)
                arrD = read_tal1()
                bubble_sort(arrD)
                t1 = int(time.time_ns() *1000)
                printRes(fileStr, t0, t1)

            elif(metod == "quick"):
                t0 = int(time.time_ns() *1000)
                arrD = read_tal1()
                quick_sort(arrD)
                t1 = int(time.time_ns() *1000)
                printRes(fileStr, t0, t1)

            elif(metod == "merge"):
                t0 = int(time.time_ns() *1000)
                arrD = read_tal1()
                merge_sort(arrD)
                t1 = int(time.time_ns() *1000)
                printRes(fileStr, t0, t1)


    


if __name__ == "__main__":
    main(sys.argv[1:])

