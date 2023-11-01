# Lab Report 3
Wai Taing Lam A18089070
## Part 1

Examining the bug from the function testReversed()

1. A failutre-inducing input

```
  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }
```

The program should reverse the order of the input array. In this case, the input array is ```{1, 2, 3, 4, 5}``` and the expected output is ```{5, 4, 3, 2, 1}```.

**Test run**

![Screenshot 2023-10-31 221258](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/9ae0f0a4-6fe1-4f4c-af1e-2bf67d090afe)


2. An input that doesn't include a failure

```
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
```

Input array  is an empty array, therefore, the expected and actual output is also an empty array.

**Test Run**

![Screenshot 2023-10-31 221216](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/132911dc-aa15-4b34-945f-7f5b887d6d04)


3. Symptom

![Screenshot 2023-10-31 221509](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/0a926e6a-81ae-4e45-9a29-73bc745451a5)

The symptom of the first test is the first element of the expected array and the actual output array doesn't match.
There is no symptom in the second test and it runs "perfectly."

4. Code change

**Before change**
```
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```

**After change**
```
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }
```
## Part 2
