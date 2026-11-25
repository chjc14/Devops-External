
document.getElementById("pizzaForm").onsubmit = function(e) {
    e.preventDefault();

    let name = document.getElementById("name").value;
    let phone = document.getElementById("phone").value;
    let size = document.getElementById("size").value;
    let topping = document.getElementById("topping").value;
    let quantity = document.getElementById("quantity").value;
    let address = document.getElementById("address").value;

    if (name == "" || phone == "" || size == "" ||
        topping == "" || quantity == "" || address == "") {
        alert("Please fill all fields!");
    }
    else if (phone.length != 10 || isNaN(phone)) {
        alert("Enter a valid 10-digit phone number!");
    }
    else if (quantity <= 0) {
        alert("Enter a valid quantity!");
    }
    else {
        alert("Pizza Order Placed Successfully!");
    }
};
