package com.sunny.votingandchatting.dto.votingroom

import com.sunny.votingandchatting.domain.VotingRoom

class VotingRoomsSaveRequestDto(name: String, description: String, candidate: List<String>) {
    var name: String = name
    var description: String = description
    var candidate: List<String> = candidate

    fun toEntity(creatorId: String):VotingRoom {
        return VotingRoom(name, description)
    }
}