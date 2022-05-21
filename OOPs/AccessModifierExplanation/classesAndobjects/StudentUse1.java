package AccessModifierExplanation.classesAndobjects;

// import java.util.*;
public class StudentUse1 {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Bishal";
        s1.setrollNumber(-123);          // see if we woudnt had set this rollNumber as private in the Student class then anyone could have easily come and set invalid index, but now after making the rollNumber private no one can access our rollNumber outside the student class
                                         // so how can we use this rollNumber outside the student class so we can do that via getters and setters in the same class of student and making these getters and setters public so that we can access these from anywhere, 
                                         // so now agar kahi sae v is getters and setters ko agar access kar sakte hai tho phir tho hum indirectly phir sae rollNumber ko hi access kar rhe hai qki hamne getters and setters tho private wale rollNumber ko hi bahar sae access karne k liye banaya tha na,
                                         // so phir waisi bat hai tho phir hum getters and setters ko use hi q kare, directly rollNumber ko hi public kar dete hai na, but kuch tho faida hoga getters and setters use karne ka, yes bhot bara faida hai, jab hum getters and setters use karte hai tho hum 
                                         // usme setters me apni marzi ki condition dal sakte hai ki if (rolnum <= 0) {return; } warna agar valid hai tho hi set karlo.... Matlab ki hum apni condition dal sakte hai na ki agar tum koi valid rollNumber dalte ho i.e. > 0 tho hi mere rollNumber ko update karne dange, warna return kar dnge..
                                         // So this was the very big merit of using getters and setters, as we can authenticate the access to our private variables accourding to our condition.

        Student s2 = new Student();
        s2.name = "Keshri";
        s2.setrollNumber(7);

        System.out.println(s1.name);
        System.out.println(s1.getrollNumber());
        System.out.println(s2.name);
        System.out.println(s2.getrollNumber());
    }
}
