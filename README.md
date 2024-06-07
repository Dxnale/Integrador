# Diagrama de clases para integrativa - Biblioteca

## Descripción

El siguiente diagrama de clases representa una biblioteca, con un log in para los usuarios estandar y para los administradores, donde los usuarios estandar pueden ver la disponibilidad de los libros (Lista en base de datos) y reservarlos (Cambiar su estado), los libros que se encuentran reservados (Estado del libro) no se pueden prestar, y la cola de espera (Queue) para poder reservar un libro cuando este se encuentre disponible. Los administradores pueden agregar libros a la base de datos, ver los libros que se encuentran en stock, ver los libros que se encuentran en cola de espera, ver los libros que se encuentran prestados

## Diagrama de clases

```mermaid

classDiagram
    class Libro{
        - String titulo
        - String autor
        - String fechaPublicacion
        - String codigoReserva
        - String codigoEntrega
        - boolean reservado
        - boolean solicitado

        + String getTitulo()
        + String getAutor()
        + String getFechaPublicacion()
        + String getCodigoReserva()
        + String getCodigoEntrega()
        + boolean isReservado()
        + boolean isSolicitado()

        + void setReservado()
        + void setSolicitado()
    }

    class Usuario{
        - String nombre
        - String id
        - boolean admin

        + String getNombre()
        + String getId()
        + boolean isAdmin()
    }
    
      class Biblioteca {
        - List<Libro> libros
        - List<Usuario> usuarios
        - Queue<Libro> colaEspera
        - Stack<Libro> eliminados
        
        + List<Libro> getLibros()
        + List<Usuario> getUsuarios()
        + Queue<Libro> getColaEspera()
        + Stack<Libro> getEliminados()
        + List<Libro> getLibrosReservados()
        + List<Libro> getLibrosSolicitados()

        + boolean agregarLibro(Libro libro)

        + boolean reservarLibro(Libro libro)
        + boolean cancelarReserva(Libro libro)

        + boolean eliminarLibro(Libro libro)
        + boolean deshacerEliminacion()

        + boolean solicitarLibro(Libro libro)
        + boolean cancelarSolicitud(Libro libro)

        + boolean agregarUsuario(Usuario usuario)
        +boolean usuarioExiste(Usuario usuario)

    }
```