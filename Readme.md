# SensorsStationServer
Server application based on Springboot. Part of SensorsStation project. Its target is to receive data from external devices and log that data to console. For now it receives data in form of `SensorData` class and images in form of `MultipartFile`.


## Run the application
Run the `./gradlew bootRun` command inside project directory to start the server. Server runs on port `8080` by default.

## Endpoints
`/sensors/data` - receive data as a json-body form of `SensorData` class and log that data to console.<br/>
`/monitoring/uploadImage` - receive incoming images as MultipartFile and save them into `spring_images` directory.

## [Android application](https://github.com/black-fluffy-cat/SensorsStation)
## [Project schematic](https://github.com/black-fluffy-cat/SensorsStation_ArduinoRaspberryCodes_Documentation/blob/master/SensorsStation.pdf)
## [Images of external devices](https://github.com/black-fluffy-cat/SensorsStation_ArduinoRaspberryCodes_Documentation/tree/master/Images%26Screenshots)
