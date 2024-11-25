// ApiService is the real subject that fetches data.
// ApiProxy wraps ApiService and adds caching to avoid redundant data fetching.
// The client interacts with the proxy instead of directly accessing the service.

import java.util.HashMap;
import java.util.Map;

// Interface
interface ApiInterface {
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
    private Map<String, String> cache = new HashMap<>();

    public String fetchData(String endpoint) {
        if (!cache.containsKey(endpoint)) {
            System.out.println("Fetching from ApiService: " + endpoint);
            cache.put(endpoint, apiService.fetchData(endpoint));
        } else {
            System.out.println("Returning cached data for: " + endpoint);
        }
        return cache.get(endpoint);
    }
}

// Client
public class ProxyPattern {
    public static void main(String[] args) {
        ApiProxy proxy = new ApiProxy();

        // First call - fetches from the real service
        System.out.println(proxy.fetchData("/data1"));

        // Second call - returns cached data
        System.out.println(proxy.fetchData("/data1"));

        // New endpoint - fetches from the real service
        System.out.println(proxy.fetchData("/data2"));

        // Cached endpoint
        System.out.println(proxy.fetchData("/data2"));
    }
}