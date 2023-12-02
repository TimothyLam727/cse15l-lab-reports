# Lab Report 5
Wai Taing Lam A18089070

## Part 1

_The java files and bash script are from the week 6 lab._

**grade.sh:**
```
CPATH='.:../lib/hamcrest-core-1.3.jar:../lib/junit-4.13.2.jar'

rm -rf student-submission
rm -rf grading-area

mkdir grading-area

git clone $1 student-submission
echo 'Finished cloning'


# Draw a picture/take notes on the directory structure that's set up after
# getting to this point

# Then, add here code to compile and run, and do any post-processing of the
# tests

if [ -f $file ]
then
	echo "file exist"

else 
	echo "wrong file input"
	echo "Grade: 0/2"

fi

cp -r student-submission/* grading-area/
cp -r TestListExamples.java grading-area/

cd grading-area



javac -cp $CPATH *.java 2> error.txt

if [ $? -eq 0 ]
then
	java -cp $CPATH org.junit.runner.JUnitCore TestListExamples > output.txt

	
	passed_line=$(grep "OK" output.txt)

	if [ -n "$passed_line" ]
       	then
	        grade=$(echo "$passed_line" | grep -oE '[0-9]+')
	        echo "Grade : $grade/$grade"
		echo "great job!"
	else 
	        num_tests_line=$(grep -oE "Tests run: [0-9]+" output.txt)
       		numTests=$(echo "$num_tests_line" | grep -oE '[0-9]+')
        	num_failed_line=$(grep -oE "Failures: [0-9]+" output.txt)
        	numFailed=$(echo "$num_tests_line" | grep -oE '[0-9]+')
        	numCorrect=$((numTests - numFailed))
        	echo "Grade : $numCorrect/$numTests"
		echo "good try"
	fi

else
	echo "Compilation error"
	echo "Grade: 0/2"
fi
```

**TestListExamples.java:**
```
import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equals("moon");
  }
}

public class TestListExamples {


  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }


  @Test
  public void testFilter(){
    List<String> argList = Arrays.asList("moon", "moon1", "MOON", "moOn");
    List<String> expected = Arrays.asList("moon", "MOON", "moOn");
    StringChecker sc = new IsMoon();
    List<String> result = ListExamples.filter(argList, sc);
    assertEquals(expected, ListExamples.filter(argList,sc));

  }

}
```


**Student's problem:**

Hi, I am working on the bash script from the week 6 lab. I wrote two tests, one for the merge functino and the other one is for the filter functino. I was able to detect compile error and return a zero score for the repository with syntax error https://github.com/ucsd-cse15l-f22/list-methods-compile-error. However, I wasn't able to return a perfect score for the correct repository https://github.com/ucsd-cse15l-f22/list-methods-corrected.

<img width="941" alt="Screen Shot 2023-12-01 at 8 40 13 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/033ba708-9e58-4488-a0cd-c81ffc8bc571">


**TA's respond:**

Hi, it seems there are two possible reasons: error in determining the grade in your bash script or error in your java test file. I would recommend you to write an extra java file that prints out the lists after running the student's functions to see if everything behaves as expected. If not, go back to your bash script and check your conditional statement. You can use the command ```echo "$?"``` to print out the return status to double check.


**Student's respond:**

**Testfile.java:**
```
//test file to detect potential error in when structuring list with the given merge and fileter methods.
import java.util.Arrays;
import java.util.List;

class Testfile {
    static class IsMoon implements StringChecker {
        public boolean checkString(String s) {
            return s.equals("moon");
        }
    }

    public static void main(String[] args) {
        // print list after merge
        List<String> left = Arrays.asList("a", "b", "c");
        List<String> right = Arrays.asList("a", "d");
        List<String> merged = ListExamples.merge(left, right);
        List<String> expected = Arrays.asList("a", "a", "b", "c", "d");

        System.out.println(Arrays.toString(merged.toArray()));
        System.out.println(Arrays.toString(expected.toArray()));



        // print list after filter
        List<String> argList = Arrays.asList("moon", "moon1", "MOON", "moOn");
        List<String> expected2 = Arrays.asList("moon", "MOON", "moOn");
        StringChecker sc = new IsMoon();
        List<String> result = ListExamples.filter(argList,sc);

        System.out.println(Arrays.toString(result.toArray()));
        System.out.println(Arrays.toString(expected2.toArray()));

    }
}
```

The output I got after running my written test java file:
<img width="1440" alt="Screen Shot 2023-12-01 at 8 29 03 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/b28358ee-8aa6-4a2a-bde3-8ca6279ad9d5">
The output from the merge method behaved as expected. However, the output from the filter method wasn't as expected. The expected list is ```[moon, MOON, moOn]```, but I got ```[moon]``` from the filter method. Therefore, the error is that the list created doesn't have the expected values. Since the student's repository is correct as stated, in _TestListExamples.java_ not _grade.sh_. Looks like the expected list wants all string values of ```moon``` ignoring the case differences. What I did in the ```IsMoon``` force the stringchecker to check if the string mathch exactly with ```moon``` which case matters. Therefore in my ```IsMoon``` method, I should do ```return s.equalsIgnoreCase("moon");``` instead of ```return s.equals("moon");``` to ignore the case differences of the strings.

**Output after fixing bugs:**
<img width="915" alt="Screen Shot 2023-12-01 at 8 40 29 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/bfbe2ee5-db9c-4328-ad77-0460368042b3">


**Corrected TestListExamples.java:**
```
import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {


  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }


  @Test
  public void testFilter(){
    List<String> argList = Arrays.asList("moon", "moon1", "MOON", "moOn");
    List<String> expected = Arrays.asList("moon", "MOON", "moOn");
    StringChecker sc = new IsMoon();
    List<String> result = ListExamples.filter(argList, sc);
    assertEquals(expected, ListExamples.filter(argList,sc));

  }

}
```

## Part 2 - Reflection
I have learned a lot during lab time. I have learned to debug with the Java Debugger JDB which saves me a lot of time finding the bugs from my java code in the terminal. Besides, I have learned how to push my editted code to Github and I find it really helpful and convenient. The autograder through bash script is really cool as well. I have never though about that the grading of coding assignments could be done in such way.
