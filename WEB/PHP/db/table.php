<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Information</title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Student Name</th>
                <th>Student Code</th>
                <th>Student Email</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "students";
            $conn  = mysqli_connect($servername, $username, $password, $dbname);

            $sql = "SELECT * FROM `students`";
            $result = mysqli_query($conn, $sql);

            if(mysqli_num_rows($result) > 0){
                while($row = mysqli_fetch_assoc($result)){
                    ?>
                    <tr>
                        <td><?php echo $row["id"]; ?></td>
                        <td><?php echo $row["name"]; ?></td>
                        <td><?php echo $row["code"]; ?></td>
                        <td><?php echo $row["email"]; ?></td>
                    </tr>
                    <?php
                }
            } else {
                echo "<tr><td colspan='4'>No student information found</td></tr>";
            }
            ?>
        </tbody>
    </table>
</body>
</html>
