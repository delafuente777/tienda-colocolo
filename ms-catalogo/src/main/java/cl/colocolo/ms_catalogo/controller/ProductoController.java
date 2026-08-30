package cl.colocolo.ms_catalogo.controller;

import cl.colocolo.ms_catalogo.dto.ProductoRequest;
import cl.colocolo.ms_catalogo.dto.ProductoResponse;
import cl.colocolo.ms_catalogo.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoResponse crear(@RequestBody ProductoRequest request) {
        return service.crearProducto(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoResponse> listarTodos() {
        return service.obtenerTodos();
    }
}