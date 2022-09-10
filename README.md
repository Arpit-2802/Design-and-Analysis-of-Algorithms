# Design-and-Analysis-of-Algorithms
<h2> Assignment 1 </h2>

Name : Arpit Singh Thakur <br>
Sec  : 5-A <br>
Roll : 36 <br>

<hr>

<h3> Problem Statement : <u> To check whether the Matrix is rising tower Matrix or not</u> (Queue Implementation) </h3>

Given : <br>
  Input n <br>
  Matrix is nxn <br>
Find : <br>
  Matrix has Rising Tower or Not  <br>

Implementation: <br>
  Matrix with random numbers size of nxn <br>
<ul>
<li> Take Input n</li>
<li> Declare Array of Array as nxn</li>
</ul>



<h3>Algorithm :</h3>
      - Take input in the array using random Function<br>
      - Iterate throught the matrix to check the whether the coloumns are in the descending order or not<br>
      - If Columns are in descending order then continue<br>
      - Set flag(boolean value) false (initial value of the flag is true)<br>
      - Return flag <br>



<h3> TEST CASES </h3>

INPUT : 

3 <br>
5 6 7 <br>
3 4 5 <br>
1 2 3 <br>

4 <br>
7 8 9 10 <br>
6 4 5 6 <br>
5 7 9 10 <br>
3 5 1 8 <br>

OUTPUT : <br>
It is a Rising Matrix<br>
It is a Not a Rising Matrix<br>
