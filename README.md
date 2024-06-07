# Diagrama de clases para integrativa - Libreria

## Descripción

El siguiente diagrama de clases representa una librería, donde se pueden agregar libros, clientes y ventas. Los libros tienen un título, autor, género, editorial, fecha de publicación, stock y precio. Los clientes tienen un nombre, rut y si es socio o no. Las ventas tienen un cliente, un libro, una cantidad y un total. La librería tiene una lista de libros, clientes y ventas, y puede agregar libros, clientes y ventas, vender libros, mostrar el inventario y mostrar las ventas.

## Diagrama de clases

```mermaid

classDiagram
    class Libro{
        +String titulo
        +String autor
        +String genero
        +String editorial
        +String fechaPublicacion
        +int stock
        +int precio

        +String getTitulo()
        +String getAutor()
        +String getGenero()
        +String getEditorial()
        +String getFechaPublicacion()
        +int getStock()
        +int getPrecio()
    }

    class Cliente{
        +String nombre
        +String rut
        +boolean esSocio

        +String getNombre()
        +String getRut()
        +boolean getEsSocio()
        +void setEsSocio(boolean esSocio)
    }

    class Venta{
        +Cliente cliente
        +Libro libro
        +int cantidad
        +int total

        +Cliente getCliente()
        +Libro getLibro()
        +int getCantidad()
        +int getTotal()
    }

    class Libreria{
        +List<Libro> libros
        +List<Cliente> clientes
        +List<Venta> ventas

        +void agregarLibro(Libro libro)
        +void agregarCliente(Cliente cliente)
        +void agregarVenta(Venta venta)
        +void venderLibro(Libro libro, Cliente cliente, int cantidad)
        +void mostrarInventario()
        +void mostrarVentas()
    }

    Libro "1" -- "0..*" Venta
    Cliente "1" -- "0..*" Venta
    Libreria "1" -- "0..*" Libro
    Libreria "1" -- "0..*" Cliente
    Libreria "1" -- "0..*" Venta

```

## Diagrama de base de datos

```mermaid

erDiagram
    Libro {
        String titulo
        String autor
        String genero
        String editorial
        String fechaPublicacion
        int stock
        int precio
    }

    Cliente {
        String nombre
        String rut
        boolean esSocio
    }

    Venta {
        int cantidad
        int total
    }

    Libro ||--o{ Venta : "0..*"
    Cliente ||--o{ Venta : "0..*"

```

## Procesos en la base de datos

- Agregar libro
- Agregar cliente
- Agregar venta
- Vender libro
- Mostrar inventario
- Mostrar ventas
- Mostrar clientes
```
