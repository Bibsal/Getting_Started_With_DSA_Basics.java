So we have 4 types of Access Modifier in Java
1. default access modifier
2. public access modifier
3. private access modifier
4. protected access modifier

--------------------------------------------------------------------

1. default access modifier :- 
                            So when we do not specify any modifier while declaring a data member/instance variable or member functions(Eg:- String name, public char firstLetter, private int rollNumber), (so here though firstLetter and rollNumber have their own access modifier, but name dosent have it's specifier so that is called/considered as default specifier)so at that moment java uses/considers it as default access modifier so such a modifier is said to be default access modifier.........Now main thing to note here is that the scope of using the variable/methods of default access specifier is within it's own package and cannot be used in the files of other packages, matlab ki hum sirf apne package me jo jo v hai un sab me hi default wale variable ko use kar sakte hai baki k packages me usko use nahi kar sakte( Eg like in our package of classesAndobjects we created a Student class and inside it we declared a String name with default specifier(by default), so now when we made another package i.e. anotherTrailPackage and usme StudentUse2 file banaye and imported the classesAndobjects package in it and created the Student class's object in it and tried to set the name that was present in the Student class of the classesAndobject package,, but now since this name variable was having default as it's specifier so it won't & didn't let files from another package to use/access it, so that is the actual use case/meaning of using default access modifier).

--------------------------------------------------------------------                            

2. public access modifier :-
                           So public access modifier is used when you are ready to give access of the given variable/method to any of the files, means when we use public as the access specifier then we can access the variable/function from any file/folder/package......OVERALL PUBLIC ACCESS SPECIFIER HAS NO RESTRICTIONS

--------------------------------------------------------------------

3. private access modifier :-
                            So private access modifier is used for encapsulation, i.e. when you dont want to give access to anyone and only give access to the scope of your class so that is private modifier.....So how can we use the variables with private specifier and what's the point if we/users can't do anything with that variable... So we can allow the access using public getters and setters function where we can add if else according to our needs and let people use it, like suppose lets say that we've given a private int rollnumber fiels/variable so this wont let anyone use this field but we with the help of getters and setters can allow people to use it but people may still input invalid rollnumbers for which we had made private has now again came to the same point with 0 plus point so now in setters what we can do is we can put if condition that if rollnumber > 0 then only we'll set the value or else return it, so this is the plussss point of using getters and setters for encapsulating our data by using private access specifier...
                            
--------------------------------------------------------------------
                            