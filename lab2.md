# Lab Report 2
Wai Taing Lam A18089070
## Part 1

Code of StringServer:
```
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    String strOutput = "";
    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
            String output[] = url.getQuery().split("=");
            if (output[0].equals("s")) {
                num++;
                String str2 = String.format("%d. %s\n", num, output[1]);
                str2 = str2.replaceAll("\\+", " ");     // replace + with space since in URI if we type space it converts into %20 which converts to + in JAVA
                strOutput = strOutput + str2;
                return strOutput;
            } else {
                return "404 Not Found!";
            }
        } 
            return "";
    }
}


class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```
1.
![Screenshot 2023-10-18 233959](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/3a92fca5-825a-4ecb-9acd-36dc4e8567c7)
2.
![Screenshot 2023-10-18 234027](https://github.com/TimothyLam727/cse15l-lab-reports/assets/146874935/4d237133-5903-483d-be52-1a1baf469c78)


## Part 2


## Part 3
