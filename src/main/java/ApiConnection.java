import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//NOT USED!!!!!!!!!!!!!!!!!

public class ApiConnection {
    public static String ApiConnect(String Url) throws IOException, InterruptedException {
        try {
            // Creating HTTP request with custom headers, required by API vendor
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(Url))
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            // Get HTTP response
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "error";
    }


}
