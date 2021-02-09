<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="Note" method="post">
        <label>Title: </label>&nbsp;<input type="text" size="30" name="newtitle" value="This is the title">
        <br>
        <label>Contents: </label>&nbsp;<input type="text" size="30" name="newcontents" value="Contents go here">
        <br>
        <input type="submit" value="Save">
        </form>
    </body>
</html>
