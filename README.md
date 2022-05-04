# Final Project

This is the final project for my CIS-171 Java course at Kirkwood Community College. Below is a journal of all the things I learned throughout the class.

## Introduction

In the first week of class I learned that Java functions pretty similarly to Python but uses different syntax. So far we have learned some of the basic fundamentals of Java and how they differ from Python, the previous language I learned. Things such as `Print('Hello World')` are a bit different in Java `System.out.println('Hello World')`. Its a little more typing but nothing dramatially different. Th biggest difference I've noticed so far is user input. It no longer gets controlled by the input command rather it uses the Scanner function in Java. From what I've seen so far the scanner function is imported and then a new scanner is set as a variable because it is faster and easier to use it that way. But you also can't have output text in the same line of code as the input scanner. You must ouput the question and set the scanner to pick up input on seperate lines. So far I feel that Java is a more complicated language than python but I also feel it isnt terribly hard to understand. 

## Chapter 1

We started the week by talking about if statements and comparing them to how it is written in python. There isn't a very bit difference between the two but Java need parenthases around the conditional statement and anything you want ran under the condition must be inside the curly brackets. We also learned that Java does not function with decalared variables that have no value to them. To assign multiple variables on one line they must be delcared and assigned at the same time. If statement operators in Java are the same as they are in python. Strings and boxes should be compared using `equals()` instead of `a == a`. `equals()` is used to see if objects are equal.`System.pit.println(name1.equals(name2))` is an example. Class data types typically start with a captial letter while non-class data types start with a lower case letter. For loops in java require a varible to be initialized, a boolean expression that must be true atleast once and eventually be false, and an iteration `for(int i = 0; 1 < 10; i++)`. Depending on where the i is comapred to the ++ it will either mean run the line then add one, or add one then run the line `i++ ++i`. Also we started learning about a few different ways to format numers, such as `System.out.printf("%d Gallons is %.4f Liters%n", gallons, liters);`

## Chapter 2

In chapter 2 I started off by learning about primitive (non class based) data types. Things booleans, ints. doubles. Booleans are the smallest data type in Java because it only has 2 possible values. You can not assign a larger value than a data type can hold. When assigning longs sometime you need to use a L at the end of the value to not get an error. Java requires double quotes around strings and single quotes around characters. I learned that the Character data type can only hold a single charcter in it. You could also assign a number to the character datatype and it will be equivalent to the character in the Unicode values. Only use + - * and / when dealing with primitive datatypes. We got an introduction to using Math library for more complicated calculations in our code. Using things like `Math.floor()` will round numbers down, and `Math.ceil()` will round numbers up and return as a double. We also breifly touched on nested for loops in Java. We also covered escape characters during this chapter. Classes like BigDecimal use methods to calculate things rather than using simple operators. WE also learned about variable scopes. Things like a variable being declared inside of an if statement it will be a local scope. But for something outside the loop to use it, it would have to be declared outside of the loop. More often variables should be assigned outside of the loops so they aren't constantly being recreated and wasting resources. We also learned that logical operators are only used on non-class values, similar to arithmatic operators. When checking if 2 objects (class datatypes) are equal do not use ==, use the .equals() method.

## Chapter 3

This chapter we covered control statements. Things like ifs and switches. the syntax for an if statement in java is very similar to other languages like python and c#. In the if statement if you want to check for equality of strings you can not use the equals sign. You must use the String class `equals()` method. We also covered nested if statements, which was similar to python. Not much new information there besides a different language to write it in. For else if ladders in Java the syntax is slighty different than that of python but otherwise very similar. We also touched on dates in Java and how there is a LocalDate class in Java. To create a LocalDate object you have to use one of its static methods. We have been using `.now()` the most.

## Chapter 4

In chapter 4 we started talking about classes, objects, and methods. Java is pretty similar to C# in many ways when it comes to classes and objects. The one thing that confused me previously was constructor methods. I wasn't sure what they were or how to use them. Constructors are used to initialize class attributes. which can then be instantiated to create an object by calling the constructor method. constructors will always have a void return type but doesn't need specified. Another thing that confused me at first was reference variables. When one object-type variable gets assigned to another it creates a reference so when one of the two variables get changed it will effect both of the referenced variables. They are both assigned to the same value.

## Chapter 5

In chapter 5 I was introduced to Arrays and string operators. I learned that an array is fixed length and you can not add more items into an array. Only one type of data may be stored in an array. There are multiple way to assign an array but the simplest way is to just use `int[] list = {1,2,3,4,5}`. Or you can assign how many values there can be and not actually assign anything to the positions `int[] list = new int[10]`. We covered a few different things you can do with an array such as sorting, finding min and max values, and finding mean, median, and mode. We also covered how to copy arrays to a new array using loops to grab the values from the first and setting them to the second. Finally in this chapter we covered some string operators you can use. one interesting thing we covered was how you can use `charAt()` to search for a char at a certain position in a string almost like the string itself is an array. A few more operators we covered are things like `equals()` and `length()`.

## Final Project User Stories

- As a car enthusiast I want to be able to add cars to my garage so that I can see my collection of cars. X

- As a car enthusiast I want to be able to sort my cars by brand name so I can group my cars by brand. 

- As a car enthusiast I want to be able to sort my car by year so I can see my newest cars.

- As a car enthusiast I want to be able to only look at my trucks so when I need to tow something I can.

- As a car enthusiast I want to be able to remove cars from my garage when I sell one of my cars.

- As a car enthusiast I want ot me able to swap car positions so I can see them the way I want to.

- As a car enthusiast I want to be able to see all the information about a single car so I can see the statistics

## Class Diagram

| + vehicle|
:---------
| - make : String <br> - model : String <br> - year : String <br> - color : String <br> - bodyStyle : String|
| <<create>> + vehicle()<br>
| <<create>> + vehicle(make : String, model : String, year : String)<br>
| + getMake() : String <br>
| + setMake(make : String) : void <br>
| - validateMake(make : String) : void <br>
| + getModel() : String <br>
| + setModel(model : String) : void <br>
| - validateModel(model : String) : void <br>
| + getYear() : String <br>
| + setYear(Year : String) : void<br>
| - validateYear(year : String) : void <br>
| + toString() : String|