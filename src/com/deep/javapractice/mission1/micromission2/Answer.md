Program C
---
Both program A and B follow the rule of encapsulation by decalring the fields as private and only by accessing them through the desired functions.

The object becomes immutable as once declared it cannot be accessed or there exist any method that can set it as there are no setters created

# Theory

1) Since every copy of the object will have the instance variable stored in its memory for memory saftey reasons (to prevent garbage values form creeping in) jvm initalizes them if not already done. <br> On the other hand local variables are monitored very closely since their inception as they are stored in stack thus it is easy to catch any error in compile time so the language forces the programmer to initialize it to prevent bugs like doing operation on unsigned data types.

2) Yes a class can exist without an object if it contains the main method which will allow it to exist untill the main method is working.

3) Static methods do not belong to any single object but non-static does. so to determine the particular non-static variable it is always to be accessed through its object.

4) ClassA a = new ClassA(); -> initialization of a new object <br>
   ClassA b = a; -> creating another variable which point to the same object throug the reference.

5) this returns the object through which it is called it helps by making it easy instead of using hacks when a object wants to retur its own address.


> Attempt 2

2) Yes static classes as well as utility classes exist without objects.