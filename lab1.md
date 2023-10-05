<img width="423" alt="Screen Shot 2023-10-04 at 4 21 09 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/13b9f091-240f-4f74-86da-2a1406c05170"># Lab Report 1

## cd


> 1) With no arguments

<img width="427" alt="Screen Shot 2023-10-03 at 11 28 34 AM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/dd030cd3-f6fb-49e3-96cf-23ce929920d9">

   * The working directory was **/home**
   * There was no output after the command was run
   * It is reasonable to not receive an output after running the command since the command ```cd``` is only used to change the directory 
     and 
     wouldn't return or produce any output
   * The working directory was **/home** before the command was run, and remained the same when the command was run
   * There was no argument in the command line. There wasn't an argument (targeted directory) in the command line that the command asked 
     the terminal to change to, therefore, the terminal wouldn't change the directory and nothing changed



> 2) With a path to a directory as an argument

<img width="508" alt="Screen Shot 2023-10-03 at 11 44 51 AM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/a5fc464e-e88d-4a1e-8de0-777b145682cb">

   * There was also no output after the command was run
   * Same reason that there was no output since ```cd``` wouldn't return or produce anything but change the directory
   * However, the prompt changed. It changed from **[user@sahara ~]$** to **[user@sahara ~/lecture1]$**
   * The working directory was changed from **/home** to **/home/lecture1**
   * Since the argument **lecture1** was included in the command line, the terminal was told to change the directory to **lecture1**. Thus, 
     the final working directory was **home/lecture1**




> 3) With a path to a file as an argument

<img width="662" alt="Screen Shot 2023-10-03 at 9 16 11 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/d5ce0ee1-9e57-4f1f-9b5e-f119c97960c5">

   * There was an output saying ```bash: cd: Hello.java: No such file or directory** when the command was run```
   * The command told the terminal to change the working directory to the file **Hello.java**
   * Since **Hello.java** is only a file, it is an error to ask the terminal to change the current working directory **/home** to a file by 
     the command ```cd```


---

## ls


> 1) With no arguments

<img width="423" alt="Screen Shot 2023-10-04 at 4 21 09 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/66f0193d-3138-4600-970d-62190f80f539">

   * The output by this command was ```lecture1```
   * The working directory was **/home** when the command was run
   * The command ```ls``` is used to list the files and folders of the given path
   * Since there were no arguments in the command line, the terminal took the working directory **/home** as the path and printed the files 
     and folders inside it
   * **lecture1** was the only folder inside the working directory **/home**, therefore, the terminal printed out ```lecture1```




> 2) With a path to a directory as an argument

<img width="613" alt="Screen Shot 2023-10-04 at 4 32 42 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/9cb2e7e2-230c-47dd-91ba-c04c4273c754">

   * The output was ```Hello.class  Hello.java  messages  README```
   * The working directory was **/home**
   * The absolute path of the given path **lecture1** is **/home/lecture1**.
   * There is a folder **messages**, and three files **Hello.class**, **Hello.java** and **README** insides the folder **lecture1** 
   * The terminal was told to list the files and folders in the given path **lecture1**, which is **/home/lecture1**.



> 3) With a path to a file as an argument

<img width="655" alt="Screen Shot 2023-10-04 at 4 54 27 PM" src="https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/ada4d7ac-756a-4e89-aa0c-500c0c9db76c">

   * The output was ```/home/lecture1/Hello.java```
   * The working directory was **/home**
   * The given path was **/home/lecture1/Hello.java**
   * Since there aren't any files or folders inside **Hello.java**, the terminal couldn't really print anything from **Hello.java**, and 
     resulted in printing the absolute path of **Hello.java**


---

## cat


> 1) With no arguments

![Screenshot 2023-10-04 231427](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/ab3be205-af45-4b1e-a40f-347d4b59cb9c)



