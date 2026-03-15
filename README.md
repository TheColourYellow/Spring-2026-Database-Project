# Database Project  
REST API for managers for a middle sized electronics store database.  
Made with Spring Web and Spring Data JPA libraries.  
## Database Properties  
### Index  
The database has two indices.  
One for queries about orders based on their status.  
Second for queries about products based on their current stock.  
### View  
The database has one view created from supplier, product and the contact of information of supplier to provide easily parsible table for products based on their supplier. 
### Temporal Properties  
The database has a manually implemented temporal table for transaction time for recording the time when a record from the orders table has been deleted.  
### Events  
The database will delete automatically every 24 hours orders that are marked as cancelled.
### Trigger  
The database has a trigger to automatically record all instances of record deletion from the orders table to the temporal table.  
### Users and Roles  
The database has one created user with privileges to create, read, update and delete from all database tables.  
This user is used by the application for the connection to the database.  
## API Endpoints  
### GET  
#### Account  
localhost:8090/account/all - Returns all users recorded in the database.  
#### Order
localhost:8090/order/all - Returns all orders recorded in the database.  
localhost:8090/order/{status} - Returns all orders with status either: CANCELLED, NEW or SHIPPED.  
localhost:8090/order/customer/{id} - Returns all orders made by a customer identified by their ID.  
localhost:8090/order/product/{id} - Returns all orders with the specified item identified by its ID.  
#### Product  
localhost:8090/product/all - Returns all products recorded in the database.  
localhost:8090/product/stockatmost/{quantity} - Returns all products which stock is at or below the specified amount.  
localhost:8090/product/order/{id} - Get all products included in a user order identified by the order ID.  
localhost:8090/product/supplier/{id} - Returns all products provided by the spcified supplier identified by the ID of the supplier.  
localhost:8090/product/{id} - Returns all suppliers which supply the specified product identified by the product ID.  
### POST  
#### Product  
localhost:8090/product/new - Adds a new product to the database products table. Data is sent in JSON format of the products entity without the ID.  
