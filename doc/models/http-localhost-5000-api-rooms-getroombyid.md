
# Http Localhost 5000 Api Rooms Getroombyid

## Structure

`HttpLocalhost5000ApiRoomsGetroombyid`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Currentbookings` | [`List<Currentbooking3>`](../../doc/models/currentbooking-3.md) | Required | - | List<Currentbooking3> getCurrentbookings() | setCurrentbookings(List<Currentbooking3> currentbookings) |
| `Imageurls` | `List<String>` | Required | - | List<String> getImageurls() | setImageurls(List<String> imageurls) |
| `Maxcount` | `int` | Required | - | int getMaxcount() | setMaxcount(int maxcount) |
| `Phonenumber` | `long` | Required | - | long getPhonenumber() | setPhonenumber(long phonenumber) |
| `Rentperday` | `int` | Required | - | int getRentperday() | setRentperday(int rentperday) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `V` | `int` | Required | - | int getV() | setV(int v) |

## Example (as JSON)

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

