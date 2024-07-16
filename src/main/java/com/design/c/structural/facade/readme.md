# Facade Pattern

Provides a unified interface to a set of interfaces in a subsystem.


### Example:
- Sending notification to a user using external libraries

Unified interface:

```java

public void sendNotification(String userId, Notification notification){
    
    // Fetching the active tokens
    List<Tokens> tokens = db.fetch();
    List<String> iosTokens = // Filter iOS
    List<String> firebaseTokens = // Filter Firebase
    
    // Creating APNS client with valid notification body
    // Creating Firebase client with valid notification body
}
```

This is a pattern which we use many times unknowingly

