# Rest-Assured-Proyect
1. GET
Solicita un recurso del servidor sin modificarlo.

Respuestas posibles:
2xx: Éxito
200 OK: La solicitud se realizó correctamente y se devolvió el recurso.
204 No Content: La solicitud se realizó correctamente, pero no hay contenido para devolver.
3xx: Redirecciones
301 Moved Permanently: El recurso se movió de forma permanente a una nueva URL.
302 Found: El recurso se movió temporalmente a otra URL.
304 Not Modified: El recurso no ha cambiado desde la última solicitud (usado con caché).
4xx: Errores del cliente
400 Bad Request: La solicitud es inválida.
401 Unauthorized: Falta autenticación.
403 Forbidden: No tienes permiso para acceder al recurso.
404 Not Found: El recurso no fue encontrado.
5xx: Errores del servidor
500 Internal Server Error: Error general del servidor.
503 Service Unavailable: El servidor no está disponible.
2. POST
Envía datos al servidor para crear un nuevo recurso.

Respuestas posibles:
2xx: Éxito
200 OK: La solicitud se procesó correctamente y puede incluir información adicional.
201 Created: El recurso fue creado exitosamente.
202 Accepted: La solicitud fue aceptada pero aún no se ha procesado.
204 No Content: La solicitud fue procesada, pero no hay contenido en la respuesta.
3xx: Redirecciones
301 Moved Permanently: El recurso creado fue movido a otra URL.
302 Found: El recurso está temporalmente en otra URL.
4xx: Errores del cliente
400 Bad Request: Los datos enviados son inválidos.
401 Unauthorized: No estás autenticado.
403 Forbidden: No tienes permisos para realizar esta acción.
409 Conflict: Conflicto al intentar crear el recurso, por ejemplo, si ya existe.
5xx: Errores del servidor
500 Internal Server Error: Error general del servidor.
503 Service Unavailable: El servidor no puede procesar la solicitud en este momento.
3. PUT
Actualiza o reemplaza un recurso existente, o lo crea si no existe.

Respuestas posibles:
2xx: Éxito
200 OK: El recurso se actualizó correctamente.
201 Created: El recurso fue creado porque no existía.
204 No Content: La solicitud fue exitosa, pero no hay contenido en la respuesta.
4xx: Errores del cliente
400 Bad Request: Datos inválidos enviados en la solicitud.
401 Unauthorized: No estás autenticado.
403 Forbidden: No tienes permiso para modificar este recurso.
404 Not Found: El recurso no existe y el servidor no lo puede crear.
409 Conflict: Conflicto al intentar actualizar el recurso.
5xx: Errores del servidor
500 Internal Server Error: Error general del servidor.
503 Service Unavailable: El servidor no puede procesar la solicitud.
4. PATCH
Actualiza parcialmente un recurso existente.

Respuestas posibles:
2xx: Éxito
200 OK: El recurso se actualizó parcialmente.
204 No Content: La solicitud fue exitosa, pero no hay contenido en la respuesta.
4xx: Errores del cliente
400 Bad Request: Datos inválidos enviados en la solicitud.
401 Unauthorized: No estás autenticado.
403 Forbidden: No tienes permiso para modificar este recurso.
404 Not Found: El recurso no existe.
409 Conflict: Conflicto al intentar actualizar parcialmente el recurso.
5xx: Errores del servidor
500 Internal Server Error: Error general del servidor.
503 Service Unavailable: El servidor no puede procesar la solicitud.
5. DELETE
Elimina un recurso del servidor.

Respuestas posibles:
2xx: Éxito
200 OK: El recurso fue eliminado y se devuelve información adicional.
202 Accepted: La solicitud fue aceptada, pero el recurso aún no se eliminó.
204 No Content: El recurso fue eliminado exitosamente, sin contenido en la respuesta.
4xx: Errores del cliente
400 Bad Request: La solicitud no es válida.
401 Unauthorized: No estás autenticado.
403 Forbidden: No tienes permisos para eliminar el recurso.
404 Not Found: El recurso no existe.
5xx: Errores del servidor
500 Internal Server Error: Error general del servidor.
503 Service Unavailable: El servidor no puede procesar la solicitud.
6. OPTIONS
Obtiene información sobre las opciones de comunicación disponibles para un recurso.

Respuestas posibles:
2xx: Éxito
204 No Content: Solicitud exitosa; se devuelven encabezados con las opciones disponibles.
4xx: Errores del cliente
403 Forbidden: No tienes permiso para consultar las opciones.
5xx: Errores del servidor
500 Internal Server Error: Error general del servidor.
7. HEAD
Solicita información sobre un recurso, pero sin devolver el cuerpo.

Respuestas posibles:
2xx: Éxito
200 OK: Solicitud exitosa; se devuelven solo los encabezados.
204 No Content: Solicitud exitosa, pero no hay contenido asociado.
4xx: Errores del cliente
400 Bad Request: Solicitud inválida.
401 Unauthorized: No estás autenticado.
403 Forbidden: No tienes permisos para realizar esta acción.
404 Not Found: El recurso no existe.
5xx: Errores del servidor
500 Internal Server Error: Error general del servidor.