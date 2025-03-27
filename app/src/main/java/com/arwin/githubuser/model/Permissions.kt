package com.arwin.githubuser.model

data class Permissions(
    var admin: Boolean?,
    var maintain: Boolean?,
    var pull: Boolean?,
    var push: Boolean?,
    var triage: Boolean?
)