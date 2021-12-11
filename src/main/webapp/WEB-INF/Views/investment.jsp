<%--
  Created by IntelliJ IDEA.
  User: kaurr
  Date: 11-12-2021
  Time: 09:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Savings Page</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <style>
        h1 {
            text-align:center;
            background-color: cyan;

        }
        h2{
            text-align:center;
        }

        .btn {

            width: 45%;
            alignment: right;
        }


    </style>
</head>
<body>
<div class="container2">

    <h2>Savings Investment Record</h2>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Customer number</th>
            <th>Customer Name</th>
            <th>Customer Deposit</th>
            <th>Number of years</th>
            <th>Savings Type</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${todos}" var="todo">



            <tr>


                <td>${todo.savingscode}</td>
                <td>${todo.custname}</td>
                <td>${todo.cdep}</td>
                <td>${todo.nyears}</td>
                <td>${todo.savingstype}</td>
                <td>    <a type="button" class="btn btn-primary"
                           href="update-todo?id=${todo.savingscode}" >Edit</a> </td>



                <td>    <a type="button" class="btn btn-primary"
                           href="delete-todo?id=${todo.savingscode}" >Delete</a> </td>



                <td>    <a type="button" class="btn btn-primary" onmouseout="myFunction()"
                           href="see-todo?id=${todo.savingscode}" >Projected Investment</a> </td>


            </tr>


        </c:forEach>
        </tbody>
    </table>
    <a class="btn" href="add-todo">Add</a>
</div>

</div>

</body>
</html>
