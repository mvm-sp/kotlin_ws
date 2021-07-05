package br.com.mvm.ws_test.controller
import br.com.mvm.ws_test.model.Note
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("notes")
class NoteController {

    //Becouse we use @RestController annotation we don't need @ResponseBody in none methods anymore

    @GetMapping
    fun list(): List<Note> {
        return listOf(Note("Leitura", "Livro de Spring Boot"),
            Note("Pesquisa", "Ambiente com Docker"))
    }

}