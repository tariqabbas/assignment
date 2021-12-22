<h1> Below are JSON request and responses to create and read Department and Employee Entities</h5><br/>

<h4>Note : </h4><p>mysql structure dump is added to project directory named: assignmentdb.sql
restore it to any mysql latest version before testing.

swagger ui url would be:

<a>	http://host:port/swagger-ui/index.html</a> 

<h3>1- Create Department</h3></br>
	<h5> Request Body</h5> </br>
	
	
	{
	  "departmentId": 0,
	  "departmentName": "finance",
	  "managerId": 1, 
	}
<br> 	
   <h5> Response Body</h5> </br>
   
    {
	  "departmentId": 27,
	  "departmentName": "finance",
	  "managerId": 0,
	  "employees": null
	}
   
<h3>2- List Departments</h3></br>

   <h5> Request Body</h5> </br>
   
	  	 {
		 	 "page": 0,
		 	 "size": 2
	 	 }
   
   
   <h5> Response Body</h5> </br>
   
	   		[
	  {
	    "departmentId": 23,
	    "departmentName": "sdsdsd",
	    "managerId": 1,
	    "employees": [
	      {
	        "employeeId": 6,
	        "firstName": "string12",
	        "lastName": "string12",
	        "email": "string12@ass.com",
	        "phoneNumber": "string",
	        "hireDate": "2021-12-22",
	        "salary": 110,
	        "managerId": 2,
	        "departmentId": 0,
	        "departmentEntity": null
	      },
	      {
	        "employeeId": 7,
	        "firstName": "string12",
	        "lastName": "string12",
	        "email": "string12@ass.com",
	        "phoneNumber": "string",
	        "hireDate": "2021-12-22",
	        "salary": 110,
	        "managerId": 2,
	        "departmentId": 0,
	        "departmentEntity": null
	      },
	      {
	        "employeeId": 8,
	        "firstName": "string12",
	        "lastName": "string12",
	        "email": "string12@ass.com",
	        "phoneNumber": "string",
	        "hireDate": "2021-12-22",
	        "salary": 110,
	        "managerId": 2,
	        "departmentId": 0,
	        "departmentEntity": null
	      }
	    ]
	  },
	  {
	    "departmentId": 25,
	    "departmentName": "string1",
	    "managerId": 1,
	    "employees": []
	  }
	]
   
   
<h3>3- Create Employee</h3></br> 
	<h5> Request Body</h5> </br>

 
	{
	  "employeeId": 0,
	  "firstName": "sas",
	  "lastName": "were",
	  "email": "string@sasa.com",
	  "phoneNumber": "78889-798-8669-3223",
	  "hireDate": "2021-12-22T18:55:58.752Z",
	  "salary": 10,
	  "managerId": 1,
	  "departmentId": 26,
	  "departmentEntity": {
	     "departmentId": 26,
	     "departmentName": "string",
	     "managerId": 0,
	     "employees": [
	      null
	    ]
	  }
	}


</br>
<h5>Response Body </h5></br>


	{
	  "employeeId": 18,
	  "firstName": "sas",
	  "lastName": "were",
	  "email": null,
	  "phoneNumber": null,
	  "hireDate": "2021-12-22",
	  "salary": null,
	  "managerId": null,
	  "departmentId": 0,
	  "departmentEntity": null
	}


<h3>4- List Employees</h3></br>
<h5>Request Body </h5></br>

 

	{
	  "page": 0,
	  "size": 2
	}



</br>

<h5>Response Body </h5></br>


	[
	  {
	    "employeeId": 6,
	    "firstName": "string12",
	    "lastName": "string12",
	    "email": "string12@ass.com",
	    "phoneNumber": "string",
	    "hireDate": "2021-12-22",
	    "salary": 110,
	    "managerId": 2,
	    "departmentId": 23,
	    "departmentEntity": null
	  },
	  {
	    "employeeId": 7,
	    "firstName": "string12",
	    "lastName": "string12",
	    "email": "string12@ass.com",
	    "phoneNumber": "string",
	    "hireDate": "2021-12-22",
	    "salary": 110,
	    "managerId": 2,
	    "departmentId": 23,
	    "departmentEntity": null
	  }
	]
