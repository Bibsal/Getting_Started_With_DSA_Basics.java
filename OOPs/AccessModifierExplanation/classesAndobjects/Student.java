package AccessModifierExplanation.classesAndobjects;

public class Student {
    String name;                   // so since this name variable is not private and it's not even public but it is default so it can be accessed by anyone via the object of Student class inside the same package but can not be used in another package, only public can be used everywhere
    private int rollNumber;        // Here since our rollNumber has private access modifier so no one can access it outside the student class, this is done for data encapsulation/hiding, an alternate way to use/access this private rollNumber outside our class is by using public getters & setters functions

    public void setrollNumber(int rolNum) {
        if(rolNum <= 0) {
            return;
        }
        rollNumber = rolNum;           // we authenticated with if condition and then agar valid hai tabhi set kiya
    }

    public int getrollNumber() {
        return rollNumber;              // so hamare private datamember/instance variable ko hum public ka member function bana kar access kar sakte hai, remember that...
    }

}
