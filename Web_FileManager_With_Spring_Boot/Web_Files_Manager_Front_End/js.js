let baseURL = "http://localhost:8080/filemanagerapp/";

$("#btnUpload").click(function () {
    $.ajax({
        uri: baseURL + "file",
        method: "post",
        dataType: "json",
        success: function (res) {
            alert(res.message);
        },
        error: function (err) {
            alert(err.message);
        }
    });
});

// select file section

function openFileBrowser() {
    $("#fileInput").click();
}

//select file and set preview
$("#fileInput").on("change", function () {
    var selectedFile = this.files[0];

    if (!selectedFile) {
        alert("Please select a file");
    }

    let fileReader = new FileReader();

    fileReader.onload = function (event) {
        let displayImage = $("#imageContent");
        console.log(event.target.result);
        displayImage.css({
            "background": `url(${event.target.result})`,
            "background-size": "cover"
        });
    };
    fileReader.readAsDataURL(selectedFile);
});
