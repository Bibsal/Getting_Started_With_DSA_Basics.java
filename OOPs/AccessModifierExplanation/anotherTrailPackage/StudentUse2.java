package AccessModifierExplanation.anotherTrailPackage;

import AccessModifierExplanation.classesAndobjects.Student;         // see here we could only create the student object below by import the package of classesAndobjects where our Student class is present and then only we can access it

public class StudentUse2 {

        Student s = new Student();  
        s.name = "Bishal";                             // so this can't be accessed because the name field/variable in Student class is default which only allows the access in the scope of it's own package other files outside / from other packages cannot use it.
    
}
