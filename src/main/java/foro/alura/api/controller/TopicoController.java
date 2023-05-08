package foro.alura.api.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import foro.alura.api.domain.topico.DatosActualizarTopico;
import foro.alura.api.domain.topico.DatosListaTopico;
import foro.alura.api.domain.topico.DatosRegistroTopico;
import foro.alura.api.domain.topico.DatosRespuestaTopico;
import foro.alura.api.domain.topico.DatosRespuestaTopicoId;
import foro.alura.api.domain.topico.Topico;
import foro.alura.api.domain.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@PostMapping
	@Transactional
	public ResponseEntity <DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico,
			UriComponentsBuilder uriComponentsBuilder) {
		Topico topico = topicoRepository.save(new Topico(datosRegistroTopico));
		DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(topico.getTitulo(), topico.getMensaje(),
				topico.getAutor(), topico.getCurso());
		
		URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(url).body(datosRespuestaTopico);
	}
	
	@GetMapping
	public ResponseEntity <Page<DatosListaTopico>> listadoTopicos(@PageableDefault(size = 5) Pageable paginacion) {
		var page = topicoRepository.findAll(paginacion).map(DatosListaTopico::new);
		return ResponseEntity.ok(page);
	}
	
	@PutMapping
	@Transactional
	public void actualizar(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
		Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
    	topico.actualizarDatos(datosActualizarTopico);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity eliminarTopico(@PathVariable Long id) {
		Topico topico = topicoRepository.getReferenceById(id);
		topicoRepository.delete(topico);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DatosRespuestaTopicoId> retornoDatosTopico(@PathVariable Long id) {
		Topico topico = topicoRepository.getReferenceById(id);
		var datosTopicoId = new DatosRespuestaTopicoId(topico.getTitulo(), topico.getMensaje(),
				topico.getfechaCreacion(), topico.getEstatus(), topico.getAutor(), topico.getCurso());
		return ResponseEntity.ok(datosTopicoId);
	}
	
}