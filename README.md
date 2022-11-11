Galleria: A Spring Boot based rest api that has the following endpoints:


Start the application at:         http://localhost:8080


POST /user : expects a request body with username,password,age. Registers a new user.

GET /user : expects a request with username as query parameter. Returns a a user object.

POST /image : expects a request body with filename of the image to be uploaded. Uploads the image.

GET /image : expects a query param as the image id . returns the image object.


