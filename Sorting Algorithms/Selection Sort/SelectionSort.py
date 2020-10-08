a = [2,9,1,3,12,6,4,10]

#Selection Sort
def sort(a):
    for i in range(0,len(a)-1):
        min_index = i
        # selecting min element from the unserted array and 
        for j in range(i+1,len(a)):
            if a[j]<a[min_index]:
                min_index = j
        a[i],a[min_index] = a[min_index],a[i] # Swapping the i'th element with min element
         
    print(a)

sort(a)

