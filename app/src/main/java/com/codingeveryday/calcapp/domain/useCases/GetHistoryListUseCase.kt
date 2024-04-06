package com.codingeveryday.calcapp.domain.useCases

import com.codingeveryday.calcapp.domain.entities.HistoryItem
import com.codingeveryday.calcapp.domain.interfaces.HistoryManagerInterface
import javax.inject.Inject

class GetHistoryListUseCase @Inject constructor(private val repository: HistoryManagerInterface) {
    operator fun invoke(): List<HistoryItem> {
        return repository.getHistoryList()
    }
}