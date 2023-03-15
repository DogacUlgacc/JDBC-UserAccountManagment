# JDBC-UserAccountManagment
This project is designed to manage user accounts by connecting to a database using Java.


The class has a private instance of the "Connect" class, which manages database connectivity. The class has four public methods:

"insert" method: This method takes three parameters (id, ad, soyad) and inserts a new record into a database table named "musteri" using a Statement object.
This method is vulnerable to SQL injection attacks.

"insert2" method: This method takes three parameters (id, ad, soyad) and inserts a new record into a database table named "musteri" using a PreparedStatement object.
This method is more secure than the "insert" method because it uses parameterized queries.

"delete" method: This method takes an id parameter and deletes a record from the "musteri" table based on the id using a PreparedStatement object.
This method is more secure than the "delete2" method.

"delete2" method: This method takes an id parameter and deletes a record from the "musteri" table based on the id using a Statement object.
This method is vulnerable to SQL injection attacks.

"list" method: This method retrieves all records from the "musteri" table and prints them to the console. 
It uses a Statement object to execute the query and a ResultSet object to iterate over the results.
