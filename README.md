# MatchJob
Description: This is a REST api to return the top 3 matched job with a workerId.
The sorting order is with disance in between user and job, bill rate and start date. 

Usage:

This is a spring boot project and can be started with spring-boot:run from eclipse.
The project can also be started with App class in package main.java.match.job.app
The REST url is http://localhost:8080/Rest/V1/FindJobs/{workerId}


Tests:

There are 2 unit tests classes included for Dao and Bo.
test.java.match.job.bo.BoTest
test.java.match.job.dao.DaoTest

Sample:
http://localhost:8080/Rest/V1/FindJobs/1

[
  {
    "driverLicenseRequired": false,
    "requiredCertificates": [
      "Outstanding Memory Award"
    ],
    "location": {
      "longitude": "14.082219",
      "latitude": "50.180255"
    },
    "billRate": "$14.98",
    "workersRequired": 2,
    "startDate": "2015-11-12T07:23:56.19Z",
    "about": "Non veniam ipsum esse consectetur cillum ipsum quis aliquip. In eiusmod excepteur laborum laboris quis cupidatat consectetur exercitation veniam nisi. Commodo officia cillum laboris velit pariatur mollit deserunt mollit. Commodo sit proident aliquip officia. Irure deserunt ullamco quis aliqua eu eu ullamco qui eu minim. Tempor pariatur est ullamco duis reprehenderit. Est qui non Lorem et.",
    "jobTitle": "The Resinator",
    "company": "Centice",
    "guid": "562f66aa7f96c1f61adfd108",
    "jobId": 29
  },
  {
    "driverLicenseRequired": true,
    "requiredCertificates": [
      "Excellence in Organization",
      "Healthy Living Promoter"
    ],
    "location": {
      "longitude": "14.220885",
      "latitude": "50.176094"
    },
    "billRate": "$6.68",
    "workersRequired": 3,
    "startDate": "2015-11-08T02:25:45.091Z",
    "about": "Ad nostrud eiusmod ullamco ut eiusmod excepteur non. Veniam aliquip sit ullamco dolor consectetur esse sit fugiat incididunt reprehenderit. Eiusmod anim duis eu irure est sit dolor esse labore fugiat qui proident tempor duis. Incididunt Lorem non sit reprehenderit eu labore veniam. Id velit ullamco in ut pariatur consequat ut occaecat. Laboris adipisicing incididunt quis sint irure cillum velit ad culpa quis cupidatat officia est.",
    "jobTitle": "President and TeaEO",
    "company": "Orbiflex",
    "guid": "562f66aa17b61ab099669893",
    "jobId": 1
  },
  {
    "driverLicenseRequired": true,
    "requiredCertificates": [
      "Office Lunch Expert"
    ],
    "location": {
      "longitude": "14.293204",
      "latitude": "50.266116"
    },
    "billRate": "$6.21",
    "workersRequired": 5,
    "startDate": "2015-11-02T22:12:40.263Z",
    "about": "Labore tempor aliqua occaecat eiusmod deserunt incididunt qui voluptate laboris fugiat laborum sint eu. In ad ut dolor occaecat amet deserunt pariatur ea fugiat occaecat. Elit est qui quis irure Lorem ullamco Lorem nisi anim cupidatat nostrud qui proident.",
    "jobTitle": "The Resinator",
    "company": "Lovepad",
    "guid": "562f66aa7383f3a5241674c8",
    "jobId": 11
  }
]

