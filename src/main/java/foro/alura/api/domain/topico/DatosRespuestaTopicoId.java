package foro.alura.api.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopicoId(
		String titulo,
		String mensaje,
		LocalDateTime fechaCreacion,
		Estatus estatus,
		String autor,
		String curso) {

}
