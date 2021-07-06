package br.com.mvm.ws_test.repository

import br.com.mvm.ws_test.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long>