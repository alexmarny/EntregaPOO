Un autor independiente desea crear un pequeño programa de consola en JAVA almacenar información de sus
libros favoritos. Este mostrará un menú como el siguiente continuamente hasta que el usuario decida salir:
#	|----------------------------------------------|
#	| MIS LIBROS |
#	|----------------------------------------------|
#	1) Nuevo almacén de libros
#	2) Establecer ritmo de lectura (páginas por minuto)
#	3) Añadir un nuevo libro al almacén
#	4) Mostrar información actual de libros
#	5) Salir (se borrará toda la información)
#	|----------------------------------------------|
Seleccione una opción (1-4):
Las opciones del programa permiten realizar lo siguiente:
#	1. Crear un nuevo array de Libros vacío (todos sus elementos son null) del tamaño especificado por el
#	usuario por teclado. Se perderá cualquier instancia anterior que hubiera.
#	2. Permite introducir ritmo de lectura en páginas por minuto. Por defecto se establecerá a 1 este ritmo.
#	3. Permitirá añadir un nuevo Libro al Almacén. Para ello se pedirá toda la información necesaria de forma
#	robusta al usuario por consola (información del Libro y del Autor). Se deberá comprobar si se han
#	insertado libros en posiciones anteriores del array e insertar la nueva instancia en el lugar adecuado.
#	Puedes utilizar atributos auxiliares en el Almacén para indicar cuántos libros se han añadido hasta
#	entonces (ojo, no confundir atributo length de un array con las instancias != null que contiene).
#	4. Mostrar en formato tabla la información actual de los libros almacenados en el Almacén.
#	5. Salir del programa.

Se deberán crear las clases Almacén (que contiene un array de libros de tamaño fijo inicial), Libro y Autor en un
paquete llamado modelo. La aplicación tendrá otra clase App.java que será la que orqueste la ejecución del
programa y usará las clases anteriores para su funcionamiento. La información de las clases es la siguiente:
# ● Almacen: array de Libro.
# ● Libro: Autor, título, año de publicación, número de páginas, precio.
# ● Autor: nombre, apellidos, premioPlaneta (booleano).

Tras esto se le presentará al usuario una tabla como la siguiente:
#	|-----------------------------------------------------------------------------------------------------------------------|
#	| LIBROS EN EL ALMACÉN |
#	|-----------------------------------------------------------------------------------------------------------------------|
#	| Título | Año Publicación | Autor | Premio planeta | Páginas | Tiempo lectura minutos | Precio|
#	|-----------------------------------------------------------------------------------------------------------------------|
#	| Libro 1 | 1950 | Nombre Apellidos | Sí | 100 | 100| 2.89 € |
#	(…suponemos más libros) ……
#	| Libro 1 | 1950 | Nombre Apellidos | Sí | 100 | 100 | 3.89 € |
#	|-----------------------------------------------------------------------------------------------------------------------|
#	| Tiempo de lectura total del almacén: 400 min | |
#	| Valor total del almacén: 200.5 € |
#	|-----------------------------------------------------------------------------------------------------------------------|

