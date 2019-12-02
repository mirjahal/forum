package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @GetMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programacao"));

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }

}
