# Stream Basics

A stream operates on a data source, such as an array or a collection. A stream,
itself, never provides storage for the data. It simply moves data, possibly
filtering, sorting, or otherwise operating on that data in the process. As a
general rule, however, a stream operation by itself does not modify the data
source.

The difference between the intermediate and terminal operation is very important. A terminal operation consumes the stream. It is used to produce a result, such as
finding the minimum value in the stream, or to execute some action, as is the
case with the forEach( ) method. Once a stream has been consumed, it cannot
be reused. Intermediate operations produce another stream. Thus, intermediate
operations can be used to create a pipeline that performs a sequence of actions.

Another key aspect of streams is that some intermediate operations are
stateless and some are stateful. In a stateless operation, each element is
processed independently of the others. In a stateful operation, the processing of
an element may depend on aspects of the other elements. For example, sorting
is a stateful operation because an element’s order depends on the values of the
other elements. Thus, the sorted( ) method is stateful. However, filtering
elements based on a stateless predicate is stateless because each element is
handled individually. Thus, filter( ) can (and should be) stateless. The
difference between stateless and stateful operations is especially important
when parallel processing of a stream is desired because a stateful operation
may require more than one pass to complete.

Because Stream operates on object references, it can’t operate directly on
primitive types. To handle primitive type streams, the stream API defines the
following interfaces:

DoubleStream
IntStream
LongStream

# Real Time Queries On employeeList
1. How many male and female employees are there in the organization
2. Print the name of all the department in the organization
3. What is the average age of male and female employees
4. Get the details of highest paid employee in the organization
5. Get the name of all the  employees who have joined after 2015
6. Count the number of employees in each department
7. What is the average salary of each department
8. Get the details of youngest male employee in the product development department
9. Who has the most working experience in the organization
10. How many male and female employees are there in the sales and marketing team
11. What is the average salary of male and female employees
12. List down the names of all the employees in each department
13. What is the average salary and total salary of the whole organization
14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
15. Who is the oldest employee in the organization? What is his age and which department he belongs to


### I have referred below blog for this Exercise 
https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/#google_vignette