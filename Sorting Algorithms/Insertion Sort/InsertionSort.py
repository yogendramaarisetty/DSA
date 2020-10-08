a = [2,9,1,3,12,6,4,10]

#Selection Sort
def sort(a):
    for i in range(1,len(a)):
        key = a[i]
        j=i-1
        while j>=0 and key<a[j]:
            a[j+1] = a[j]
            j=j-1
        a[j+1] = key
    print(a)

sort(a)

