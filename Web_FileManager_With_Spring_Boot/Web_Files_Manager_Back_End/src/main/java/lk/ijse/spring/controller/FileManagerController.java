package lk.ijse.spring.controller;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
@CrossOrigin
public class FileManagerController {

    @PostMapping
    public ResponseUtil addFile() {
        return new ResponseUtil("OK", "Successfully added", null);
    }
}

/*
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Save File Example</title>
</head>
<body>

    <input type="file" id="fileInput">
    <button onclick="uploadFile()">Upload File</button>

    <script>
        function uploadFile() {
            const fileInput = document.getElementById('fileInput');
            const file = fileInput.files[0];

            if (!file) {
                alert('Please select a file');
                return;
            }

            const reader = new FileReader();

            reader.onload = function (event) {
                const fileData = event.target.result;

                // Send file data to the server using AJAX
                const xhr = new XMLHttpRequest();
                xhr.open('POST', 'http://localhost:3000/saveFile', true);
                xhr.setRequestHeader('Content-Type', 'application/json');

                xhr.onreadystatechange = function () {
                    if (xhr.readyState === 4 && xhr.status === 200) {
                        alert('File saved successfully on the server');
                    }
                };

                xhr.send(JSON.stringify({ fileData }));
            };

            reader.readAsText(file);
        }
    </script>

</body>
</html>

*/
