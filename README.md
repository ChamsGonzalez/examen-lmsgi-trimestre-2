# Examen LMSGI Segundo Trimestre

## Formato de entrega

Crea un repositorio privado a partir de este, **asegurate de borrar el directorio .git** del mismo antes de intentar subirlo.

Debes hacer commits con frecuencia, esto **NO ES OPCIONAL**, es parte de la evaluación. No suma puntos, pero si los puede restar si eres descuidado, y en caso de estar al limite de aprobar o suspender, puede ser el factor decisivo de la nota final. Cuanto mas descriptivos sean los mensajes de tus commits, mejor, no te limites a enviar un mensaje por ejercicio, haz commits pequeños y frecuentes, con mensajes que expliquen claramente lo que has hecho en cada uno.

No modifiques la estructura del repositorio, debe seguir siendo la misma que ves aqui.

## Antes de empezar

0. Asegúrate de poder hacer un commit y un push a tu repositorio privado, para evitar problemas a la hora de entregar el examen.
1. Familiarízate con el repositorio, revisa los archivos y carpetas que contiene, y asegúrate de entender su estructura.
2. Arranca el servidor de desarrollo que se incluye en el repositorio.
3. Comprueba que el servidor funciona correctamente, utiliza el navegador o `httpie` para hacer peticiones a los endpoints disponibles y verificar que responden como se espera.

> Si comprobaste los endpoints con `httpie`, lee la sección *extra*, al final del examen.

4. Durante este examen se permite usar `snippets` personalizados para generar código como los vistos en clase.
5. Cualquier `snippet` que no sea para crear código y de alguna manera pueda interferir con la parte de teoría no está permitido, si se detecta durante el examen, se restarán puntos o se podrá suspender el examen dependiendo de la gravedad del caso.

## Práctica

En el repositorio encontrarás un servidor http que expone dos endpoints que te permiten insertar y recuperar mensajes de una base de datos.

Este servidor necesita un frontend para interactuar con la base de datos. Tendrás que integrar en el propio servidor un frontend con `html` y `javascript`. Los desarrolladores ya han configurado el servidor para que pueda servir archivos estáticos.

El front debe funcionar dentro del propio servidor, no uses otro servidor para lanzar tus archivos `html` y `javascript`, el servidor de desarrollo debe ser capaz de servir esos archivos.

### index.html (3 puntos)

En el `index.html` se debe mostrar una tabla con los datos que el endpoint `GET /api/mensajes` devuelve.

Además, debe mostrar un formulario http básico para poder enviar datos a `POST /api/mensajes`.

> En caso de que quieras usar `oat.css`, aqui tienes los enlaces a la libreria:

```html
<link rel="stylesheet" href="https://unpkg.com/@knadh/oat/oat.min.css">
<script src="https://unpkg.com/@knadh/oat/oat.min.js" defer></script>
```

### mensajes.html (5 puntos)

En este archivo harás lo mismo, pero de manera dinámica con js.

Se debe mostrar una tabla con los datos que el endpoint `GET /api/mensajes` devuelve. Puedes reutilizar el código de `index.html` para esto.

El formulario de esta página debe manejarse con `javascript`, y actualizar la tabla sin necesidad de recargar la página.

## Teoria (2 puntos)

Puedes responder a estas preguntas en este mismo archivo.

1. En esta linea de html hay un error, ¿cual? ¿Como lo corregirías?

```html
<link href="http://example.org">Entrar a mi sitio web</link>
```
En vez de poner `<link>` pones `<a>`. Quedaria asi:
```html
<a href="http://example.org">Entrar a mi sitio web</a>
```

2. ¿Que es una promesa? ¿Como se relaciona con la asincronia en javascript?
3. ¿Qué es el protocolo HTTP y cuáles son sus métodos más comunes? ¿Como se relaciona con html y javascript?
4. ¿Que tipos de inputs conoces? Citalos y describe que atributos pueden acompañar cada uno.
```html
    <input type="text" placeholder="Texto">
    <input type="number" min="0" max="100">
    <input type="email" required>
    <input type="password" minlength="6">
    <input type="date">
    <input type="checkbox" checked>
```

- Escribe un texto donde placeholder es el lugar donde se produce. 
- Escribe un numero, con min y max establezco un intervalo de datos que lo acepte
- Escribe un email
- Escribe una contraseña, cuyos caracteres minimos son 6
- Escribe una fecha
- Señala una opcion si la pulsas

## Extra (1 punto)

Crea un `test.sh` donde se hagan pruebas a los endpoints del servidor de desarrollo utilizando `httpie`. El script debe probar al menos los siguientes casos:

- `POST /api/mensajes` con datos válidos, y verificar que la respuesta es correcta.
- `GET /api/mensajes` para verificar que el mensaje enviado en el paso anterior se ha guardado correctamente.
- `POST /api/mensajes` con datos incorrectos, y verificar que la respuesta da un error adecuado.

> El endpoint `POST` puede dar varios errores dependiendo de los datos que se envíen, cuantos más casos de error pruebes, mejor.
