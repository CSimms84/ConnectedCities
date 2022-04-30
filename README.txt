This is a solution to a take-home software engineering challenge from an ad-tech firm in NYC.

Requirements:
1. Write a Java program which takes three arguments:
** first city name
** second city name
** third a path to a text file containing comma-separated pairs of connected cities, one pair
per line (a pair represents a bi-directional connection: pair "A,B" implies city A is connected
to city B, and city B is connected to city A.)

If the cities specified by the first 2 arguments are connected then the program prints 
CONNECTED. Otherwise, it prints NOT CONNECTED. 

2. Write unit tests where appropriate. 

Notes
** Choose data structures carefully. Consider introducing your own, if appropriate.
** Your program will be tested using the attached connected .txt

Example
** If the input file is:
       New York, Chicago
       Denver, Kansas City
       Chicago, Los Angeles
       Kansas City, Nashville

then the program will generate the following output:
>> java ConnectedCities "New York" "Los Angeles" connected.txt
CONNECTED
>> java ConnectedCities "Los Angeles" "New York" connected.txt
CONNECTED
>> java ConnectedCities "Los Angeles" Nashville connected.txt
NOT CONNECTED

