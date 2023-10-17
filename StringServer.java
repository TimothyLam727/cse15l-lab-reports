import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
            String output[] = url.getQuery().split("=");
            return String.format(num, ". ", output[1]);
        } 
            return "404 Not Found!";
    }
}


class StringServer {
    public static void main(String[] args) throws IOException {

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
