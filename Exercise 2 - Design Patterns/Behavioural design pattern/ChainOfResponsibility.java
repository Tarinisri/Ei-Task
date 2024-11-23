//SupportHandler is an abstract class that defines the contract for handling requests.
//Level1Support and Level2Support are concrete handlers.
//The request is passed along the chain until a handler processes it.
//The client only sends the request to the first handler.


// Handler
abstract class SupportHandler {
    protected SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(String issue);
}

// Concrete Handlers
class Level1Support extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Basic")) {
            System.out.println("Level 1 support handled the issue.");
        } else if (next != null) {
            next.handleRequest(issue);
        }
    }
}

class Level2Support extends SupportHandler {
    public void handleRequest(String issue) {
        System.out.println("Level 2 support handled the issue.");
    }
}

// Client
public class ChainOfResponsibility {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        level1.setNext(level2);

        level1.handleRequest("Basic");
        level1.handleRequest("Complex");
    }
}
