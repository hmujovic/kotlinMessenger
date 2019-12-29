package com.example.kotlinmessenger.models

class ChatMessage(val Id:String,val text:String,val fromId:String,val toId:String,val timestamp:Long)
{
    constructor():this("","","","", -1)
}