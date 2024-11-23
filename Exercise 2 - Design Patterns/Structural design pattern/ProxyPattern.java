//ApiService is the real subject that fetches data.
//ApiProxy wraps ApiService and adds caching to avoid redundant data fetching.
//The client interacts with the proxy instead of directly accessing the service.
interface ApiInterface{
    String fetchData(String endpoint);
}

// Real Subject
class ApiService implements ApiInterface {
    public String fetchData(String endpoint) {
        return "Data from " + endpoint;
    }
}

// Proxy
class ApiProxy implements ApiInterface {
    private ApiService apiService = new ApiService();
    private String cachedData;

    public String fetchData(String endpoint) {
        if (cachedData == null) {
            cachedData = apiService.fetchData(endpoint);
        }
        return cachedData;
    }
}

// Client
public class ProxyPattern {
    public static void main(String[] args) {
        ApiProxy proxy = new ApiProxy();
        System.out.println(proxy.fetchData("/data"));
        System.out.println(proxy.fetchData("/data")); // Cached
    }
}
