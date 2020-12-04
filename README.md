## Crnk Demo

Database is H2 (in-memory) with JPA, preloaded 3 movies (Data lost upon shutdown)
Check each commit for step by step details

**VSCode Error on Lombok** : install extension **Lombok Annotations Support for VS Code**



- * MileStone 1: a Normal / Manual Style of REST api via @RestController

- endpoint
GET localhost:8080/base
GET localhost:8080/base/movie

POST localhost:8080/base/add
- Body: JSON
    {
        "title": "posts",
        "year": "2201",
        "rating": "11"
    }



- * MileStone 2: implement JSON:API standard via crnk.io framework

1. pom: crnk-setup-spring-boot2 & crnk-data-jpa
2. application.properties: added crnk config
3. Movie.java: Update Entity with crnk annotation
4. MovieRepository.java: it is crnk version of Jpa Dao.

With crnk, it produce JSON:API standard response directly from Database.
- **Without writing @RestController**

Since this is JSON:API, it has some standard convension like Header and JSON in body, detailed below.
learn more by google.

- endpoint
GET localhost:8080/api/movies

POST localhost:8080/api/movies
-Header: Content-Type: application/vnd.api+json
-Body: JSON
    {
        "data": {
            "type": "movies",
            "attributes": {
            "TITLE": "Spaghetti Place",
            "YEAR": "2100",
            "RATING": 10
            }
        }
    }