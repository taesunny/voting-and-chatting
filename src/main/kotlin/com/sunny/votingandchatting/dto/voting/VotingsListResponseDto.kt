package com.sunny.votingandchatting.dto.voting

import com.sunny.votingandchatting.domain.Voting
import java.time.LocalDateTime

class VotingsListResponseDto(entity: Voting) {
    var id: Long? = entity.id
    var name: String = entity.name
    var description: String? = entity.description
    var createdAt: LocalDateTime = entity.createdAt
}