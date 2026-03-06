package com.intecap.clase05.controller;

import com.intecap.clase05.model.farmaciaModel;
import com.intecap.clase05.service.farmaciaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/farmacia")
public class farmaciaController {
    private final farmaciaService service;

    public farmaciaController (farmaciaService service){
        this.service = service;
    }

    @GetMapping
    public List<farmaciaModel> listarTodos(){
        return service.obtenerTodos();
    }

    @PostMapping
    public ResponseEntity<?> crear(@Valid @RequestBody farmaciaModel farmacia, BindingResult result){
        if(result.hasErrors()){
            Map<String, String> errores = new LinkedHashMap<>();
            result.getFieldErrors().forEach(e ->
                    errores.put(e.getField(), e.getDefaultMessage())
            );
            return ResponseEntity.badRequest().body(errores);
        }
        service.guardar(farmacia);
        return ResponseEntity.ok("Guardado con exito");
    }
}
