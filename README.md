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
     <li>Spring Security 🛡️</li>
     <li>Insomnia 👁️/Postman 🧑‍🚀</li>
     <li>Token JWT 🔐</li>
</ul>

# Explicación sobre el funcionamiento del programa: 1era Parte del Desafío

Mediante programas o herramientas para hacer pruebas de API tales como Insomnia o Postman se tienen como HTTP Requests las funciones CRUD anteriormente mencionadas, tanto para registrar tópicos como para listar, actualizar, borrar o inclusive obtener datos de un tópico en específico, esto haciendo una búsqueda mediante el ID del mismo.

![HTTP Requests](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/5f45b221-9dca-48ad-8563-645ff64e4e17)

<hr>

Para el POST Mapping (así como para las demás requests) hay que colocar la URL de la base de datos para guardar el registro y los datos requeridos (en formato JSON) para añadir un tópico nuevo, entre esos datos tenemos:

<ul>
     <li>Título</li>
     <li>Mensaje</li>
     <li>Autor</li>
     <li>Curso</li>
</ul>

![POST Mapping](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/1a399d93-97b1-4e9e-9b5c-8ed8580f116f)

En caso de que no hayamos agregado algún parámetro (Error 400: Bad Request) o hayan datos duplicados (para el título y mensaje) no guardará los datos y se tendrán que colocar nuevamente esta vez de manera correcta.

<hr>

Después de haber agregado un tópico podremos hacer uso del GET Mapping, para esta ocasión con solo colocar la URL obtendremos la lista de los tópicos añadidos hasta el momento:

![GET Mapping](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/4f6a22a9-6d53-437e-81fb-59d4bc3b7856)

<hr>

Ahora, para hacer algún cambio a algún topico solo hace falta acceder a la URL haciendo uso del PUT Mapping y escribir en formato JSON el número del ID junto con los datos que quiero modificar, teniendo como ejemplo la imagen que se encuentra abajo:

![PUT Mapping](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/f643f3a9-3e60-45f9-86b7-32ef77f0988b)

<hr>

Así mismo tenemos lo que sería el DELETE Mapping, como se hizo mención anteriormente esto funciona para borrar un registro en específico, para ello solo hace falta hacer el request y añadir el URL seguido del número de ID del tópico que se quiere eliminar, como ejemplo teniendo lo siguiente: 

![DELETE Mapping](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/025dfbc7-4a7c-4644-84b2-d3444aae3a2d)

<hr>

Por último se encuentra el GET Mapping para buscar un tópico en específico, esto se hace nada más colocando al final de la URL el ID del tópico el cual queremos consultar y obtener información:

![GET Mapping ID](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/4830c57a-f88f-4df3-ae97-acca22d25bca)

En caso de haber colocado un ID que no exista se le notificará al usuario el no haber encontrado resultado alguno mediante un Error 404.

# Explicación sobre el funcionamiento del programa: 2da Parte del Desafío

A partir de este momento, después de haber logrado la primera parte del desarrollo y para seguir mejorando la API se decidió en hacer una sección para que cada persona pueda crear una cuenta y hacer Login en la aplicación, para ello se recurrió en crear una nueva tabla para almacenar la información de todos los usuarios; así mismo y por razones de seguridad se le agregó una forma de autenticación llamada JSON Web Token (JWT por sus siglas en inglés) junto con la dependencia que nos proporciona o nos facilita el framework llamada Spring Security.

![JWT](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/5698902a-e7ae-4980-8052-02dd3da6e995)
![Spring Security](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/f9687d29-c621-4789-8619-b29c681c1392)

Una vez creada la cuenta colocamos los datos en formato JSON en un POST Mapping creado de nombre "Login de Usuario" para luego generar un token:

![POST Mapping Login JWTtoken](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/40ee3241-a947-4c36-9318-e56cb8451c37)

Con este token que hemos obtenido tenemos dos temas: lo primero es que efectivamente se ha validado la cuenta del usuario, y segundo, al colocar todos estos caracteres en la sección de autenticación poseemos el permiso para realizar las funciones de crear, listar, modificar y borrar tópicos que se requieran, como por ejemplo:

![Ejemplo GET Mapping JWTtoken](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/7ac27630-76dd-43df-98a5-813326267e81)

De no haber puesto un token válido o inclusive no haber colocado un token nos aparecerá el siguiente error:

![Error 403 Forbidden](https://github.com/BryantLBP/Challenge-ONE-Foro-Alura-API/assets/119342788/a4df9e49-a742-4417-9cdf-00416daba78d)

Para finalizar y como resumen ya tenemos lo que sería la API del Foro Alura (de una manera básica), comenzando por crear los RequestMapping's para el CRUD, construyendo las bases de datos para la aplicación y realizando los métodos de autenticación para agregar una capa de seguridad a las cuentas de los usuarios.
