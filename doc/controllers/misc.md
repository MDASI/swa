# Misc

```java
MiscController miscController = client.getMiscController();
```

## Class Name

`MiscController`

## Methods

* [Http Localhost 5000 Api Users Register](../../doc/controllers/misc.md#http-localhost-5000-api-users-register)
* [Http Localhost 5000 Api Users Login](../../doc/controllers/misc.md#http-localhost-5000-api-users-login)
* [Http Localhost 5000 Api Users Getallusers](../../doc/controllers/misc.md#http-localhost-5000-api-users-getallusers)
* [Http Localhost 5000 Api Users Deleteuser](../../doc/controllers/misc.md#http-localhost-5000-api-users-deleteuser)
* [Http Localhost 5000 Api Rooms Getallrooms](../../doc/controllers/misc.md#http-localhost-5000-api-rooms-getallrooms)
* [Http Localhost 5000 Api Adminb Adminlogin](../../doc/controllers/misc.md#http-localhost-5000-api-adminb-adminlogin)
* [Http Localhost 5000 Api Rooms Addroom](../../doc/controllers/misc.md#http-localhost-5000-api-rooms-addroom)
* [Http Localhost 5000 Api Bookings Bookroom](../../doc/controllers/misc.md#http-localhost-5000-api-bookings-bookroom)
* [Http Localhost 5000 Api Rooms Getroombyid](../../doc/controllers/misc.md#http-localhost-5000-api-rooms-getroombyid)
* [Http Localhost 5000 Api Bookings Cancelbooking](../../doc/controllers/misc.md#http-localhost-5000-api-bookings-cancelbooking)
* [Http Localhost 5000 Api Bookings Getuserbookings](../../doc/controllers/misc.md#http-localhost-5000-api-bookings-getuserbookings)
* [Http Localhost 5000 Api Bookings Getallbookings](../../doc/controllers/misc.md#http-localhost-5000-api-bookings-getallbookings)
* [Http Localhost 5000 Api Rooms Deleteroom](../../doc/controllers/misc.md#http-localhost-5000-api-rooms-deleteroom)


# Http Localhost 5000 Api Users Register

http://localhost:5000/api/users/register

```java
CompletableFuture<String> httpLocalhost5000ApiUsersRegisterAsync(
    final HttpLocalhost5000ApiUsersRegisterrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiUsersRegisterrequest`](../../doc/models/http-localhost-5000-api-users-registerrequest.md) | Body, Required | - |

## Response Type

`String`

## Example Usage

```java
HttpLocalhost5000ApiUsersRegisterrequest body = new HttpLocalhost5000ApiUsersRegisterrequest();
body.setName("asif");
body.setEmail("mdasifali82@gmail.com");
body.setPassword("12345678");

miscController.httpLocalhost5000ApiUsersRegisterAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"User Registered successfully"
```


# Http Localhost 5000 Api Users Login

http://localhost:5000/api/users/login

```java
CompletableFuture<HttpLocalhost5000ApiUsersLogin> httpLocalhost5000ApiUsersLoginAsync(
    final HttpLocalhost5000ApiUsersLoginrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiUsersLoginrequest`](../../doc/models/http-localhost-5000-api-users-loginrequest.md) | Body, Required | - |

## Response Type

[`HttpLocalhost5000ApiUsersLogin`](../../doc/models/http-localhost-5000-api-users-login.md)

## Example Usage

```java
HttpLocalhost5000ApiUsersLoginrequest body = new HttpLocalhost5000ApiUsersLoginrequest();
body.setEmail("ao@gmail.com");
body.setPassword("aK788955");

miscController.httpLocalhost5000ApiUsersLoginAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "asif",
  "email": "ao@gmail.com",
  "isAdmin": false,
  "_id": "629891db96996a2050b63c2d"
}
```


# Http Localhost 5000 Api Users Getallusers

http://localhost:5000/api/users/getallusers

```java
CompletableFuture<List<HttpLocalhost5000ApiUsersGetalluser>> httpLocalhost5000ApiUsersGetallusersAsync()
```

## Response Type

[`List<HttpLocalhost5000ApiUsersGetalluser>`](../../doc/models/http-localhost-5000-api-users-getalluser.md)

## Example Usage

```java
miscController.httpLocalhost5000ApiUsersGetallusersAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "_id": "6295ef8a40a1ed0f1a27a89c",
    "name": "asif",
    "email": "a@gmail.com",
    "password": "k",
    "isAdmin": false,
    "createdAt": "2022-05-31T10:35:54.640Z",
    "updatedAt": "2022-05-31T10:35:54.640Z",
    "__v": 0
  },
  {
    "_id": "6295f5420ee1b25ffc9ab6a6",
    "name": "asif",
    "email": "a@gmail.com",
    "password": "a",
    "isAdmin": false,
    "createdAt": "2022-05-31T11:00:18.485Z",
    "updatedAt": "2022-05-31T11:00:18.485Z",
    "__v": 0
  },
  {
    "_id": "62988bf929c6ed63d3afb9f2",
    "name": "asif",
    "email": "a@gmail.com",
    "password": "aK788955",
    "isAdmin": false,
    "createdAt": "2022-06-02T10:07:53.566Z",
    "updatedAt": "2022-06-02T10:07:53.566Z",
    "__v": 0
  },
  {
    "_id": "6298919296996a2050b63c25",
    "name": "asif",
    "email": "ah@gmail.com",
    "password": "aK788955",
    "isAdmin": false,
    "createdAt": "2022-06-02T10:31:49.928Z",
    "updatedAt": "2022-06-02T10:31:49.928Z",
    "__v": 0
  },
  {
    "_id": "629891db96996a2050b63c2d",
    "name": "asif",
    "email": "ao@gmail.com",
    "password": "aK788955",
    "isAdmin": false,
    "createdAt": "2022-06-02T10:32:59.477Z",
    "updatedAt": "2022-06-02T10:32:59.477Z",
    "__v": 0
  },
  {
    "_id": "629895e90542c6471e01ca3a",
    "name": "asif",
    "email": "ap@gmail.com",
    "password": "aK788955",
    "isAdmin": false,
    "createdAt": "2022-06-02T10:50:17.552Z",
    "updatedAt": "2022-06-02T10:50:17.552Z",
    "__v": 0
  },
  {
    "_id": "6299155509eddc6643da6aef",
    "name": "asif",
    "email": "asif@gmail.com",
    "password": "aK788955",
    "isAdmin": false,
    "createdAt": "2022-06-02T19:53:57.977Z",
    "updatedAt": "2022-06-02T19:53:57.977Z",
    "__v": 0
  },
  {
    "_id": "629a2f624c4d623012c5028e",
    "name": "gg",
    "email": "ayy@gmail.com",
    "password": "12345678y",
    "isAdmin": false,
    "createdAt": "2022-06-03T15:57:22.878Z",
    "updatedAt": "2022-06-03T15:57:22.878Z",
    "__v": 0
  },
  {
    "_id": "629a3df86d7bcef9f1df8b06",
    "name": "xoxo",
    "email": "xoxo@gmail.com",
    "password": "Qwertyui",
    "isAdmin": false,
    "createdAt": "2022-06-03T16:59:37.136Z",
    "updatedAt": "2022-06-03T16:59:37.136Z",
    "__v": 0
  },
  {
    "_id": "629a54e0efd010ace526649c",
    "name": "asifali",
    "email": "asifali@gmail.com",
    "password": "123456789",
    "isAdmin": false,
    "createdAt": "2022-06-03T18:37:21.005Z",
    "updatedAt": "2022-06-03T18:37:21.005Z",
    "__v": 0
  },
  {
    "_id": "629a556aefd010ace52664a1",
    "name": "asifali",
    "email": "mdasifali@gmail.com",
    "password": "123456789",
    "isAdmin": false,
    "createdAt": "2022-06-03T18:39:39.087Z",
    "updatedAt": "2022-06-03T18:39:39.087Z",
    "__v": 0
  },
  {
    "_id": "629a5774efd010ace52664a8",
    "isAdmin": false,
    "createdAt": "2022-06-03T18:48:20.306Z",
    "updatedAt": "2022-06-03T18:48:20.306Z",
    "__v": 0
  }
]
```


# Http Localhost 5000 Api Users Deleteuser

http://localhost:5000/api/users/deleteuser

```java
CompletableFuture<String> httpLocalhost5000ApiUsersDeleteuserAsync(
    final HttpLocalhost5000ApiUsersDeleteuserrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiUsersDeleteuserrequest`](../../doc/models/http-localhost-5000-api-users-deleteuserrequest.md) | Body, Required | - |

## Response Type

`String`

## Example Usage

```java
HttpLocalhost5000ApiUsersDeleteuserrequest body = new HttpLocalhost5000ApiUsersDeleteuserrequest();
body.setId("629a5774efd010ace52664a8");

miscController.httpLocalhost5000ApiUsersDeleteuserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"User Deleted Successfully"
```


# Http Localhost 5000 Api Rooms Getallrooms

http://localhost:5000/api/rooms/getallrooms

```java
CompletableFuture<List<HttpLocalhost5000ApiRoomsGetallroom>> httpLocalhost5000ApiRoomsGetallroomsAsync()
```

## Response Type

[`List<HttpLocalhost5000ApiRoomsGetallroom>`](../../doc/models/http-localhost-5000-api-rooms-getallroom.md)

## Example Usage

```java
miscController.httpLocalhost5000ApiRoomsGetallroomsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "_id": "6291d1c869b29ea938f4ea89",
    "name": "5 star delux room",
    "description": "Couples are welcome Guests can check in using any local or outstation ID proof (PAN card not accepted). Only Indian Nationals allowed As a complimentary benefit, your stay is now insured by Acko. This hotel is serviced as per quality standards of OYO",
    "currentbookings": [
      {
        "bookingid": "6293b787092152a78e4a2977",
        "fromdate": "29-05-2022",
        "todate": "30-05-2022",
        "userid": "6280aacadb06af79280c9eec",
        "status": "booked"
      },
      {
        "bookingid": "629892ccb0984723c983f3f6",
        "fromdate": "02-06-2022",
        "todate": "03-06-2022",
        "userid": "629891db96996a2050b63c2d",
        "status": "booked"
      },
      {
        "bookingid": "62998242d482d9212f0aa5c0",
        "fromdate": "03-06-2022",
        "todate": "04-06-2022",
        "userid": "629891db96996a2050b63c2d",
        "status": "booked"
      }
    ],
    "imageurls": [
      "https://images.oyoroomscdn.com/uploads/hotel_image/89615/2bbe6b0a9666175c.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/61649/large/8698ecb3fd53d1f0.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/56303/medium/91dead74a5dffa61.jpg"
    ],
    "maxcount": 3,
    "phonenumber": 7759817248,
    "rentperday": 1000,
    "type": "Delux",
    "__v": 5
  },
  {
    "_id": "6291d2bc69b29ea938f4ea8f",
    "name": "delux 4 star room",
    "description": "Couples are welcome Guests can check in using any local or outstation ID proof (PAN card not accepted). Only Indian Nationals allowed As a complimentary benefit, your stay is now insured by Acko. This hotel is serviced as per quality standards of OYO",
    "currentbookings": [
      {
        "bookingid": "6294ab8351f887ff2460945d",
        "fromdate": "30-05-2022",
        "todate": "31-05-2022",
        "userid": "6280aacadb06af79280c9eec",
        "status": "booked"
      }
    ],
    "imageurls": [
      "https://images.oyoroomscdn.com/uploads/hotel_image/61649/large/8698ecb3fd53d1f0.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/111796/large/d55361043c9b52af.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/111796/large/2f7029d3c5429b5f.jpg"
    ],
    "maxcount": 2,
    "phonenumber": 7759817248,
    "rentperday": 700,
    "type": "Delux",
    "__v": 1
  },
  {
    "_id": "6291d35269b29ea938f4ea92",
    "name": "NON-DELUX AC",
    "description": "Couples are welcome Guests can check in using any local or outstation ID proof (PAN card not accepted). Only Indian Nationals allowed As a complimentary benefit, your stay is now insured by Acko. This hotel is serviced as per quality standards of OYO",
    "currentbookings": [
      {
        "bookingid": "6294cb5486cf13ffd3fc8158",
        "fromdate": "30-05-2022",
        "todate": "31-05-2022",
        "userid": "6280aacadb06af79280c9eec",
        "status": "booked"
      },
      {
        "bookingid": "62957ae6e5a3e3a5f1a96801",
        "fromdate": "30-05-2022",
        "todate": "31-05-2022",
        "userid": "6280aacadb06af79280c9eec",
        "status": "booked"
      }
    ],
    "imageurls": [
      "https://images.oyoroomscdn.com/uploads/hotel_image/38668/large/414e401312ad45a7.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/38668/large/d24b920cfdddeecb.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/38668/large/58025558878fa4ec.jpg"
    ],
    "maxcount": 2,
    "phonenumber": 7759817248,
    "rentperday": 500,
    "type": "Non-Delux",
    "__v": 2
  },
  {
    "_id": "6291d3cf69b29ea938f4ea95",
    "name": "5 star delux room",
    "description": "Couples are welcome Guests can check in using any local or outstation ID proof (PAN card not accepted). Only Indian Nationals allowed As a complimentary benefit, your stay is now insured by Acko. This hotel is serviced as per quality standards of OYO",
    "currentbookings": [
      {
        "bookingid": "62957c70d8b9d8a6397dfa01",
        "fromdate": "30-05-2022",
        "todate": "31-05-2022",
        "userid": "6280aacadb06af79280c9eec",
        "status": "booked"
      }
    ],
    "imageurls": [
      "https://images.oyoroomscdn.com/uploads/hotel_image/111796/large/e225bbf160a11c02.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/111796/large/d55361043c9b52af.jpg",
      "https://images.oyoroomscdn.com/uploads/hotel_image/111796/large/2f7029d3c5429b5f.jpg"
    ],
    "maxcount": 3,
    "phonenumber": 7759817248,
    "rentperday": 900,
    "type": "Non-Delux",
    "__v": 1
  },
  {
    "_id": "6298485775d7e7a07fa12a88",
    "name": "5 star delux room",
    "description": "xyz",
    "currentbookings": [],
    "imageurls": [
      "https://miro.medium.com/max/8576/1*p1zBnv11CSx_EII8sB9Uaw.jpeg",
      "https://images.rosewoodhotels.com/is/image/rwhg/hi-hgv-26330925-rhgmodelbedroom-1",
      "https://www.corinthia.com/media/1563/corinthia-lisbon-deluxe-king-bedroom.jpg"
    ],
    "maxcount": 4,
    "phonenumber": 7759817248,
    "rentperday": 2,
    "type": "Ac",
    "__v": 0
  },
  {
    "_id": "62984ac3c310d7d381c29220",
    "name": "5 star Ac room",
    "description": "xyz",
    "currentbookings": [],
    "imageurls": [
      "xyz",
      "y",
      "b"
    ],
    "maxcount": 4,
    "phonenumber": 7759817248,
    "rentperday": 2,
    "type": "Ac",
    "__v": 0
  }
]
```


# Http Localhost 5000 Api Adminb Adminlogin

http://localhost:5000/api/adminb/adminlogin

```java
CompletableFuture<HttpLocalhost5000ApiAdminbAdminlogin> httpLocalhost5000ApiAdminbAdminloginAsync(
    final HttpLocalhost5000ApiAdminbAdminloginrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiAdminbAdminloginrequest`](../../doc/models/http-localhost-5000-api-adminb-adminloginrequest.md) | Body, Required | - |

## Response Type

[`HttpLocalhost5000ApiAdminbAdminlogin`](../../doc/models/http-localhost-5000-api-adminb-adminlogin.md)

## Example Usage

```java
HttpLocalhost5000ApiAdminbAdminloginrequest body = new HttpLocalhost5000ApiAdminbAdminloginrequest();
body.setEmail("admin@gmail.com");
body.setPassword("1234");

miscController.httpLocalhost5000ApiAdminbAdminloginAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "admin",
  "email": "admin@gmail.com",
  "isAdmin": true,
  "_id": "6280aacadb06af79280c9eec"
}
```


# Http Localhost 5000 Api Rooms Addroom

http://localhost:5000/api/rooms/addroom

```java
CompletableFuture<String> httpLocalhost5000ApiRoomsAddroomAsync(
    final HttpLocalhost5000ApiRoomsAddroomrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiRoomsAddroomrequest`](../../doc/models/http-localhost-5000-api-rooms-addroomrequest.md) | Body, Required | - |

## Response Type

`String`

## Example Usage

```java
HttpLocalhost5000ApiRoomsAddroomrequest body = new HttpLocalhost5000ApiRoomsAddroomrequest();
body.setRoom("8 star delux room");
body.setDescription("Couples are welcome Guests can check in using any local or outstation ...");
body.setImageurls(new LinkedList<>());
body.getImageurls().add("https://images.oyoroomscdn.com/uploads/hotel_image/89615/2bbe6b0a9666175c.jpg");
body.getImageurls().add("https://images.oyoroomscdn.com/uploads/hotel_image/61649/large/8698ecb3fd53d1f0.jpg");
body.getImageurls().add("https://images.oyoroomscdn.com/uploads/hotel_image/56303/medium/91dead74a5dffa61.jpg");
body.setMaxcount(3);
body.setPhonenumber(7759817248L);
body.setRentperday(1000);
body.setType("Delux");

miscController.httpLocalhost5000ApiRoomsAddroomAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"New Room Added Successfully"
```


# Http Localhost 5000 Api Bookings Bookroom

http://localhost:5000/api/bookings/bookroom

```java
CompletableFuture<Void> httpLocalhost5000ApiBookingsBookroomAsync(
    final String body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `String` | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String body = "\"room\"\\n:\\n\"5 star delux room\",\\n\"fromdate\"\\n:\\n\"2-06-2022\",\\n\"todate\"\\n:\\n\"30-06-2022\",\\n\"totalDays\"\\n:\\n2,\\n\"totalAmount\"\\n:\\n2000\\n}\\n\\n";

miscController.httpLocalhost5000ApiBookingsBookroomAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`HttpLocalhost5000ApiBookingsBookroom1Exception`](../../doc/models/http-localhost-5000-api-bookings-bookroom-1-exception.md) |


# Http Localhost 5000 Api Rooms Getroombyid

http://localhost:5000/api/rooms/getroombyid

```java
CompletableFuture<HttpLocalhost5000ApiRoomsGetroombyid> httpLocalhost5000ApiRoomsGetroombyidAsync(
    final HttpLocalhost5000ApiRoomsGetroombyidrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiRoomsGetroombyidrequest`](../../doc/models/http-localhost-5000-api-rooms-getroombyidrequest.md) | Body, Required | - |

## Response Type

[`HttpLocalhost5000ApiRoomsGetroombyid`](../../doc/models/http-localhost-5000-api-rooms-getroombyid.md)

## Example Usage

```java
HttpLocalhost5000ApiRoomsGetroombyidrequest body = new HttpLocalhost5000ApiRoomsGetroombyidrequest();
body.setId("62984ac3c310d7d381c29220");

miscController.httpLocalhost5000ApiRoomsGetroombyidAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "_id": "6291d1c869b29ea938f4ea89",
  "name": "5 star delux room",
  "description": "Couples are welcome Guests can check in using any local or outstation ID proof (PAN card not accepted). Only Indian Nationals allowed As a complimentary benefit, your stay is now insured by Acko. This hotel is serviced as per quality standards of BFHL",
  "currentbookings": [
    {
      "bookingid": "6293b787092152a78e4a2977",
      "fromdate": "29-05-2022",
      "todate": "30-05-2022",
      "userid": "6280aacadb06af79280c9eec",
      "status": "booked"
    },
    {
      "bookingid": "629892ccb0984723c983f3f6",
      "fromdate": "02-06-2022",
      "todate": "03-06-2022",
      "userid": "629891db96996a2050b63c2d",
      "status": "booked"
    }
  ],
  "imageurls": [
    "https://images.oyoroomscdn.com/uploads/hotel_image/89615/2bbe6b0a9666175c.jpg",
    "https://images.oyoroomscdn.com/uploads/hotel_image/61649/large/8698ecb3fd53d1f0.jpg",
    "https://images.oyoroomscdn.com/uploads/hotel_image/56303/medium/91dead74a5dffa61.jpg"
  ],
  "maxcount": 3,
  "phonenumber": 7759817248,
  "rentperday": 1000,
  "type": "Delux",
  "__v": 6
}
```


# Http Localhost 5000 Api Bookings Cancelbooking

http://localhost:5000/api/bookings/cancelbooking

```java
CompletableFuture<String> httpLocalhost5000ApiBookingsCancelbookingAsync(
    final HttpLocalhost5000ApiBookingsCancelbookingrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiBookingsCancelbookingrequest`](../../doc/models/http-localhost-5000-api-bookings-cancelbookingrequest.md) | Body, Required | - |

## Response Type

`String`

## Example Usage

```java
HttpLocalhost5000ApiBookingsCancelbookingrequest body = new HttpLocalhost5000ApiBookingsCancelbookingrequest();
body.setBookingid("6294ab8351f887ff2460945d");
body.setRoomid("6291d2bc69b29ea938f4ea8f");

miscController.httpLocalhost5000ApiBookingsCancelbookingAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"Booking deleted successfully"
```


# Http Localhost 5000 Api Bookings Getuserbookings

http://localhost:5000/api/bookings/getuserbookings

```java
CompletableFuture<List<HttpLocalhost5000ApiBookingsGetuserbooking>> httpLocalhost5000ApiBookingsGetuserbookingsAsync(
    final HttpLocalhost5000ApiBookingsGetuserbookingsrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiBookingsGetuserbookingsrequest`](../../doc/models/http-localhost-5000-api-bookings-getuserbookingsrequest.md) | Body, Required | - |

## Response Type

[`List<HttpLocalhost5000ApiBookingsGetuserbooking>`](../../doc/models/http-localhost-5000-api-bookings-getuserbooking.md)

## Example Usage

```java
HttpLocalhost5000ApiBookingsGetuserbookingsrequest body = new HttpLocalhost5000ApiBookingsGetuserbookingsrequest();
body.setId("6280aacadb06af79280c9eec");

miscController.httpLocalhost5000ApiBookingsGetuserbookingsAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "_id": "62998242d482d9212f0aa5c0",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "629891db96996a2050b63c2d",
    "fromdate": "03-06-2022",
    "todate": "04-06-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "cancelled",
    "createdAt": "2022-06-03T03:38:42.185Z",
    "updatedAt": "2022-06-03T20:56:09.248Z",
    "__v": 0
  },
  {
    "_id": "629892ccb0984723c983f3f6",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "629891db96996a2050b63c2d",
    "fromdate": "02-06-2022",
    "todate": "03-06-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-06-02T10:37:00.211Z",
    "updatedAt": "2022-06-02T10:37:00.211Z",
    "__v": 0
  },
  {
    "_id": "6295a364d3a9b35f58c44551",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "62924173a669add56cfd2196",
    "fromdate": "01-06-2022",
    "todate": "02-06-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "cancelled",
    "createdAt": "2022-05-31T05:11:00.726Z",
    "updatedAt": "2022-05-31T05:11:27.997Z",
    "__v": 0
  },
  {
    "_id": "62957c70d8b9d8a6397dfa01",
    "room": "5 star delux room",
    "roomid": "6291d3cf69b29ea938f4ea95",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1800,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-31T02:24:48.254Z",
    "updatedAt": "2022-05-31T02:24:48.254Z",
    "__v": 0
  },
  {
    "_id": "62957ae6e5a3e3a5f1a96801",
    "room": "NON-DELUX AC",
    "roomid": "6291d35269b29ea938f4ea92",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-31T02:18:14.843Z",
    "updatedAt": "2022-05-31T02:18:14.843Z",
    "__v": 0
  },
  {
    "_id": "6294cb5486cf13ffd3fc8158",
    "room": "NON-DELUX AC",
    "roomid": "6291d35269b29ea938f4ea92",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-30T13:49:08.802Z",
    "updatedAt": "2022-05-30T13:49:08.802Z",
    "__v": 0
  },
  {
    "_id": "6294ab8351f887ff2460945d",
    "room": "delux 4 star room",
    "roomid": "6291d2bc69b29ea938f4ea8f",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1400,
    "transactionId": "1234",
    "status": "cancelled",
    "createdAt": "2022-05-30T11:33:23.991Z",
    "updatedAt": "2022-06-03T20:26:12.209Z",
    "__v": 0
  },
  {
    "_id": "6293b787092152a78e4a2977",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "29-05-2022",
    "todate": "30-05-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-29T18:12:23.955Z",
    "updatedAt": "2022-05-29T18:12:23.955Z",
    "__v": 0
  }
]
```


# Http Localhost 5000 Api Bookings Getallbookings

http://localhost:5000/api/bookings/getallbookings

```java
CompletableFuture<List<HttpLocalhost5000ApiBookingsGetallbooking>> httpLocalhost5000ApiBookingsGetallbookingsAsync()
```

## Response Type

[`List<HttpLocalhost5000ApiBookingsGetallbooking>`](../../doc/models/http-localhost-5000-api-bookings-getallbooking.md)

## Example Usage

```java
miscController.httpLocalhost5000ApiBookingsGetallbookingsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "_id": "6293b787092152a78e4a2977",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "29-05-2022",
    "todate": "30-05-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-29T18:12:23.955Z",
    "updatedAt": "2022-05-29T18:12:23.955Z",
    "__v": 0
  },
  {
    "_id": "6294ab8351f887ff2460945d",
    "room": "delux 4 star room",
    "roomid": "6291d2bc69b29ea938f4ea8f",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1400,
    "transactionId": "1234",
    "status": "cancelled",
    "createdAt": "2022-05-30T11:33:23.991Z",
    "updatedAt": "2022-06-03T20:26:12.209Z",
    "__v": 0
  },
  {
    "_id": "6294cb5486cf13ffd3fc8158",
    "room": "NON-DELUX AC",
    "roomid": "6291d35269b29ea938f4ea92",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-30T13:49:08.802Z",
    "updatedAt": "2022-05-30T13:49:08.802Z",
    "__v": 0
  },
  {
    "_id": "62957ae6e5a3e3a5f1a96801",
    "room": "NON-DELUX AC",
    "roomid": "6291d35269b29ea938f4ea92",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-31T02:18:14.843Z",
    "updatedAt": "2022-05-31T02:18:14.843Z",
    "__v": 0
  },
  {
    "_id": "62957c70d8b9d8a6397dfa01",
    "room": "5 star delux room",
    "roomid": "6291d3cf69b29ea938f4ea95",
    "userid": "6280aacadb06af79280c9eec",
    "fromdate": "30-05-2022",
    "todate": "31-05-2022",
    "totalDays": 2,
    "totalAmount": 1800,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-05-31T02:24:48.254Z",
    "updatedAt": "2022-05-31T02:24:48.254Z",
    "__v": 0
  },
  {
    "_id": "6295a364d3a9b35f58c44551",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "62924173a669add56cfd2196",
    "fromdate": "01-06-2022",
    "todate": "02-06-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "cancelled",
    "createdAt": "2022-05-31T05:11:00.726Z",
    "updatedAt": "2022-05-31T05:11:27.997Z",
    "__v": 0
  },
  {
    "_id": "629892ccb0984723c983f3f6",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "629891db96996a2050b63c2d",
    "fromdate": "02-06-2022",
    "todate": "03-06-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "booked",
    "createdAt": "2022-06-02T10:37:00.211Z",
    "updatedAt": "2022-06-02T10:37:00.211Z",
    "__v": 0
  },
  {
    "_id": "62998242d482d9212f0aa5c0",
    "room": "5 star delux room",
    "roomid": "6291d1c869b29ea938f4ea89",
    "userid": "629891db96996a2050b63c2d",
    "fromdate": "03-06-2022",
    "todate": "04-06-2022",
    "totalDays": 2,
    "totalAmount": 2000,
    "transactionId": "1234",
    "status": "cancelled",
    "createdAt": "2022-06-03T03:38:42.185Z",
    "updatedAt": "2022-06-03T20:56:09.248Z",
    "__v": 0
  }
]
```


# Http Localhost 5000 Api Rooms Deleteroom

http://localhost:5000/api/rooms/deleteroom

```java
CompletableFuture<String> httpLocalhost5000ApiRoomsDeleteroomAsync(
    final HttpLocalhost5000ApiRoomsDeleteroomrequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`HttpLocalhost5000ApiRoomsDeleteroomrequest`](../../doc/models/http-localhost-5000-api-rooms-deleteroomrequest.md) | Body, Required | - |

## Response Type

`String`

## Example Usage

```java
HttpLocalhost5000ApiRoomsDeleteroomrequest body = new HttpLocalhost5000ApiRoomsDeleteroomrequest();
body.setId("62984ac3c310d7d381c29220");

miscController.httpLocalhost5000ApiRoomsDeleteroomAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"Room Deleted Successfully"
```

