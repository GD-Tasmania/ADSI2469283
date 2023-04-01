const express = require('express');
const mongoose= require('mongoose');

const dotenv = require('dotenv').config();

const app = express();
const port = process.env.PORT || 3000;

//routes
app.get('/',(req,res)=>{
    res.send("Work Services")
})

//mongoDB connection
mongoose.set('strictQuery', true);

mongoose
.connect(process.env.MONGODB_URI)
    .then(()=> console.log('Connected to MongoDB'))
    .catch((error)=>console.error(error))


app.listen(port, () => console.log("server in port ",port))