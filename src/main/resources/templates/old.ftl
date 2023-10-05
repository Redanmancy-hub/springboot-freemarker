<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8"></meta>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"></meta>
    <title>Old Man Information</title>
    <style>
        body {
            font-family: SimSun;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>

<body>
<h2>老人档案信息</h2>
<table id="dataTable">
    <thead>
    <tr>
        <th>老人姓名</th>
        <th>老人性别</th>
        <th>老人生日</th>
        <th>老人身份证</th>
        <th>老人群体类型</th>
        <th>居住地址</th>
    </tr>
    </thead>
    <tbody>
    <#list detailList as oldMan>
        <tr>
            <td>${oldMan.oldManName}</td>
            <td><#if oldMan.oldManSex == "0">男<#else>女</#if></td>
            <td>${oldMan.oldManBirth?string("yyyy-MM-dd")}</td>
            <td>${oldMan.oldManIdCard}</td>
            <td><#if oldMan.oldManType == 1>60岁以上老人<#else>60岁以下老人</#if></td>
            <td>${oldMan.oldManDetailedAddress}</td>
        </tr>
    </#list>
    </tbody>
</table>
</body>

</html>
