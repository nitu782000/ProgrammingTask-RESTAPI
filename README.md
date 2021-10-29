ProgrammingTask-RESTAPI
The UK DRI Care Research and Technology Centre Programming Task

Task:
Develop a backend API Service using Spring or NodeJS (or any other framework you are comfortable with). 
It should use PostgreSQL as a data store. You need to develop all the necessary APIs to enable UI to perform all the functions listed in the description above.

Tools and Technologies Used
  Spring Boot - v2.5.6
  JDK - 15.0
  javaSE - 11
  Spring Framework - 5.3.12
  Hibernate - 5.1.2
  JPA
  Maven - 3.2+
  IDE - Eclipse 
  PostgreSQL - 14.0
  
  
-- Role: sechallenge
CREATE ROLE sechallenge WITH PASSWORD 'sechallenge';
ALTER ROLE "sechallenge" WITH LOGIN;
  
-- Database: employees

-- DROP DATABASE IF EXISTS employees;

CREATE DATABASE employees
    WITH 
    OWNER = sechallenge
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.UTF-8'
    LC_CTYPE = 'en_US.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
    
-- Table: public.employee_details

-- DROP TABLE IF EXISTS public.employee_details;

CREATE TABLE IF NOT EXISTS public.employee_details
(
    id integer NOT NULL DEFAULT nextval('task_details_task_id_seq'::regclass),
    emp_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    emp_status character varying(100) COLLATE pg_catalog."default" NOT NULL,
    "createdAt" timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    completed boolean DEFAULT false,
    CONSTRAINT task_details_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;
  
 Test REST API using POSTMAN
  
  GET http://localhost:8080/interview/task//employees
  POST http://localhost:8080/interview/task//employees
  PUT http://localhost:8080/interview/task//employees/12
  DELETE http://localhost:8080/interview/task//employees/12
  
  
