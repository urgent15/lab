<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
</head>
<body>
    <h2>Add Student</h2>
    <form action="" method="post">
        <?php 
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "students";
        $conn  = mysqli_connect($servername, $username, $password, $dbname);

        if(isset($_POST["submit"])){
            // User Input
            $student_name = $_POST["name"];
            $std_code = $_POST["code"];
            $std_email = $_POST["email"];

            if(!empty($_POST["name"]) && !empty($_POST["code"]) && !empty($_POST["email"])){
                $sql = "INSERT INTO `students` (name, code, email) VALUES ('$student_name', '$std_code', '$std_email')";
                $run=mysqli_query($conn, $sql);
                if($run){
                    echo "Student Added Successfully";
                    mysqli_close($conn);
                } else {
                    echo "Error: " . $sql . "<br>" . mysqli_error($conn);
                }
            }
        }
        ?>
        <label for="name">Student Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="code">Student Code:</label>
        <input type="text" id="code" name="code" required>

        <label for="email">Student Email:</label>
        <input type="email" id="email" name="email" required>

        <button type="submit" name="submit">Add Student</button>
        <br>
    </form>
    <a href="/db/table.php"><button>View Student Table</button></a>
</body>
</html>
