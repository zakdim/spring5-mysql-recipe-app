[![CircleCI](https://circleci.com/gh/zakdim/spring5-mysql-recipe-app/tree/master.svg?style=svg)](https://circleci.com/gh/zakdim/spring5-recipe-app/tree/master)

[![codecov](https://codecov.io/gh/zakdim/spring5-mysql-recipe-app/branch/master/graph/badge.svg?token=SF6BA3YVF7)](https://codecov.io/gh/zakdim/spring5-mysql-recipe-app)

# Section 7: Web Development with Spring MVC

## s07-110 InjelliJ Compiler Configuration for Spring Boot Development Tools

* `CTRL-SHIFT-A` - to bring `Actions` dialoque

1. Search for `Registry...`
2. Find key`compiler.automake.allow.when.app.running` and enable it.
3. Settings > Build, Execution, Deployment > Compiler. Enable `Build project automatically`.

## H2 Console

localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

## s10-181 Continuous Integration Testing with Circle CI

Simple change to trigger Circle CI

## Section 18 - Using MySQL with Spring Boot

### Lecture 308 - Assignement Review - Configuration of MySQL

* Create MySQL docker container `mysqldb-sfg`

```
# Use the same MySQL as in the course lecture (mysql:5)
docker pull mysql:5

docker run --name mysqldb-sfg -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql:5
docker logs -f mysqldb-sfg

# MySQL 8.0
#docker run --name mysqldb-sfg -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:8.0`
# With MySQL 8.0
# docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=password -d mysql mysqld --default-authentication-plugin=mysql_native_password 
#docker run -p 3306:3306 --name mysqldb-sfg -e MYSQL_ROOT_PASSWORD=password -d mysql:8.0 mysqld --default-authentication-plugin=mysql_native_password 
```

* Use `SequelPro` application to connect to MySQL running in docker container

Name: mysqldb-sfg
Host: 127.0.0.1
Username: root
Password:

* In `SequelPro` execute queries from `scripts/configure-mysql.sql` to initialize DBs and users

### Lecture 310 - Code Coverage Configuration for CodeCov.io

CodeCov Token: 620e364a-9767-449a-a093-a16cafb58b38

Use this token when uploading reports to this repository.
You can set it in your CI environment variables.

```
CODECOV_TOKEN='620e364a-9767-449a-a093-a16cafb58b38'
```