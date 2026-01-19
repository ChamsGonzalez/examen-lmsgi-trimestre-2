# Respuestas del examen de recuperacion de LMSGI

## Respuestas de la parte teorica

### Ejercicio 1

```html
<!DOCTYPE html>
<html lang="es">
```

Indica que estamos usando HTML5

```html
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
</head>
```

En el `<head>` se pone todos los elementos no visibles por el usuario. En `<title>` ponemos el titulo de la pestaña del navegador.

```html
  <body>
    <h1>Hola mundo</h1>  
    <main>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
      <img src="https://avatars.githubusercontent.com/u/106534360?v=4">
    </main>
  </body>
</html>
```

En el `<body>` es donde colocamos todos los elementos visibles. En este caso esta conformado por:

- Un titulo llamativo y grande que aparecera al principio de la pagina`<h1>Hola mundo</h1>`

- Un `<main>` en el que se encuentra un parrafo cuyas dimensiones repecto al "Hola mundo" son bastante menores expresado con `<p>`

- Una foto expresada con `<img>` en el que se coloca dentro el enlace desde donde se ha optenico usando `src`

### Ejercicio 2

```html
<p>
    <a href = "https://google.com">Haz click aqui para ir a Google</a>
</p>
```

### Ejercicio 3

Se llama index.html

### Ejercicio 4

Markdown es un tipo de archivo expresado con ".md" que se utiliza para mostrar una descripcion de tu proyecto, organizacion y estructuracion de ideas y procesos que se llevan a cabo... En comparacion con HTML que es la pagina visible de una pagina web, markdown no interactua con esta directamente, sino que se complementa mostrando como has desarrollado el proyyecto, apuntes, presentacion...

### Ejercicio 5


```JavaScript
const nombre = localStorage.getItem('nombre')
const edad = localStorage.getItem('edad')
```

Basicamente aqui las constantes (que son valores unicos que no pueden cambiarse) **nombre** y **edad** guardan usando `localStorage` los valores que el usuario ha marcado desde un inicio. **nombre** sera um dato de tipo string y **edad** de tipo int.
 
Asumiendo que nombre y edad existen, ¿que tipo de dato será cada uno?