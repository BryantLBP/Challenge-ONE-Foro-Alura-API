package foro.alura.api.domain.topico;

import java.time.LocalDateTime;

public record DatosListaTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, Estatus estatus, String autor, String curso) {

	public DatosListaTopico(Topico topico) {
		this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getfechaCreacion(), topico.getEstatus(),
				topico.getAutor(), topico.getCurso());
	}
	
}
