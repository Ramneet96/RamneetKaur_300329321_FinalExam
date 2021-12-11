<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h1>Add an entry</h1>
    <form method="POST">
        <fieldset class="form-group">
            <label> Customer code :</label>
            <input name="custcode" type="text" class="form-control" required value="${id}" />

        </fieldset>


        <fieldset class="form-group">
            <label> Customer Name :</label>
            <input name="catdesc" type="text" class="form-control" required value="${name}" />

        </fieldset>

        <fieldset class="form-group">
            <label> Customer Deposit :</label>
            <input name="custdep" type="text" class="form-control" required value="${dep}" />

        </fieldset>
        <fieldset class="form-group">
            <label> Number of years :</label>
            <input name="noofyears" type="text" class="form-control" required value="${nyears}"/>

        </fieldset>
        <fieldset class="form-group">
            <label>Savings Type:</label>
            <select name="savetype" class="form-control" required value="${savtype}">
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
