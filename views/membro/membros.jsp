<!DOCTYPE html>
<html>
<head>
    <title>Lista de Membros</title>
</head>
<body>
    <h1>Lista de Membros</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
        </tr>
        <c:forEach var="membro" items="${membros}">
            <tr>
                <td>${membro.id}</td>
                <td>${membro.nome}</td>
                <td>${membro.email}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="index.jsp">Adicionar Novo Membro</a>
</body>
</html>
