package com.arwin.githubuser.model

data class SearchUserResult(
    var incomplete_results: Boolean?,
    var items: List<Item?>?,
    var total_count: Int?
)