#Structural Design Patterns
This folder contains patterns that focus on organizing classes and objects to form larger structures.

##1. Adapter Pattern: Payment Integration System
The Adapter Pattern bridges two incompatible interfaces, enabling seamless interaction.

**Key Components:**
- Target Interface: `PaymentProcessor`
- Adaptee: `PayPal`
- Adapter: `PayPalAdapter`
- Client Code: `Adapter.java`

**Description:**
This example integrates PayPal's payment system into a unified interface (PaymentProcessor). The PayPalAdapter adapts PayPal's makePayment method to conform to the PaymentProcessor interface.

**Benefits:**
- Simplifies integration of third-party systems with existing code.
- Promotes code reusability and flexibility.

##2. Facade Pattern: Video Conversion System
The Facade Pattern provides a simplified interface to a complex subsystem.

**Key Components:**
- Subsystems: `VideoEncoder, AudioEncoder, FileWriter`
- Facade: `VideoConverterFacade`
- Client Code: `Facade.java`

**Description:**
This example simplifies video conversion by providing a single method to handle video encoding, audio encoding, and file writing through the VideoConverterFacade.

**Benefits:**
- Hides complex subsystem operations from the client.
- Simplifies the client’s interaction with the system.

##3. Proxy Pattern: API Service with Caching
The Proxy Pattern provides a surrogate to control access to an object, adding additional functionality like caching.

**Key Components:**
- Subject Interface: `ApiInterface`
- Real Subject: `ApiService`
- Proxy: `ApiProxy`
- Client Code: `Proxy.java`

**Description:**
This example demonstrates an API proxy that caches data from an API service, preventing redundant requests and improving efficiency.

**Benefits:**
- Enhances performance by reducing redundant data fetches.
- Adds additional layers like caching, logging, or security checks.