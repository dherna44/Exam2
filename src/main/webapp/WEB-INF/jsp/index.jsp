<!-- HTML creation and layout of the web page that will display the viruses table: -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Exam 2 SpringBoot App</title>
    <!-- Styling of the table and table data: -->
    <style>
        table{
            font-family: Arial, "Times New Roman";
            border-collapse: collapse;
            width: 100%;
            height: auto;
        }
        td, th{
            border: 2px solid #faebd7;
            border-radius: 4px;
            text-align: left;
            padding: 6px;
            width: auto;
            height: auto;
        }
        tr:nth-child(even){
            background-color: #faebd7;
        }

    </style>
</head>
<!-- Creation of the HTML table and connection to the properties: -->
<body>
<h1>Top Five Most Common Viruses</h1>

<table>

    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>
        <th>Images</th>
    </tr>

<!-- To be able to view the listitems in the HTML table that was created above: -->
    <c:forEach var = "listitem" items="${viruseslist}">
        <tr>
            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.duration}</td>
            <td>${listitem.mortalityrate}</td>
            <td> <img src=${listitem.imageaddress}> </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>