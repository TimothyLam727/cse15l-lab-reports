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
                strOutput = strOutput + String.format("%d. %s\n", num, output[1]);;
                return strOutput;
                //System.out.print(num + ". " + output[1] + "\n");
                // "%d. %s\n", num, output[1]
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
## Part 2


## Part 3
