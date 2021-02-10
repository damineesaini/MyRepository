
/* JavaScript code for ques1 to prompt user to enter  principal,rate of interest and no of years.Then calculate the simple interest and print the result*/

function cal_simple_interest(){
var principal = prompt("Enter the principal (in Rs.)"); //user input principal

var interest_rate = prompt("Enter the interest rate (in %)");//user input rate of interest

var no_of_years = prompt("Enter the number of years");//user input no of years

var simple_interest = principal * interest_rate * no_of_years /100; // calculating simple interest


document.getElementById("simple_interest").innerHTML =
"The Simple Interest is: Rs." + simple_interest; //rendering the output to the html page element having id = "simple_interest"
}




/* JavaScript code for ques2 to prompt user to enter a string then check if it is a palindrome or not and print the result*/

function check_string_palindrome(){

	var word = prompt('Enter a string: '); // taking string input from user

	var reversed ='';
// for (var i = 0; i < word.length; i++) {
//      reversed = word[i] + reversed;
//      }

    reversed= word.split('').reverse().join(''); //reverse the string entered by user

      if (word == reversed) {					// check if reversed string is same as reversed string
            document.getElementById("is_palindrome").innerHTML = word +" is a palindrome";  //rendering the output to the html page element having id = "is_palindrome"
        }
    
    else{

    	document.getElementById("is_palindrome").innerHTML = word +" is not a palindrome";
    }
}




/* JavaScript code for ques3 to prompt user to enter  radius of circle then calculate area of circle and show the result*/

function cal_circle_area(){
var radius = prompt("Enter the radius of circle (in cm)"); //user input radius 

var circle_area= 3.14 *radius*radius; // calculating area of circle

document.getElementById("circle_area").innerHTML =
"The area of circle with radius " + radius +" cm is: " + circle_area; //rendering the output to the html page element having id = "simple_interest"
}




/* JavaScript code for ques4 to copy information of one object to another object*/
function object_copy(){
	var person ={		// created an object called person
		fristname:"Daminee",
		lastname:"Saini",
		city:"Delhi",
	};

	var person2 = person; //created a copy called person2 of object person

//printing details on console attribute wise using person2 object
	console.log(person2.fristname);
	console.log(person2.lastname);
	console.log(person2.city);

//printing both objects on console
	console.log(person2);
	console.log(person);
}




/* JavaScript code for ques5 create a list of objects of Employee with info and completing followup ques on it*/
function list_employee(){
	//part 1.
	//created a list of employees with attributes name,age,salary and date of birth
	var employee_list=[
		{name:"Daminee Saini", age:23, salary:6000 ,DOB:'11/11/1997'},
		{name:"Jatin Sharma", age:23, salary:6000 ,DOB:'12/04/1997'},
		{name:"Priya Solanki", age:21, salary:800 ,DOB:'12/12/1999'},
		{name:"Amit Sharma", age:21, salary:800 ,DOB:'11/02/1999'},
	];
	console.log();
	console.log(" List of all employees:"); // to print the list of all employees on console
	for(var i=0; i<employee_list.length;i++)
	{
			console.log("Name:",employee_list[i].name, "  Age:",employee_list[i].age, "  Salary:",employee_list[i].salary, "  DOB:",employee_list[i].DOB);
	}


	//part 2
	console.log();
	console.log(" All employees with salary greater than 5000:");
	for(var i=0; i<employee_list.length;i++)
	{
		if(employee_list[i].salary>5000) // comparing salary of employees and will print details of those employees whose salary > 5000
		{
			console.log("Name:",employee_list[i].name, "  Age:",employee_list[i].age, "  Salary:",employee_list[i].salary, "  DOB:",employee_list[i].DOB);
		}
	}

	
	//part 3
	console.log();
	console.log(" All employees grouped on the basis of their age:");
	var grouped_employee=groupby_age(employee_list,"age");
	console.log(grouped_employee); //will display single object which will consist 2 properties 21 and 23 i.e. age of employees 
								   //and their value will be an array of employees with age 21 and 23 respectively


	//part 4
	console.log();
	console.log(" All employees with salary less than 5000 and age more than 20:");
	for(var i=0; i<employee_list.length;i++)
	{
		if(employee_list[i].salary<5000 && employee_list[i].age>20) // check if salary < 1000 and ade>20 of employee
		{	
			// printed original details of employees with salary <1000 and age >20
			console.log();
			console.log("Name:",employee_list[i].name, "  Age:",employee_list[i].age, "  Salary:",employee_list[i].salary, "  DOB:",employee_list[i].DOB);
			
			employee_list[i].salary=employee_list[i].salary*5; // incrementing the salary by 5 times their current salary

			console.log("Details after incrementing salary:"); //printed details of employess after incrementing salary
			console.log("Name:",employee_list[i].name, "  Age:",employee_list[i].age, "  Salary:",employee_list[i].salary, "  DOB:",employee_list[i].DOB);
		}
	}

}

// function to group list of employee on age. we use reduce method here which performs reducer function on each array element and return a single object
function groupby_age(employee_list, age) {
  return employee_list.reduce(function(rv, x) {
    (rv[x[age]] = rv[x[age]] || []).push(x);
    return rv;
  }, {});
};