1) It is a blueprint with only the method declerations hence it cannot be instantiated unless implemented by a class.

2) Since interfaces only have method signatures if two interface have the same method signature only 1 implementation can work for both but with abstract classes with concrete methods it can cause confusions hence not allowed.

3) If you want to display to the public and has to force the child calss to implement it.

4) Yes If it is left as it is abstract methods are the left abstract in the abstract class also and the final concrete class inheriting it has to add an implementation for it.

5) If we want to generate multiple interfaces with different specific separeted concerns we can implement all of them to a single class if need be but cannot do the same with abstract classes.

> Attempt 2

1) Since interfaces are pure contracts they only define what to implement and not how thus having instances is opposite of the need as it is made to be independent of state which instantiation forces.

2) default methods are added to maintain backward compatibility by providing new methods with basic implementation which can be overriden in the next level and will not break old codes without it present.