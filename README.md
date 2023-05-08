# Challenge-ONE-Foro-Alura-API

<p align="center" >
     <img width="200" heigth="200" src="https://user-images.githubusercontent.com/91544872/209678377-70b50b21-33de-424c-bed8-6a71ef3406ff.png">
</p>

¡Hola a todos! Soy Bryant Baptista, bienvenidos a este nuevo desafio sobre el Foro Alura, una API hecha para gestionar bases de datos,
eso con las funciones basicas basadas en el acronimo CRUD (traducido al español como Crear, Leer/Listar, Actualizar y Borrar/Eliminar), todo esto diseñado mediante el lenguaje de programacion Java y su framework llamado Spring.
La idea para realizar este challenge es gracias al programa ONE y a la gente de Oracle/Alura LATAM.

#Tecnologías utilizadas 🖥️:

<ul>
     <li>Java ☕</li>
     <li>Eclipse 🌘/Intellij IDEA ⌨️</li>
     <li>MySQL 🐬</li>
     <li>Spring Framework 🍃</li>
     <li>Insomnia 👁️/Postman 🧑‍🚀</li>
</ul>

#Explicación del funcionamiento del programa

Mediante programas o herramientas para hacer pruebas de API tales como Insomnia o Postman se tienen como HTTP Requests las funciones CRUD anteriormente mencionadas, tanto para registrar tópicos como para listar, actualizar, borrar o inclusive obtener datos de un tópico en específico, esto haciendo una búsqueda mediante el ID del mismo.

![Screenshot 2023-05-08 152334](https://user-images.githubusercontent.com/119342788/236915847-57f9db6d-1f34-4bc2-9dcd-b23e48386d74.png)

Para el POST Mapping hay que colocar los datos requeridos para añadir un tópico nuevo, entre esos datos tenemos:

<ul>
     <li>Titulo</li>
     <li>Mensaje</il>
     <li>Autor</li>
     <li>Curso</li>
</ul>

![Screenshot 2023-05-08 152818](https://user-images.githubusercontent.com/119342788/236918325-6c3ab30f-e554-4db6-b5ad-1bee485618d6.png)

En caso de que no hayamos agregado algún parámetro o hayan datos duplicados (para el título y mensaje) no guardará los datos y se tendrán que colocar nuevamente esta vez de manera correcta.


