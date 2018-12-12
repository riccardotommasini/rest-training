# Rest Training Repository for the MiddleWare Course

This repository contains the examples used in class
as well as some relevant tutorials found on-line

In order to avoid confusion, one repository is maintained and 
branches are used to distinguishes different projects.

Master will always refer to an empty project

Students are welcome to open pull-requests and issues
to improve the material.


## Restbucks



This project describes the example presented in class.

A barista interacts with customers (Clients) taking order includig items and accepting payments for the order.


## Homeworks

- manage the items and allow mentioning only existing ones (Items have name and price)
- include the cassier to manage the payments, calculate the order price based on the items
- use hyptermedia to link different resources

## Curl Commands
```bash

-- Idempotent 
curl -X POST \
  http://localhost:4567/api/orders \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{ "items": [ 
    {"name":"coffe", "description":"black"},
    {"name":"snack", "description":"granola"}]
}'
{
    "status": 201,
    "message": "Order Created with id [86f1d9f3]"
}
-- Changing the order -   NOT! Idempotent 

curl -X PUT \
  http://localhost:4567/api/orders/86f1d9f3 \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{ "items": [ 
    {"name":"coffe", "description":"black"},
    {"name":"snack", "description":"granola"},
    {"name":"drink", "description":"frappuccino"}]
}'

-- Paying

curl -X POST \
  http://localhost:4567/api/payments/86f1d9f3 \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '    {"currency":"EUR", "ammount":10.0}'

{
    "status": 201,
    "message": "Payment received for order id [69514c18]"
}
-- Deleting

curl -X DELETE \
  http://localhost:4567/api/users/mrss1

{"status":200,"message":"Removed mrsrss"}
