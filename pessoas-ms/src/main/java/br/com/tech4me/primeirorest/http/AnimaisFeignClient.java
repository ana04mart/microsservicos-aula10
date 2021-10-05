package br.com.tech4me.primeirorest.http;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tech4me.primeirorest.compartilhado.AnimalDto;

@FeignClient (name = "animais-ms")
public interface AnimaisFeignClient {
    
    @GetMapping(path = "/api/animais/{idDono}/lista")

    List<AnimalDto> obterAnimais (@PathVariable String idDono);

}
