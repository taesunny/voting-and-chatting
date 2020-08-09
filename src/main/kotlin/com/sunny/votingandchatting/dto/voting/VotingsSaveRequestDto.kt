package com.sunny.votingandchatting.dto.voting

import com.sunny.votingandchatting.domain.Voting

class VotingsSaveRequestDto(name: String, description: String, candidate: List<String>) {
    var name: String = name
    var description: String = description
    var candidate: List<String> = candidate

    fun toEntity(creatorId: String):Voting {
        return Voting(name, description)
    }
}