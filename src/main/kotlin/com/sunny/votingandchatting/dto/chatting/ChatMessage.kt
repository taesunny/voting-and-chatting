package com.sunny.votingandchatting.dto.chatting

class ChatMessage(votingRoomId: Long, sender: String, type: ChatMessageType, message: String) {
    var votingRoomId: Long = votingRoomId
    var sender: String = sender
    var type: ChatMessageType = type
    var message: String = message
}