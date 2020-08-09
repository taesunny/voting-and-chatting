package com.sunny.votingandchatting.repository

import com.sunny.votingandchatting.domain.Voting
import org.springframework.data.jpa.repository.JpaRepository

interface VotingRepository: JpaRepository<Voting, Long> {
    fun findAllByIdOrderByCreatedAtDesc(votingId: Long?): List<Voting?>?
}