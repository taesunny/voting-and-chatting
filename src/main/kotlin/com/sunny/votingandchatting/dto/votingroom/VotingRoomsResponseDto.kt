package com.sunny.votingandchatting.dto.votingroom

import com.sunny.votingandchatting.domain.VotingRoom
import java.time.LocalDateTime

class VotingRoomsResponseDto(entity: VotingRoom) {
    var id: Long? = entity.id
    var name: String = entity.name
    var description: String? = entity.description
    var createdAt: LocalDateTime = entity.createdAt
}