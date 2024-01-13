<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Information</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
            text-align: center;
        }

        h2 {
            color: #333;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin: 10px 0 5px;
            color: #333;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        button {
            background-color: #4caf50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }

        div#studentTableContainer {
            margin-top: 20px;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Add Student</h2>
    <form id="addStudentForm">
        <label for="name">Student Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="code">Student Code:</label>
        <input type="text" id="code" name="code" required>

        <label for="email">Student Email:</label>
        <input type="email" id="email" name="email" required>

        <button type="button" onclick="addStudentData()">Add Student</button>
    </form>

    <button onclick="loadStudentData()">View Student Table</button>

    <div id="studentTableContainer"></div>

    <script>
        function addStudentData() {
            var formData = new FormData(document.getElementById('addStudentForm'));

            fetch('/lol/table.php', {
                method: 'POST',
                body: formData
            })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Error adding student. Please try again.');
                }
                alert('Student Added Successfully');
                document.getElementById('addStudentForm').reset();
            })
            .catch(error => {
                alert(error.message);
            });
        }

        function loadStudentData() {
            fetch('/lol/table.php')
            .then(response => response.text())
            .then(data => {
                document.getElementById('studentTableContainer').innerHTML = data;
            })
            .catch(error => {
                console.error('Error fetching student data:', error);
            });
        }
    </script>
</body>
</html>
