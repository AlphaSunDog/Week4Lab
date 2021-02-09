<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <form action="Note" method="get">
        <label>Title: </label><span>${note.title}</span>
        <br>
        <br>
        <label>Contents: </label><br><span>${note.contents}</span>
        <br>
        <br>
        </form>
        <a href="Note">Edit</a>
    </body>
</html>
