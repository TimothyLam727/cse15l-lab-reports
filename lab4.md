4. Log into ieng6

   ![image](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/e2010262-269e-4f2e-832c-9d69dd03e758)
   ![image](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/e7d8a465-a6cc-4f0c-a4d0-4766523651da)


   key pressed: ssh cs15lfa3ju@ieng6.ucsd.edu, <<e>Enter<e>>, **my password**, <<e>Enter<e>>

5. Clone your fork of the repository from your Github account (using the SSH URL)

   ![image](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/c668373b-edae-4ec6-b235-d9c197d6308e)

   key pressed: git <<e>space<e>> clone <<e>space<e>> git@github.com:TimothyLam727/lab7.git, <<e>Enter<e>>, **my github passphrase**

   _git@github.com:TimothyLam727/lab7.git is the SSH URL of my forked repository_

6. Run the tests, demonstrating that they fail

   ![image](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/f13c600a-2377-41ef-9a15-2e2a7c056dbd)

   key pressed: cd <<e>space<e>> lab7 <<e>Enter<e>>, javac <<e>space<e>> -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java <<e>Enter<e>>,
   java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamples <<e>Enter<e>>

   - the command ```cd lab7``` changes the working directory to **lab7/**
   - the command ```javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java``` compiles all the .java files with JUnit in the directory lab7
   - the command ``` java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java org.junit.runner.JUnitCore ListExamples``` runs the tests

9. Edit the code file to fix the failing test

   <img width="396" alt="Screen Shot 2023-11-17 at 11 05 55 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/f99273a0-084a-423a-99d7-22801458904e">


   key pressed: /index2 <<e>enter<e>>, nnnnnnnnn, <<e>right<e>><<e>right<e>><<e>right<e>><<e>right<e>><<e>right<e>><<e>right<e>>, i <<e>backspace<e>> 2, <<e>esc<e>> :wq <<e>enter<e>>


10. Run the tests, demonstrating that they now succeed


11. Commit and push the resulting change to your Github account (you can pick any commit message!)

