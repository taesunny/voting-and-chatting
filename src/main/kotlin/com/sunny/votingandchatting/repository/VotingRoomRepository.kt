package com.sunny.votingandchatting.repository

import com.sunny.votingandchatting.domain.VotingRoom
import org.springframework.data.jpa.repository.JpaRepository

interface VotingRoomRepository: JpaRepository<VotingRoom, Long> {
    fun findAllByIdOrderByCreatedAtDesc(votingRoomId: Long?): List<VotingRoom?>?
}