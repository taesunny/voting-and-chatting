package com.sunny.votingandchatting.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VotingsController {
    @RequestMapping(value = ["/api/v1/available"])
    fun available(): String? {
        return "It's available - api controller"
    }

    @RequestMapping(value = ["/api/vi/voting"])
    fun checkedOut(): String? {
        return "Checked out - api controller"
    }
}