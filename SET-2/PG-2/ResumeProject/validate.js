
document.getElementById("resumeForm").onsubmit = function(e) {
    e.preventDefault();

    let name = document.getElementById("name").value;
    let education = document.getElementById("education").value;
    let skills = document.getElementById("skills").value;
    let projects = document.getElementById("projects").value;

    if (name == "" || education == "" || skills == "" || projects == "") {
        alert("Please fill all fields!");
    }
    else {
        alert("Resume Submitted Successfully!");
    }
};
