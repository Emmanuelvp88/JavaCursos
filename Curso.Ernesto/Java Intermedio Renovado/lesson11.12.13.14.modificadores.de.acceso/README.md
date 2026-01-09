En esta leccion solo veremos los tipos de modificadores de acceso, los cuales nos sirven para 
proteger y ocultar objetos,variables,metodos,constructores, etc.
y nos dan un nivel de seguridad mas elevado para nuestras clases, permitiendo que otros desarrolladores
sigan una ruta espesificada por nosotros para acceder a la informacion.
.- public
.- private
.- protected
.- por defecto

---------Modificador de acceso **por defecto**---------

se declara la variable sin nada solo el tipo de variable y el nombre.
EJEMPLO: "int numero".

Este modificador tiene un alcance a nivel paquete, todas las clases dentro del mismo paquete 
tendran acceso mediante la instancia, y las clases que esten en otros paquetes NO.

----------Modificadores de acceso ublicos------------

Estos se declaran de la siguiente manera:
EJEMPLO: "public int numero"

Estan tienen un alcance global, es decir cualquiera puede acceder aellas, cualquier clase que 
las mande a llamar mediante la instancia por u nobjeto tendra acceso, ya sea se encuentre en el mismo paquete 
o en otro las va poder ver.

-----------Modificador de acceso private-----------

Se declara de la siguiente manera:
EJEMPLO: "private int numero".

Este modificador es altemente restrictivo, por lo cual solo se tiene acceso a los elementon que lo tienen
desde la misma clase, la unica forma en la que se peude acceder a estos elementos mediante "setters y getters".


-----------Modificador de acceso protected----------

Se declaran de la siguiente manera:
EJEMPLO: "protected int numero".

Con este modificador podemos proteger o restriguir los datos de manera local a nivel paquete, esto quiere decir 
que las clases que estan dentro del mismo paquete si van  apoder acceder a estos elementos que esten protegidos 
con el modificador protected, pero las clases que estean fuera del mismo paquete NO, la unica manera de 
acceder a estos elementos es mediante la Herencia.