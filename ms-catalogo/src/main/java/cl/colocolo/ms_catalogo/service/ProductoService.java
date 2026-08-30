package cl.colocolo.ms_catalogo.service;

import cl.colocolo.ms_catalogo.dto.ProductoRequest;
import cl.colocolo.ms_catalogo.dto.ProductoResponse;
import cl.colocolo.ms_catalogo.mapper.ProductoMapper;
import cl.colocolo.ms_catalogo.model.Producto;
import cl.colocolo.ms_catalogo.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository repository;
    private final ProductoMapper mapper;

    public ProductoResponse crearProducto(ProductoRequest request) {
        Producto producto = mapper.toEntity(request);
        Producto guardado = repository.save(producto);
        return mapper.toResponse(guardado);
    }

    public List<ProductoResponse> obtenerTodos() {
        return repository.findAll().stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }
}