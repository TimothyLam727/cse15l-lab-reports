4. Log into ieng6

   <img width="800" alt="Screen Shot 2023-11-17 at 11 30 53 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/982a2972-48f9-43f9-a42f-2b81855d549f">


   key pressed: ```ssh cs15lfa3ju@ieng6.ucsd.edu <<e>Enter<e>>```, **my password** ```<<e>Enter<e>>```

5. Clone your fork of the repository from your Github account (using the SSH URL)

   ![image](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/c668373b-edae-4ec6-b235-d9c197d6308e)


   key pressed: ```git <<e>space<e>> clone <<e>space<e>> git@github.com:TimothyLam727/lab7.git```, ```<<e>Enter<e>>```, **my github passphrase** ```<<e>Enter<e>>```

   _git@github.com:TimothyLam727/lab7.git is the SSH URL of my forked repository_

6. Run the tests, demonstrating that they fail

   <img width="974" alt="Screen Shot 2023-11-17 at 11 32 10 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/6cc0b9f0-00d5-4c5d-b385-f1247ddd27ab">
   

   key pressed: ```cd <<e>space<e>> lab7 <<e>Enter<e>>```, ```javac <<e>space<e>> -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java <<e>Enter<e>>```,
   ```java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamples <<e>Enter<e>>```

   - the command ```cd lab7``` changes the working directory to **lab7/**
   - the command ```javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java``` compiles all the .java files with JUnit in the directory lab7
   - the command ``` java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java org.junit.runner.JUnitCore ListExamples``` runs the tests

9. Edit the code file to fix the failing test

   <img width="396" alt="Screen Shot 2023-11-17 at 11 05 55 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/f99273a0-084a-423a-99d7-22801458904e">

   **Before code change:**
   
   <img width="634" alt="Screen Shot 2023-11-17 at 11 07 21 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/c7096d02-8287-4c49-a966-fd4c93c9eaec">

   **After code change:**
   
   <img width="613" alt="Screen Shot 2023-11-17 at 11 08 20 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/f560fe48-bc99-4875-8d80-6240ad87f6fd">


   key pressed: ```vim ListExamples.java```, ```/index1 <<e>enter<e>>```, ```nnnnnnnnnn```, ```<<e>right<e>><<e>right<e>><<e>right<e>><<e>right<e>><<e>right<e>><<e>right<e>>```, ```i <<e>backspace<e>> 2```, ```<<e>esc<e>> :wq <<e>enter<e>>```


   - the command ```vim ListExamples.java``` opens the vim text editor for the java file **ListExamples.java**.
   - Then, the command ```/index1``` searches for the appearances of **index1** in the file. By clicking ```n``` 10 times, it brings the cursor to the line where **index1** needs to be changed to **index2**.
   - 
   - 
   
11. Run the tests, demonstrating that they now succeed


12. Commit and push the resulting change to your Github account (you can pick any commit message!)

