# Challenge-ONE-Foro-Alura-API

<p align="center" >
     <img width="200" heigth="200" src="https://user-images.githubusercontent.com/91544872/209678377-70b50b21-33de-424c-bed8-6a71ef3406ff.png">
</p>

¡Hola a todos! Soy Bryant Baptista, bienvenidos a este nuevo desafío sobre el Foro Alura, una API hecha para gestionar bases de datos,
eso con las funciones básicas basadas en el acrónimo CRUD (traducido al español como Crear, Leer/Listar, Actualizar y Borrar/Eliminar), todo esto diseñado mediante el lenguaje de programación Java y su framework llamado Spring.
La idea para realizar este challenge es gracias al programa ONE y a la gente de Oracle/Alura LATAM.

# Tecnologías utilizadas 🖥️:

<ul>
     <li>Java ☕</li>
     <li>Eclipse 🌘/Intellij IDEA ⌨️</li>
     <li>MySQL 🐬</li>
     <li>Spring Framework 🍃</li>
     <li>Insomnia 👁️/Postman 🧑‍🚀</li>
</ul>

# Explicación sobre el funcionamiento del programa

Mediante programas o herramientas para hacer pruebas de API tales como Insomnia o Postman se tienen como HTTP Requests las funciones CRUD anteriormente mencionadas, tanto para registrar tópicos como para listar, actualizar, borrar o inclusive obtener datos de un tópico en específico, esto haciendo una búsqueda mediante el ID del mismo.

![Screenshot 2023-05-08 152334](https://user-images.githubusercontent.com/119342788/236915847-57f9db6d-1f34-4bc2-9dcd-b23e48386d74.png)

<hr>

Para el POST Mapping (así como para las demás requests) hay que colocar la URL de la base de datos para guardar el registro y los datos requeridos (en formato JSON) para añadir un tópico nuevo, entre esos datos tenemos:

<ul>
     <li>Título</li>
     <li>Mensaje</li>
     <li>Autor</li>
     <li>Curso</li>
</ul>

![Screenshot 2023-05-08 152818](https://user-images.githubusercontent.com/119342788/236918325-6c3ab30f-e554-4db6-b5ad-1bee485618d6.png)

En caso de que no hayamos agregado algún parámetro (Error 400: Bad Request) o hayan datos duplicados (para el título y mensaje) no guardará los datos y se tendrán que colocar nuevamente esta vez de manera correcta.

<hr>

Después de haber agregado un tópico podremos hacer uso del GET Mapping, para esta ocasión con solo colocar la URL obtendremos la lista de los tópicos añadidos hasta el momento:

![Screenshot 2023-05-08 152907](https://user-images.githubusercontent.com/119342788/236920796-9c16d4e5-1e6f-4307-9788-dcaa50d0485e.png)

<hr>

Ahora, para hacer algún cambio a algún topico solo hace falta acceder a la URL haciendo uso del PUT Mapping y escribir en formato JSON el número del ID junto con los datos que quiero modificar, teniendo como ejemplo la imagen que se encuentra abajo:

![Screenshot 2023-05-08 153047](https://user-images.githubusercontent.com/119342788/236927754-f55b722d-f1b7-4cdf-8146-0997e5103580.png)

<hr>

Así mismo tenemos lo que sería el DELETE Mapping, como se hizo mención anteriormente esto funciona para borrar un registro en específico, para ello solo hace falta hacer el request y añadir el URL seguido del número de ID del tópico que se quiere eliminar, como ejemplo teniendo lo siguiente: 

![Screenshot 2023-05-08 153143](https://user-images.githubusercontent.com/119342788/236930133-8657e638-8f6b-4d0d-a208-5ebb0594f2ab.png)

<hr>

Por último se encuentra el GET Mapping para buscar un tópico en específico, esto se hace nada más colocando al final de la URL el ID del tópico el cual queremos consultar y obtener información:

![Screenshot 2023-05-08 153249](https://user-images.githubusercontent.com/119342788/236931264-0eb21835-a30b-4d76-a0a1-bfbb76260e21.png)

En caso de haber colocado un ID que no exista se le notificará al usuario el no haber encontrado resultado alguno mediante un Error 404.
