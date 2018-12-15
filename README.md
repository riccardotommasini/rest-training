# Rest Training Repository for the MiddleWare Course

This repository contains the examples used in class
as well as some relevant tutorials found on-line

In order to avoid confusion, one repository is maintained and 
branches are used to distinguishes different projects.

Master will always refer to an empty project

Students are welcome to open pull-requests and issues
to improve the material.


## Users

```bash

-- Idempotent 
curl -X POST \
  http://localhost:4567/api/users \
  -H 'Cache-Control: no-cache' \
  -d '{"fullname":"Luca Verdi","email":"luca.verdi@polimi.it","age":"64"}'

{"status":201,"message":"Resource Created with id [673f3c45]"}

-- NOT! Idempotent 

curl -X PUT \
  http://localhost:4567/api/users/mrss1 \
  -H 'Cache-Control: no-cache' \
  -d '{"fullname":"Mario Rossi","email":"mario.rossi@polimi.it","age":"42"}'

-- first
{"status":201,"message":"Resource Created with id [mrss1]"}
-- second
{"status":409,"message":"mrss1 already exists"}

curl -X DELETE \
  http://localhost:4567/api/users/mrss1

{"status":200,"message":"Removed mrsrss"}
