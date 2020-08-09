package com.sunny.votingandchatting.dto.chatting

import com.sunny.votingandchatting.service.ChatService
import org.springframework.web.socket.WebSocketSession
import java.util.*

class ChattingDto (private val votingId: String, private val name: String) {
    private val sessions: MutableSet<WebSocketSession> = HashSet()

    fun handleActions(session: WebSocketSession, chatMessage: ChatMessage, chatService: ChatService) {
        if (chatMessage.type == ChatMessageType.ENTER) {
            sessions.add(session)
            chatMessage.message = "User " + chatMessage.sender + " entered."
        }

        sendMessage<Any>(chatMessage, chatService)
    }

    private fun <T> sendMessage(message: T, chatService: ChatService) {
        sessions.parallelStream().forEach { session: WebSocketSession? ->
            if (session != null) {
                chatService.sendMessage(session, message)
            }
        }
    }
}