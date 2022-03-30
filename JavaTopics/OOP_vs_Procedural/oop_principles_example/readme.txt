In this example we showcase the object oriented principles of polymorphism, inheritance, encapulation and abstraction

The example consists of the following structure:
Shape : The base class for all shapes
Triangle: The triangle shape
Rectangle: The rectangle shape

Also there is an interface called IBasicShapeOperations
that contains the methods:
1) calculatePerimeter
2) calculateArea

* The encapulation principle is demonstrated by every class, since they all have both private and
public fields along with getters and setters in order to achieve code security
* The Abstraction principle is demonstrated by the IBasicShapeOperations interface, which hides
the implementation details and complexities.
* The inheritance principle is demonstrated by both Triangle and Rectangle classes, since they
extend the Shape class and have an IS-A relationship with it.
* The polymorphism principle is demonstrated in the Main class, where an ArrayList of type Shape is
created and all shapes (inluding Triangles and Rectangles) are added to it. After that their common
methods are called, but perform differenty in each one