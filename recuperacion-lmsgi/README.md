# Recuperación LMSGI

Para iniciar la prueba:

1. Clona este repositorio
2. Entra dentro del mismo
3. Borra el registro de git con `rm -rf .git`
4. Crea un nuevo repositorio publico en tu cuenta de Github

Realiza commits a menudo durante la prueba, usando mensajes descriptivos de lo que has terminado en el mismo.

## Teoria

Responde a las siguientes preguntas en un archivo llamado `teoria.md`. Formatea adecuadamente el contenido usando todos los recursos que *markdown* te ofrece.

1. Define los elementos que componen el siguiente snippet de código:

```html
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
  </head>
  <body>
    <h1>Hola mundo</h1>  
    <main>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
      <img src="https://avatars.githubusercontent.com/u/106534360?v=4">
    </main>
  </body>
</html>
```

2. El siguiente snippet tiene un error, ¿como lo arreglarias?

```html
<p>Haz click <link href="https://google.com">aqui</link> para ir a Google</p>
```

3. ¿Como se llama el archivo html que un servidor muestra por defecto cuando entramos a la entrada de una página?

4. ¿Que es markdown? ¿Que usos conoces del mismo? Comparalo frente a HTML y explica cuando se usa uno u otro.

5. Explica que hace el siguiente snippet de JavaScript:

```JavaScript
const nombre = localStorage.getItem('nombre')
const edad = localStorage.getItem('edad')
```

Asumiendo que nombre y edad existen, ¿que tipo de dato será cada uno?

> Para responder puedes abrir el navegador e interactuar con la consola de desarrollo.

## Práctica

1. En el repositorio del examen encontrarás un archivo en formato *pdf* creado a partir de un archivo *markdown*. A partir del contenido del pdf, crea un archivo markdown lo más fiel posible al original usando los elementos que consideres necesarios.
2. Crea un archivo HTML llamado `ollama-guia.html` a partir del markdown que has creado en el punto anterior. El HTML debe contener una estructura completa además del contenido.
3. Crea un archivo HTML llamado `index.html` con el siguiente contenido:

- El titulo de la página debe ser "Recuperación LMSGI"
- Debe contener un *Heading* de nivel 1 con el texto "Ejercicio HTML + Javascript"
- Debe contener un párrafo con el texto "Este es un ejercicio de recuperación de LMSGI"
- Debe contener un párrafo con un texto cualquiera.
- Debe contener la imagen que hay en `https://dummyjson.com/image/150`, esta mostrará un recuadro gris.

- Debe contener una imagen que no existe localmente (puedes inventarte la ruta) y que muestre un texto alternativo.
- Una lista con tres enlaces a páginas web de tu elección.
- Un botón con el texto "Haz click aquí".
- Un párrafo vacío debajo del botón.

4. Crea un archivo JavaScript llamado `script.js`, este script se ejecutará en el archivo HTML creado en el punto anterior y debe hacer lo siguiente:

- Sustituye el texto del párrafo que tiene un texto cualquiera por "Este texto ha sido modificado por JavaScript".
- Al hacer click en el botón "Haz click aquí", el párrafo vacío debe sustituirse por un elemento aleatorio de la siguiente lista de frases:

- "Hola mundo"
- "Hello world"
- "Bonjour le monde"
- "Hallo Welt"
- "Ciao mondo"
- "Olá mundo"

> Comprueba que tu botón funciona correctamente, cada vez que se pulse, debe mostrar una frase aleatoria de la lista en el párrafo vacío, no debe añadir más párrafos ni mostrar más de una frase a la vez.


