Hi 

This is a simple CORBA exmaple ( nothing fancy ) . The general requirements are : 

*) Create a client app that generates a random matrices and sends it to the server
*) Create a server that receives 2 matrices and multiply them  ( sends the result to both clients )

In order to run the app you will need to follow a painful set up instructions: 

    # ./startServer.sh

Yea thats all ( from the server side ) 

Now in other two systems: 

    # ./runClient.sh <client id> <matrix size> localhost 1050

client id : 1 or 2 ( in the print screen is just with 2 clients 
matrix size : 1 to 1024

Well this is our nice and simple example 

Enjoy 

AUTHORS:
  - Victor Rodriguez
  - Obed N Munoz
