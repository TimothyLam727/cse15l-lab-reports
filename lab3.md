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

**Test run**:
![Screenshot 2023-10-31 212614](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/898e815f-12f6-4ab7-baca-037f3c265c25)


2. An input that doesn't include a failure

```
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
```

## Part 1
