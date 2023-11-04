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

The array ```newArray``` was created but never used to store the reversed array. The error was storing elements from ```newArrray``` which is an empty array, into ```arr``` which stores the original array, and return ```arr```. What the original code did is coying the empty array ```newArrray``` in reversed order to ```arr```, and therefore, the function would just return an empty array.

Two changes are made in the new code. First is storing the reversed order of ```arr``` to the targeted array ```newArray```. Here, the elements from the original array ```arr``` won't be messed up and everything is stored correctly to ```newArray``` in backward. Secondly, the function returns the modified new array ```newArray``` instead of the original array. Overall, the changes allow the function to store the reversed array into a temporary array and return the temporary array.


## Part 2

**grep**

1. -v

```grep -i <str> <file>``` prints all the lines from the file that don't contain the given string.

Example 1:
```grep -i "Office" technical/government/Gen_Account_Office/og98030.txt```
This command line prints all lines from _technical/government/Gen_Account_Office/og98030.txt_ that exclude the word "Office".

<img width="708" alt="Screen Shot 2023-11-04 at 2 17 37 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/3251a04c-eb16-4d73-a2f7-f4817a0781d3">

The line "Office of the General Counsel" is not appeared in the output.

Example 2:
```grep -v "whistleblowing" technical/plos/pmed.0020281.txt```
This command line prints all lines from _technical/plos/pmed.0020281.txt_ that exclude the word "whistleblowing".

<img width="808" alt="Screen Shot 2023-11-04 at 2 26 22 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/506575a6-0d0e-4028-afaa-553a37783484">

The line "whistleblowing—as discussed, in part, in" and "For me, whistleblowing is..." are not appeared in the output.

* This command option is useful when we want to exclude something while searching in the file, especially we know what we don't want to be included in the output.


2. -w

```grep -w <str> <file>``` prints all the lines from the file containing matches that form whole word **str**.

Example 1:
```grep -w "to" technical/plos/pmed.0020237.txt```
This command line prints all lines containing and matching exactly the word "to" from the file _technical/plos/pmed.0020237.txt_.

<img width="784" alt="Screen Shot 2023-11-04 at 2 37 57 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/cbff8868-e78f-4d8f-93c4-47aa91b23ae9">

Lines including the word "low" and "regulatory" and more are not included in the output; only lines have the word exactly matches "to" are printed.

Example 2:
```grep -w "it" technical/911report/preface.txt```
This command line prints all lines containing and matching exactly the word "it" from the file _technical/911report/preface.txt_.

<img width="899" alt="Screen Shot 2023-11-04 at 2 44 47 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/4be9c097-3752-41ed-a4cd-3b7934a381f6">

Lines including the word "United", "with", "committed" and more are not included in the output; only lines have the word exactly matches "it" are printed.

* This command option is useful when we want to find something that matches exactly what we want. For example, if we are looking for lines that contain the word "foo", and we don't want anything else such as "foo123", this command option is useful to exclude every other possibility.


3. -R

```grep -R <str> <dir>``` prints all the lines from the files of the directory that contain the string.

Example 1:
```grep -R " line 911" technical/911report```
This command prints all the lines from file in the directory _technical/911report_ that contain the string "911".

<img width="999" alt="Screen Shot 2023-11-04 at 3 26 37 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/a94732d7-07ac-455e-a774-b6c1cfa053b4">

Lines from _technical/911report/chapter-9.txt_ and _technical/911report/chapter-13.5.txt_ from the directory _911report_ containing the string "911" are printed.

Example 2:
```grep -R "911" technical/biomed```
This command line prints all the lines from files in the directory _technical/biomed_ that contain the string "911".

<img width="755" alt="Screen Shot 2023-11-04 at 3 32 13 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/e50fb560-e9ee-4746-b821-f62fc8b6b806">

Lines containing the string "911" from multiple files in the _technical/biomed_ directory are printed.

* This command option is useful when looking for lines containing specific words in multiple files in a directory.
* Note: if we insert a file instead of a directory, the command line works as a normal ```grep``` command.


4. -c

```grep -c <str> <dir>``` counts and prints the number of lines containing the word in the file.

Example 1:
```grep -c "America" technical/plos/journal.pbio.0020001.txt```
This command counts and prints the number of line containing the word "America" in the file _technical/plos/journal.pbio.0020001.txt_.

<img width="827" alt="Screen Shot 2023-11-04 at 3 46 52 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/c12b025f-f600-4941-9a53-ddce4f5c320d">

There are 42 lines containing the word "America".

Example 2:
```grep -c "older" technical/biomed/1468-6708-3-1.txt```
This command counts and prints the number of line containing the word "older" in the file _technical/biomed/1468-6708-3-1.txt_.

<img width="723" alt="Screen Shot 2023-11-04 at 3 48 53 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/e575fe87-0bc2-4d51-be64-e28d7eaf9661">

There are 21 lines containing the word "older".

* This command option is useful for statistical purpose, counting the number of lines containing the string.
* Note: this command option counts the number of lines not number of appearance of the string.
