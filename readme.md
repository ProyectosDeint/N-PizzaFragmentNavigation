# PizzaFragment

Este proyecto es una copia del proyecto PizzaFragment, pero la gestión de sus fragments están gestionados por el componente Navigation.

### Contenido Vistos:

##### Date: 30/10/2020

1. Componente Navigation.

2. Añadir dependencias en el build.gradle(app) para el componente Navigation.

3. Creación del fichero de recurso, que va a ser de navegación -> nav_graph.

   Este recurso es de tipo Navigation.

4. Diseño del nav_graph con los fragments list_fragment_pizza y view_fragment_pizza.  list_fragment_pizza la ponemos como fragment de inicio.

5. Añadir una ruta desde  list_fragment_pizza a view_fragment_pizza.

   Unimos en diseño list_fragment_pizza con view_fragment_pizza y automáticamente le añade la ruta.

6. En elfragment ViewPizza añadimos un argumento ->

7. En el layout activity_main añadimos un fragment estático (`androidx.navigation.fragment.NavHostFragment`).

8. Añadir en ese fragment el `navGraph`que hemos creado antes.

9. Podemos pasar el objeto pizza  en `onItemClick` de dos maneras:

   1. La mejor es esta opción y es la que vamos a utilizar, porque comprueba los datos que se le pasan (`safe-args`):
      * Añadir en el gradle las dependecias correspondientes.
      * Pasar la action en ListPizzaFragment a ViewPizzaFragment en `onItemClick()`.
      * Recoger la action en ViewPizzaFragment.