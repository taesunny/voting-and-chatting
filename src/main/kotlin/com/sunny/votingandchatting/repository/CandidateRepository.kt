package com.sunny.votingandchatting.repository

import com.sunny.votingandchatting.domain.Candidate
import org.springframework.data.jpa.repository.JpaRepository

interface CandidateRepository: JpaRepository<Candidate, Long> {
    fun findAllByVotingRoomIdOrderByCreatedAtDesc(votingRoomId: Long?): List<Candidate?>?
    fun deleteAllByVotingRoomId(votingRoomId: Long)
}