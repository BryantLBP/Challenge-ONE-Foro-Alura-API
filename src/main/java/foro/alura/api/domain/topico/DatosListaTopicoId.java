package foro.alura.api.domain.topico;

import java.time.LocalDateTime;

public record DatosListaTopicoId(String titulo, String mensaje, LocalDateTime fechaCreacion, Estatus estatus, String autor, String curso) {

	public DatosListaTopicoId(Topico topico) {
		this(topico.getTitulo(), topico.getMensaje(), topico.getfechaCreacion(), topico.getEstatus(),
				topico.getAutor(), topico.getCurso());
	}
	
}
