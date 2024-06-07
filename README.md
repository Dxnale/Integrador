# Diagrama de clases para integrativa - Biblioteca

## Descripción

El siguiente diagrama de clases representa una biblioteca, con un log in para los usuarios estandar y para los administradores, donde los usuarios estandar pueden ver la disponibilidad de los libros (Lista en base de datos) y reservarlos (Cambiar su estado), los libros que se encuentran reservados (Estado del libro) no se pueden prestar, y la cola de espera (Queue) para poder reservar un libro cuando este se encuentre disponible. Los administradores pueden agregar libros a la base de datos, ver los libros que se encuentran en stock, ver los libros que se encuentran en cola de espera, ver los libros que se encuentran prestados

## Diagrama de clases

```mermaid

classDiagram
    class Libro{
        +String titulo
        +String autor
        +String fechaPublicacion
        +String codigoReserva
        +String codigoEntrega
        +boolean reservado
        +boolean solicitado

        +String getTitulo()
        +String getAutor()
        +String getFechaPublicacion()
        +String getCodigoReserva()
        +String getCodigoEntrega()
        +boolean isReservado()
        +boolean isSolicitado()

        +void setEstado()
        +void setReservado()
        +void setSolicitado()
    }

    class Usuario{
        +String nombre
        +String id
        +String tipo

        +String getNombre()
        +String getId()
        +String getTipo()
    }
    
    class Biblioteca{
        +List<Libro> libros
        +List<Usuario> usuarios
        +Queue<Libro> colaEspera
        +Stack<Libro> eliminados

        +List getLibros()
        +List getUsuarios()
        +Queue getColaEspera()
        +Stack getEliminados()
        +List getLibrosReservados()
        
        +boolean eliminarLibro()
        +boolean agregarLibro()
        +boolean reservarLibro()
        +boolean deshacerEliminacion()

        +void crearUsuario()
    }
```