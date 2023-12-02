# Lab Report 5
Wai Taing Lam A18089070

## Part 1

_The java files and bash script are from the week 6 lab._

Student's problem:

Hi, I am working on the bash script from the week 6 lab. I wrote two tests, one for the merge functino and the other one is for the filter functino. I was able to detect compile error and return a zero score for the repository with syntax error https://github.com/ucsd-cse15l-f22/list-methods-compile-error. However, I wasn't able to return a perfect score for the correct repository https://github.com/ucsd-cse15l-f22/list-methods-corrected.

<img width="940" alt="Screen Shot 2023-12-01 at 8 02 50 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/167f5e40-0bd6-46ee-8b45-87817b6626b8">


TA's respond:

Hi, it seems there are two possible reasons: error in determining the grade in your bash script or error in your java test file. I would recommend you to write an extra java file that prints out the lists after running the student's functions to see if everything behaves as expected. If not, go back to your bash script and check your conditional statement. You can use the command ```echo "$?"``` to print out the return status to double check.

## Part 2
