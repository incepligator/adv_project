
var express = require('express');
var app = express();
var portNumber=4200;

//static path initialized
app.use("/", express.static(__dirname + "/"));

//Routes
app.get('/', function (req, res) {
    res.redirect('/app/views/index.html');
});


//Launching server
app.listen(portNumber, function (req,res) {
    console.log("Opening port"+portNumber);
 });