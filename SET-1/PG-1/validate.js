
document.getElementById("regForm").onsubmit = function(e) {
    e.preventDefault();

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;
    let event = document.getElementById("event").value;

    if (name == "" || email == "" || phone == "" || event == "") {
        alert("Please fill all fields!");
    }
    else if (phone.length != 10 || isNaN(phone)) {
        alert("Enter a valid 10-digit phone number!");
    }
    else if (!email.includes("@") || !email.includes(".")) {
        alert("Enter a valid email!");
    }
    else {
        alert("Registration Successful!");
    }
};
