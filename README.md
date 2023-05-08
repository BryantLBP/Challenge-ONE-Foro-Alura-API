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

Para el POST Mapping (asi como para las demas requests) hay que colocar la URL de la base de datos para guardar el registro y los datos requeridos (en formato JSON) para añadir un tópico nuevo, entre esos datos tenemos:

<ul>
     <li>Titulo</li>
     <li>Mensaje</il>
     <li>Autor</li>
     <li>Curso</li>
</ul>

![Screenshot 2023-05-08 152818](https://user-images.githubusercontent.com/119342788/236918325-6c3ab30f-e554-4db6-b5ad-1bee485618d6.png)

En caso de que no hayamos agregado algún parámetro o hayan datos duplicados (para el título y mensaje) no guardará los datos y se tendrán que colocar nuevamente esta vez de manera correcta.

Despues de haber agregado un topico podremos hacer uso del GET Mapping, para esta ocasion con solo colocar la URL obtendremos la lista de los topicos añadidos hasta el momento:

![Screenshot 2023-05-08 152907](https://user-images.githubusercontent.com/119342788/236920796-9c16d4e5-1e6f-4307-9788-dcaa50d0485e.png)

Ahora, para hacer algún cambio a algún topico solo hace falta acceder a la URL haciendo uso del PUT Mapping y escribir en formato JSON el número del ID junto con los datos que quiero modificar, teniendo como ejemplo la imagen que se encuentra abajo:

![Screenshot 2023-05-08 153047](https://user-images.githubusercontent.com/119342788/236927754-f55b722d-f1b7-4cdf-8146-0997e5103580.png)

Así mismo tenemos lo que sería el DELETE Mapping, como se hizo mención anteriormente esto funciona para borrar un registro en específico, para ello solo hace falta hacer el request y añadir el URL seguido del número de ID del tópico que se quiere eliminar, como ejemplo teniendo lo siguiente: 

![Screenshot 2023-05-08 153143](https://user-images.githubusercontent.com/119342788/236930133-8657e638-8f6b-4d0d-a208-5ebb0594f2ab.png)
