
# Http Localhost 5000 Api Rooms Addroomrequest

## Structure

`HttpLocalhost5000ApiRoomsAddroomrequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Room` | `String` | Required | - | String getRoom() | setRoom(String room) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Imageurls` | `List<String>` | Required | - | List<String> getImageurls() | setImageurls(List<String> imageurls) |
| `Maxcount` | `int` | Required | - | int getMaxcount() | setMaxcount(int maxcount) |
| `Phonenumber` | `long` | Required | - | long getPhonenumber() | setPhonenumber(long phonenumber) |
| `Rentperday` | `int` | Required | - | int getRentperday() | setRentperday(int rentperday) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "room": "8 star delux room",
  "description": "Couples are welcome Guests can check in using any local or outstation ...",
  "imageurls": [
    "https://images.oyoroomscdn.com/uploads/hotel_image/89615/2bbe6b0a9666175c.jpg",
    "https://images.oyoroomscdn.com/uploads/hotel_image/61649/large/8698ecb3fd53d1f0.jpg",
    "https://images.oyoroomscdn.com/uploads/hotel_image/56303/medium/91dead74a5dffa61.jpg"
  ],
  "maxcount": 3,
  "phonenumber": 7759817248,
  "rentperday": 1000,
  "type": "Delux"
}
```

