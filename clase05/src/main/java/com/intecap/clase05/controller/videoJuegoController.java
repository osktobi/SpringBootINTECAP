package com.intecap.clase05.controller;

import com.intecap.clase05.model.videoJuegoModel;
import com.intecap.clase05.service.videoJuegoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/videojuegos")
public class videoJuegoController {
    private final videoJuegoService service;

    public videoJuegoController(videoJuegoService service){
        this.service = service;
    }

    @GetMapping
    public List<videoJuegoModel> listarTodos(){
        return service.obtenerTodos();
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody videoJuegoModel videoJuego, BindingResult result){
        if(result.hasErrors()){
            Map<String, String> errores = new LinkedHashMap<>();
            result.getFieldErrors().forEach(e ->
                    errores.put(e.getField(), e.getDefaultMessage())
            );
            return ResponseEntity.badRequest().body(errores);
        }
        service.guardar(videoJuego);
        return  ResponseEntity.ok("Guardado con exito");
    }
}
