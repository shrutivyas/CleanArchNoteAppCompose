package com.brainjug.cleanarchnoteappcompose.feature_note.domain.use_case

import com.brainjug.cleanarchnoteappcompose.feature_note.domain.model.Note
import com.brainjug.cleanarchnoteappcompose.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()){

        }
        repository.insertNote(note)
    }

}