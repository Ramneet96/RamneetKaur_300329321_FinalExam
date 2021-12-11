<%--
  Created by IntelliJ IDEA.
  User: kaurr
  Date: 11-12-2021
  Time: 09:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="webjars/bootstrap/3.3.6/css/bottstrap.min.css" rel="stylesheet">
</head>
<body>
div class="container">
<h1>Add an entry</h1>
<form method="POST">
    <fieldset class="form-group">
        <label> Customer Number:</label>
        <input name="custcode" type="text" class="form-control" required />

    </fieldset>


    <fieldset class="form-group">
        <label> Customer Name :</label>
        <input name="custname" type="text" class="form-control" required />

    </fieldset>

    <fieldset class="form-group">
        <label> Customer Deposit :</label>
        <input name="custdep" type="text" class="form-control" required />

    </fieldset>
    <fieldset class="form-group">
        <label> Number of years :</label>
        <input name="noofyears" type="text" class="form-control" required />

    </fieldset>
    <fieldset class="form-group">
        <label>Savings Type:</label>
        <select name="savetype" class="form-control">
            <option value="Savings-Deluxe">Savings-Deluxe</option>
            <option value="Savings-Regular">Savings-Regular</option>
        </select>

    </fieldset>


    <input class="btn btn-success" type="submit" value="Submit" />
</form>

</div>


<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
