Galleria: A Spring Boot based rest api that has the following endpoints:


Start the application at:         http://localhost:8080


POST /user : expects a request body with {username,password,age} . Registers a new user.

GET /user : expects a request with {username} as query parameter. Returns a a user object.

POST /image : expects a request body with {filename,username} to be uploaded. Uploads the image.

GET /image : expects a query param as the {imageid} . returns the image object.

DELETE /image : expects a query param as the {imageid}. Deltes the image for this user.



---------------------------

It makes use of the imgur api to store images of each user registered in the database of rest service.


