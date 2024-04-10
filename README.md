# Countries-and-Capitals---Hashmap
Practice program: Countries And Capitals - HashMap

Remembering the names of the countries and their capitals can be very challenging. But children are generally fond of this particular

challenge.

Help the children to implement the above task.

Implement the above scenario using a HashMap.

Component Specification: Country

Type(Class) Attributes Methods Responsibilities

Country Map<String,String> countryMap Include the getter and setter method.

Note: The class and methods should be declared as public and all the attributes should be declared as private.

Requirement 1: Add a country and its capital to the HashMap.

As per this requirement, the system should be able to add a country and its capital to the HashMap.

Component Name Type(Class) Methods Responsibilities

Add a country and its capital to the

HashMap. Country

public void add(String cname,

String capname)

This method should add a country and its capital

to the HashMap.

Requirement 2: Search the capital of a given country.

As per this requirement, the system should be able to search the capital of a country from the HashMap.

Component Name Type(Class) Methods Responsibilities

Search the capital of a given

country.

Country

public String search(String

cname)

This method is used to search the capital of a country from

the HashMap.

In the UserInterface class,

1. Create a main method with the menu as described in the sample Input and Output.

2. When the user selects option 1.Add, add a country and its capital into HashMap countryMap.

3. When the user selects option 2.Search, it should display the capital of a given country. If the map is empty, it should display "The

map is empty". If the country is not available in the HashMap, it should display "Data not found".

4. When the user selects option 3.Exit, display the message "Thank you for using the application" and terminate the program.

5. Option can take only values 1 to 3.

Note:

Country name is case insensitive.

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text

represents the output.

Ensure to follow the object-oriented specifications provided in the question.

Ensure to provide the names for classes, attributes, and methods as specified in the question.

Adhere to the code template, if provided.

Please don't use System.exit(0) to terminate the program.

Sample Input / Output 1:

1.Add

2.Search

3.Exit

Enter your choice

1

Enter the country name

Italy

Enter the capital name

Rome

1.Add

2.Search

3.Exit

Enter your choice

1

Enter the country name

New Zealand

Enter the capital name

Wellington

1.Add

2.Search

3.Exit

Enter your choice

1

Enter the country name

Russia

Enter the capital name

Moscow

1.Add

2.Search

3.Exit

Enter your choice

2

Data not found

1.Add

2.Search

3.Exit

Enter your choice

3

Thank you for using the application

Sample Input / Output 3:

1.Add

2.Search

3.Exit

Enter your choice

2

The map is empty

1.Add

2.Search

3.Exit

Enter your choice

3

Thank you for using the application

Sample Input / Output 4:

1.Add

2.Search

3.Exit

Enter your choice

3

Thank you for using the application 
