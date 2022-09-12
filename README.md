# Design-and-Analysis-of-Algorithms
<h2> Assignment 1 </h2>

Name : Arpit Singh Thakur <br>
Sec  : 5-A <br>
Roll : 36 <br>

<hr>

<h3> Problem Statement : <u> To check whether the Matrix is rising tower Matrix or not</u> </h3>
<br>
<h3> Description:</h3><br> <p> A rising tower is one in which all the elements are in ascending order, the bottom being the smallest. To detect a rising tower, we need to implement an algorithm which starts with the 1st tower, and then keeps on checking if the numbers are in ascending order or not. The main challenge of this problem according to me was to implement inputs in the form of a non uniform matrix, with each column having different length. This matrix would then be printed in the form of a tower and then checked to see if it is rising or not. </p> 

<h3>Implementation</h3>
<p>
  -Use ArrayList of Arraylist to Store towers <br>
  -Iterate throught Arraylist within the ArrayList to check order of elements(check from top to bottom) <br>
  -if it is not in ascending order set flag=false(flag is Boolean Value) and return flag <br>
</p>

<h3> TEST CASES </h3>
<br>
<p> INPUT1 </p>

![Screenshot (65)](https://user-images.githubusercontent.com/95165463/189667623-2322a9b0-d341-4051-a555-59f4f4c1f218.png)

<p> OUTPUT1 </p>
<p>It is a Rising Matrix</p>





