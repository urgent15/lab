<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "students";
$conn = mysqli_connect($servername, $username, $password, $dbname);

if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

if (isset($_POST["name"]) && isset($_POST["code"]) && isset($_POST["email"])) {
    $student_name = $_POST["name"];
    $std_code = $_POST["code"];
    $std_email = $_POST["email"];

    $stmt = $conn->prepare("INSERT INTO students (name, code, email) VALUES (?, ?, ?)");
    $stmt->bind_param("sss", $student_name, $std_code, $std_email);

    if ($stmt->execute()) {
        echo "Student Added Successfully";
    } else {
        echo "Error adding student: " . $stmt->error;
    }

    $stmt->close();
} else {
    // Fetch and display student data
    $sql = "SELECT * FROM students";
    $result = mysqli_query($conn, $sql);

    if ($result) {
        if (mysqli_num_rows($result) > 0) {
            echo "<table border='1'>";
            echo "<thead><tr><th>ID</th><th>Student Name</th><th>Student Code</th><th>Student Email</th></tr></thead>";
            echo "<tbody>";

            while ($row = mysqli_fetch_assoc($result)) {
                echo "<tr>";
                echo "<td>" . $row["id"] . "</td>";
                echo "<td>" . $row["name"] . "</td>";
                echo "<td>" . $row["code"] . "</td>";
                echo "<td>" . $row["email"] . "</td>";
                echo "</tr>";
            }

            echo "</tbody></table>";
        } else {
            echo "<p>No student information found</p>";
        }
    } else {
        echo "Error: " . $sql . "<br>" . mysqli_error($conn);
    }
}

mysqli_close($conn);
?>
