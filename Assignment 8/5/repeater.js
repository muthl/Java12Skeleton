document.addEventListener('DOMContentLoaded', ready);

function ready() {
    let input_one = document.getElementById("input_one");       //
    let input_two = document.getElementById("input_two");

    input_one.addEventListener("input", changeHandler);     //watches for change and copies what is entered
    input_two.addEventListener("input", changetwo)

    function changeHandler(event) { //on event change
        input_two.value = input_one.value;   //change this value
    }
    function changetwo(event) {
        input_one.value = input_two.value;
    }
}

