#Behavioral Design Patterns
This folder contains implementations of various Behavioral Design Patterns. Each pattern is demonstrated through a different example, showcasing its application and benefits. Below are the details for each pattern based on the provided code.

##1. Chain of Responsibility Pattern: Support Ticket System
The Chain of Responsibility Pattern is demonstrated through a support ticket system that processes different types of issues by passing them along a chain of handlers.

**Key Components:**
- Abstract Handler: `SupportHandler`
- Concrete Handlers: `Level1Support, Level2Support`
- Client Code: `ChainOfResponsibility.java`

**Description:**
This implementation handles support requests where Level1Support manages basic issues, and Level2Support handles complex ones. Requests are passed sequentially along the chain until a handler processes them.

**Benefits:**
- Decouples the sender of a request from its receivers.
- Flexible addition or modification of handlers without affecting the client code.

##2. Memento Pattern: Text Editor Example
The Memento Pattern is demonstrated in a text editor that allows saving and restoring its content state.

**Key Components:**
- Memento: `TextEditorState`
- Originator: `TextEditor`
- Client Code:` Memento.java`

**Description:**
This implementation captures the state of the TextEditor using TextEditorState. The client can save the current content and later restore it to a previous version.

**Benefits:**
- Provides undo functionality without exposing the internal state of the object.
- Encapsulates the state, ensuring consistency and security.

##3. Observer Pattern: Stock Market Notification System
The Observer Pattern is demonstrated through a stock market notification system where clients (observers) are notified of stock price changes by the stock market (subject).

**Key Components:**
- Subject: `StockMarket`
- Observer Interface: `Observer`
- Concrete Observer: `StockClient`
- Client Code: `ObserverPattern.java`

**Description:**
The StockMarket manages a list of observers and notifies them of stock price updates. Clients dynamically register as observers and receive notifications when the stock price changes.

**Benefits:**
- Establishes a one-to-many relationship between objects, allowing real-time updates.
- Enables dynamic subscription and unsubscription of observers.