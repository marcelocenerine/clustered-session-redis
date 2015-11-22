# session-repl-redis-spring

###### Work still in progress...

This Scala web application uses Spring Session to transparently leverage Redis to back a web application's HttpSession when using Spring Boot.

To run the application, firt build the Docker image by issuing"gradle build". Then "cd docker/" and run "docker-compose up -d". At this point there will be 2 Docker containers running (docker ps). Open up a browser and access the URL http://localhost:8080/session-repl/
