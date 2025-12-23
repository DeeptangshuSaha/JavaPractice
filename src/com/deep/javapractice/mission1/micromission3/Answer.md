1) Constructors cannot be overriden as they are not inherited when the child class extends the parent class.
2) Because all non-static methods are mapped during compile time hence does not allow to do that
3) It cannot as static methods are not inherited.
4) No a parent cannot do that as it has no access to the child class.
5) If we want to keep the sensitive data from being mismanaged we need to make sure that it is not accessible from any other place then inheriting such a class is a bad-choice. 

> Attempt 2

2) Because it is resolved based on reference type instead of object type like during runtime.
3) They are hidden as the call depends on reference type not object type.