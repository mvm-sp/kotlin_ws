package br.com.mvm.ws_test.controller
import br.com.mvm.ws_test.model.Note
import br.com.mvm.ws_test.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("notes")
class NoteController {

    //Becouse we use @RestController annotation we don't need @ResponseBody in none methods anymore
    @Autowired
    lateinit var noteRepository: NoteRepository

    @GetMapping("{id}")
    fun item(@PathVariable id: Long): Optional<Note> {
        return noteRepository.findById(id)
    }

    @GetMapping
    fun list(): List<Note> {
        return noteRepository.findAll().toList()
    }
    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return noteRepository.save(note)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody note: Note): Note {
        if (noteRepository.existsById(id)) {
            val safeNote = note.copy(id)
            return noteRepository.save(safeNote)
        }
        return Note()
    }
    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long): String {
        if (noteRepository.existsById(id)) {
            noteRepository.deleteById(id)
            return "object $id deleted"
        }
        return "object $id not found"
    }
}