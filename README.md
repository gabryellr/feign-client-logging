# feign-client-logging

## Project Objective
Project to see what is sending and receiving through of the Feign Client

## How to test

 - Clone this project
 - Run it with your IDE with DEBUG Mode
 - Make a PUT to `localhost:8080/api/v1/client/user/1` with example body
 ````
{
	"id":1,
	"name":"Joseph",
	"address":"9008 South Summit Lane"
}
````

In your debug console you'll see what is receiving and sending through Feign Client as example below:

    2020-11-30 13:10:17.637 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] ---> PUT http://localhost:8080/api/v1/user/1 HTTP/1.1
    2020-11-30 13:10:17.637 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] Content-Length: 59
    2020-11-30 13:10:17.637 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] Content-Type: application/json
    2020-11-30 13:10:17.637 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] 
    2020-11-30 13:10:17.637 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] {"id":1,"name":"Joseph","address":"9008 South Summit Lane"}
    2020-11-30 13:10:17.637 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] ---> END HTTP (59-byte body)
    2020-11-30 13:10:17.661 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] <--- HTTP/1.1 200 (22ms)
    2020-11-30 13:10:17.662 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] connection: keep-alive
    2020-11-30 13:10:17.662 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] content-type: application/json
    2020-11-30 13:10:17.662 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] date: Mon, 30 Nov 2020 16:10:17 GMT
    2020-11-30 13:10:17.662 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] keep-alive: timeout=60
    2020-11-30 13:10:17.662 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] transfer-encoding: chunked
    2020-11-30 13:10:17.662 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] 
    2020-11-30 13:10:17.663 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] {"id":1,"name":"Joseph","address":"9008 South Summit Lane","randomId":1483160472}
    2020-11-30 13:10:17.663 DEBUG 12244 --- [nio-8080-exec-2] c.g.f.api.feign.UserClient               : [UserClient#updateUser] <--- END HTTP (81-byte body)
