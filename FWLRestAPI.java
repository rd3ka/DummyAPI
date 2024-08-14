import com.sun.net.httpserver.HttpServer;
import java.util.List;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

class FWLRestAPI {
  /**
    Creates a JSON string from a given message and a list of integers
     @param m: The message to include in the JSON object
     @param d: The list of intergers to include in the JSON array 
   **/

  private static String createJSONObject(String m, List <Integer> d) {
    StringBuilder json = new StringBuilder();
    json.append("{");
    json.append("\"message\":\"").append(m).append("\",");
    json.append("\"data\":[");
    for(int i = 0; i < d.size(); ++i) {
      json.append(d.get(i));
      if (i < d.size() - 1) json.append(",");
    }
    json.append("]");
    json.append("}");
    return json.toString();
  }
  
  public static void main(String []args)throws IOException {
    /* HttpServer is the main object responsible for listening on port 800 */
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
    /* Create a context for the API or in simple terms, tells the path */
    server.createContext("/api/go", (exchange -> {
      /* ^we consider a lamda function with the exchange object, the exchange object
      ia resposible for handling the GET request */
      if ("GET".equals(exchange.getRequestMethod())) {
        String response = createJSONObject("Hello World! from Frameworkless RESTFull API!", List.of(1,2,3)); 
        /* if the HTTP request is confirmed to be GET, a JSON response is created */
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, response.getBytes().length);
        /* exchange object is used to set the type of data and the then send the response code */

        /* In-case the output stream is unable to write the data from exchange object, 
          an exception might occur as we might try to write and flush from an empty response object */
        try (OutputStream output = exchange.getResponseBody()) {
            output.write(response.getBytes());
            output.flush();
        }
      }
      else {
        exchange.sendResponseHeaders(405, -1);
        /* ^In case the exchange object cannot confirm the GET request, we send a 405 response */
      }
      exchange.close();
      /* the work of exchange object is done here */
    }
    ));

    server.setExecutor(null);
    /* sets the executor of the server, here we give null, so the server does not have any explicit executor */
    server.start();
    /* we start the server */
    System.out.println("Server started on http://localhost:8080/api/go");
    /* log out this message so that we can see the response JSON from this URL */
  }
}
