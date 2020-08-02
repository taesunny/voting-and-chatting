package com.sunny.votingandchatting.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.sunny.votingandchatting.domain.VotingRoom
import mu.KotlinLogging
import org.springframework.stereotype.Service
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import java.io.IOException
import java.time.LocalDateTime
import java.util.*
import javax.annotation.PostConstruct

@Service
class ChatService {
    private val objectMapper: ObjectMapper? = null
    private var votingRooms: MutableMap<Long, VotingRoom>? = null
    private val logger = KotlinLogging.logger {}

    @PostConstruct
    private fun init() {
        votingRooms = LinkedHashMap<Long, VotingRoom>()
    }

    fun findAllRoom(): List<VotingRoom?> {
        return ArrayList<VotingRoom?>(votingRooms!!.values)
    }

    fun findVotingRoomById(votingRoomId: Long): VotingRoom? {
        return votingRooms!![votingRoomId]
    }

    fun createRoom(name: String, description: String?): VotingRoom {
        var randomId: Long  = Random().nextLong()

        // temp
        val chatRoom: VotingRoom = VotingRoom(randomId, name, description, LocalDateTime.now())
        votingRooms!![randomId] = chatRoom
        return chatRoom
    }

    fun <T> sendMessage(session: WebSocketSession, message: T) {
        try {
            session.sendMessage(TextMessage(objectMapper!!.writeValueAsString(message)))
        } catch (e: IOException) {
            logger.error(e.message, e)
        }
    }
}