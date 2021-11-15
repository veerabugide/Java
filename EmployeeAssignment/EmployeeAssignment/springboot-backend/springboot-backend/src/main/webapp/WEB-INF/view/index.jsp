<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
    <style>
        body{
            align-content: center;
        }
        form{
            background-color: skyblue;
            align-content: center;
            text-align: center;
            border: solid;
            height: 200px;
            width: 500px;
        }
        label{
            margin: 30px;
        }
        .button{
            margin-left: 70px;
        }
        h1{
            margin-top: 40px;

            color: red;
        }
    </style>
</head>
<body>
<h1 style="text-align: center;">Employee form</h1>
<form action="save" modelAttribute="employee">
    <label>FirstName</label>
    <input type="text" name="firstName" placeholder="firstName"><br>
    <label>LastName</label>
    <input type="text" name="lastName" placeholder="lastName"><br>
    <label>Email</label>
    <input type="text" name="emailId" placeholder=" emailid" style="margin-left: 40px;"><br>
    <button class="button">Submit</button>
</form>
</body>
</html>