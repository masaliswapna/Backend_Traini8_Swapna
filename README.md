# Traini8 - Training Center Registry

## Introduction
Traini8 is a RESTful API application designed to serve as a registry for government-funded training centers. The application allows users to create, manage, and retrieve information about various training centers through well-defined API endpoints.

## Technologies Used
- **Java**: Programming language used for the application.
- **Spring Boot**: Framework for building the RESTful API.
- **MySQL**: Relational database for persistent data storage.
- **Maven**: Build automation tool used for managing project dependencies.

## Requirements
- JDK 11 or higher
- Maven
- An IDE (Eclipse, IntelliJ IDEA, etc.)

## Setup Instructions
To get started with the Traini8 project, follow these steps:
## 1: Clone the Repository
You can clone the project repository to your local machine using the following command:
```bash
git clone https://github.com/masaliswapna/Backend_Traini8_Swapna.git
cd Backend_Traini8_Swapna
Build the Project:
mvn clean install
Run the Application: You can run the application using your IDE or by executing:
mvn spring-boot:run
The application will start on http://localhost:8090.

API Endpoints
1. Create Training Center
URL: /api/training-centers
Method: POST
Request Body:
{
    "centerName": "Kodnest Training Center",
    "centerCode": "KOD123456789",
    "address": {
        "detailedAddress": "BTM Layout",
        "city": "Bangalore",
        "state": "Karnataka",
        "pincode": "560029"
    },
    "studentCapacity": 50,
    "coursesOffered": ["Java", "Python"],
    "contactEmail": "kodnest@gmail.com",
    "contactPhone": "9625874136"
}
Success Response:
Code: 201 CREATED
Content: Newly created Training Center details.
2. Get All Training Centers
URL: /api/training-centers
Method: GET
Success Response:
Code: 200 OK
Content:
[
    {
       "centerName": "Kodnest Training Center",
    "centerCode": "KOD123456789",
    "address": {
        "detailedAddress": "BTM Layout",
        "city": "Bangalore",
        "state": "Karnataka",
        "pincode": "560029"
    },
    "studentCapacity": 50,
    "coursesOffered": ["Java", "Python"],
    "contactEmail": "kodnest@gmail.com",
    "contactPhone": "9625874136"
    }
]
Testing Instructions
You can test the API using tools like Postman or curl.

Example Using Postman
Open Postman.

To create a training center:

Set the request type to POST.
Enter the URL http://localhost:8090/api/training-centers.
Select Body, choose raw, and set the type to JSON.
Paste the JSON request body and send the request.
To retrieve all training centers:

Set the request type to GET.
Enter the URL http://localhost:8090/api/training-centers and send the request.
