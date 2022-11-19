 - Write  classes Point and Shape with the same functionality than the ones provided by Duke
 - Specifications
   - The PerimeterAssignmentRunner class already includes the following complete methods:

      - The getPerimeter method has one parameter s of type Shape. Given a shape, this method returns the perimeter of the shape.

      - The testPerimeter method has no return value, hence its return type is void. 
        This method is used to select a data file by using the FileResource class, create a shape based on the points from that data file, and then calculate the perimeter of the shape and output its value.

      - The triangle method has no return value and creates a triangle that you can use to test the methods you will create in this assignment.

      - The printFileNames method, which we will discuss in a future lesson.

      - The main method.
 - So Shape is a collections of Points
 - FileResource: read a file and returns words
 - Example of Shape
 - Here is an example Shape that has 4 points in this order: 

(2.0, 2.0) 
(7.0, 3.0)
(6.0, 9.0)
(3.0, 5.0)
- hints
```
public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
}
```

>> So immediately, we see some other classes and methods being called here. 
The “Point” class is something that is being used here and it was loaded in the duke package at the top of the project, with the line import edu.duke*; 
. To find out more about this class, you can reference the documentation on the Duke site. 
Within that page, you’ll have to select the edu.duke package, and then select the “Point” class. 
This documentation shows that this class can make use of the “distance” method, which outputs a double-type value. 
You will also see the “distance” method being called in the above “getPerimeter” method. 
To run through the code sample above, we proceed as follows:

TestPerimeter Explanation



```
public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
}
```
## Explanation of main

```
public static void main (String[] args) {
      PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
      pr.testPerimeter();
    }
```
