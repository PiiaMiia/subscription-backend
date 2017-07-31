# Introduction

Dropwizard applications are developed using maven, so first make sure you have that set up.
Instructions can be found here: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html.
I used IntelliJ for developing and building this project, so I recommend using this for packaging the project.

The frontend application should access the data, once all this is set up.

# Running The Application

```bash
$ git clone https://github.com/PiiaMiia/subscription-backend.git
```
* open the project with IntelliJ
* package the project or run mvn package. Make sure the config.yml file appears in target folder. If not, simply copy it there.
* cd to target folder and run command

```bash
$java -jar sib-rest-1.0-SNAPSHOT.jar server config.yml
```

# Configuration

Default application server configuration

```bash
PORT             = 9000;
HealthCheck      = 9001;
```

Available services:

SERVICE | URL | GET | DELETE | POST
--- | --- | --- | --- | ---
**DetailsService** | http://localhost:9000/details | X | X | X
|  |   | *Gets all details of current service* | *Ends current subscription* | *reinstates ended subscription*
**BillingService** | http://localhost:9000/bills | X | - | -
|  |   | *gets all the past payments* |  |  
