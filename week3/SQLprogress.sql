--2.1 SELECT
--Task – Select all records from the Employee table.
SELECT * FROM EMPLOYEE;
--Task – Select all records from the Employee table where last name is King.
SELECT * FROM EMPLOYEE WHERE LASTNAME = 'King';
--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM EMPLOYEE WHERE FIRSTNAME = 'Andrew' AND REPORTSTO IS null;
--2.2 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM ALBUM ORDER BY TITLE DESC;
--Task – Select first name from Customer and sort result set in ascending order by city
SELECT FIRSTNAME FROM CUSTOMER ORDER BY FIRSTNAME ASC;
--2.3 INSERT INTO
--Task – Insert two new records into Genre table 

INSERT INTO GENRE(GENREID,NAME) VALUES(26, 'Alphonse music');
INSERT INTO GENRE(GENREID,NAME) VALUES(27, 'NOT Alphonse music');
SELECT * FROM GENRE;

--Task – Insert two new records into Employee table
INSERT INTO EMPLOYEE(employeeid,lastname, firstname, title, reportsto, birthdate, hiredate, address, city, state, country, postalcode, PHONE, FAX, EMAIL)
VALUES(9, 'Wilson', 'Alphonse', 'regular guy', 5, '02-JAN-97', '04-JUL-19', '111 NORTH AVE DRIVE', 'TAMPA', 'FL', 'US', 'T5K 1Y7', '+1 (262) 111-2233', '+1 (262) 111-2233','alphonse@gmail.edu');
INSERT INTO EMPLOYEE(employeeid,lastname, firstname, title, reportsto, birthdate, hiredate, address, city, state, country, postalcode, PHONE, FAX, EMAIL)
VALUES(10, 'Wilson', 'philip', 'regular guy', 5, '02-feb-97', '04-JUL-19', '111 NORTH AVE DRIVE', 'TAMPA', 'FL', 'US', 'T5K 1Y7', '+1 (262) 111-2233', '+1 (262) 111-2234','philip@gmail.edu');

SELECT * FROM EMPLOYEE; 
--Task – Insert two new records into Customer table


INSERT INTO CUSTOMER(customerid, firstname, lastname, EMAIL)
VALUES(60, 'Alphonse', 'Wilson', 'alphonse@gmail.edu');
INSERT INTO CUSTOMER(customerid, firstname, lastname, EMAIL)
VALUES(61, 'Phililp', 'Wilson', 'philip@gmail.edu');
SELECT * FROM CUSTOMER;


--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
UPDATE CUSTOMER SET firstname = 'Robert', lastname = 'Walter' 
WHERE firstname = 'Aaron' AND lastname = 'Mitchell';
SELECT * FROM CUSTOMER ORDER BY FIRSTNAME ASC;
--Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”	

UPDATE CUSTOMER SET NAME = 'CCR'
WHERE NAME LIKE 'Creedence Clearwater Revival';
SELECT * FROM ARTIST WHERE artistid = 76;----------------------------------------------------------------------------------------

--2.5 LIKE
--Task – Select all invoices with a billing address like “T%” 
SELECT * FROM invoice WHERE billingaddress LIKE 'T%';
--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50
SELECT * FROM invoice WHERE TOTAL  BETWEEN 15 AND 50;
--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
DELETE FROM CUSTOMER WHERE firstname LIKE 'Robert' AND lastname LIKE 'Walter';--------------------------------------------------
SELECT * FROM CUSTOMER WHERE firstname = 'Robert';


--SQL Functions
--In this section you will be using the Oracle system functions, as well as your own functions, to perform various actions against the database
--3.1 System Defined Functions
--Task – Create a function that returns the current time.
SELECT CURRENT_TIMESTAMP
FROM dual;
--Task – create a function that returns the length of name in MEDIATYPE table
--3.2 System Defined Aggregate Functions
--Task – Create a function that returns the average total of all invoices
SELECT AVG(TOTAL) 
FROM INVOICE;
--Task – Create a function that returns the most expensive track
SELECT MAX(UNITPRICE)
FROM TRACK;
--3.3 User Defined Scalar Functions
--Task – Create a function that returns the average price of invoice line items in the invoiceline table

--3.4 User Defined Table Valued Functions
--Task – Create a function that returns all employees who are born after 1968.

--4.0 Stored Procedures
--In this section you will be creating and executing stored procedures. You will be creating various types of stored procedures that take input and output parameters.
--4.1 Basic Stored Procedure
--Task – Create a stored procedure that selects the first and last names of all the employees.
--4.2 Stored Procedure Input Parameters
--Task – Create a stored procedure that updates the personal information of an employee.
--Task – Create a stored procedure that returns the managers of an employee.
--4.3 Stored Procedure Output Parameters
--Task – Create a stored procedure that returns the name and company of a customer.

--5.0 Transactions
--In this section you will be working with transactions. Transactions are usually nested within a stored procedure.
--Task – Create a transaction that given a invoiceId will delete that invoice (There may be constraints that rely on this, find out how to resolve them).
 

--6.0 Triggers
--In this section you will create various kinds of triggers that work when certain DML statements are executed on a table.
--6.1 AFTER/FOR
--Task - Create an after insert trigger on the employee table fired after a new record is inserted into the table.
--Task – Create an after update trigger on the album table that fires after a row is inserted in the table
--Task – Create an after delete trigger on the customer table that fires after a row is deleted from the table.

--7.0 JOINS
--In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.

--7.1 INNER
--Task – Create an inner join that joins
--customers and orders and specifies the 
--name of the customer and the invoiceId.

SELECT CUSTOMER.CUSTOMERID, FIRSTNAME, LASTNAME, INVOICEID, TOTAL
FROM CUSTOMER
LEFT OUTER JOIN INVOICE
ON INVOICE.CUSTOMERID = CUSTOMER.CUSTOMERID;
--7.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.


SELECT CUSTOMER.CUSTOMERID, FIRSTNAME, LASTNAME, INVOICEID, TOTAL
FROM CUSTOMER
LEFT OUTER JOIN INVOICE
ON INVOICE.CUSTOMERID = CUSTOMER.CUSTOMERID;
--7.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.
SELECT NAME, TITLE
FROM ARTIST 
RIGHT OUTER JOIN ALBUM
ON ALBUM.ARTISTID = ARTIST.ARTISTID;
--7.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
SELECT NAME
FROM ARTIST
CROSS JOIN ALBUM
ORDER BY NAME ASC;
--7.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.
SELECT *--A.EMPLOYEEID, B.EMPLOYEEID, A.LASTNAME, B.LASTNAME, A.TITLE, B.TITLE
FROM EMPLOYEE A
INNER JOIN EMPLOYEE B
ON B.EMPLOYEEID = A.REPORTSTO;
commit;
exit;