def rotateArray(arr: list, k: int) -> list:
    # Write your code here.
    i=k
    j=0
    b=[]
    n=len(arr)
    while j<n:
        b.append(arr[i])
        i=(i+1)%n
        j+=1
    return b
