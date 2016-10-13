# TurkishIdentificationNo
## Web Service 
https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL
## How to Use
Create Person
```Java
Person person = new Person(tcNo,name,surname,birthday);
```
Create Servis for person who validate tc number
```Java
IdentificationClient identificationClient = new IdentificationClient(person); 
```
Validate number
```Java
Response response = identificationClient.checkIdentificationNo(); 
```
Response
```Java
System.out.println(response.isValid()); // true or false 

for (String error : response.getErrors()) // if errors 
	    		System.err.println(error); // print errors 
```
