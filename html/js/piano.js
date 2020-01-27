var map = {}; // You could also use an array
onkeydown = onkeyup = function(e){
    e = e || event; // to deal with IE
    map[e.keyCode] = e.type == 'keydown';
    /* insert conditional here */
}

//Different code

document.onkeydown = keydown; 

function keydown (evt) { 

    if (!evt) evt = event; 

    if (evt.ctrlKey && evt.altKey && evt.keyCode === 115) {

        console.log("This works!")

    } else if (evt.shiftKey && evt.keyCode === 9) { 

        console.log("This works!2")

    } 

}