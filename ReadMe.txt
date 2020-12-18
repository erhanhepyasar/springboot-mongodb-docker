####################
# MongoDB
####################
# Start (Default port: 27017)
$ mongod



####################
# Dockerfile 
####################
-- MongoDB --
# Stop mongod service
$ mvn clean package
$ docker pull mongo:latest
$ docker run -d -p 27017:27018 --name mymongo-db mongo:latest
$ docker ps -a

$ cd C:\Users\200189\Documents\mydev\ew\spring-mongodb-docker
$ docker build -t springboot-mongodb:1.0 .
$ docker run -p 8080:8080 --name springboot-mongo-db --link mymongo-db:mongo -d springboot-mongodb:1.0
$ docker ps 
$ docker logs springboot-mongodb

$ docker exec -it mymongo bash
# mongo
# show dbs;
# use Person;
# show collections
# db.Person.find().pretty()


####################
# Docker-compose.yml
####################
$ docker ps
$ docker kill [id-1] [id-2]
$ docker rm [id-1] [id-2]
$ docker ps -a
C:\Users\200189\Documents\mydev\ew\spring-mongodb-docker\src\main\resources$ docker-compose up  