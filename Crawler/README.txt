El funcionamiento del crawler es el siguiente:

-------------
CONFIGURACIÓN
-------------

A partir de conf/domains.json cargamos las diferentes páginas
a inspeccionar e indicamos en "root" la ruta de la carpeta
que almacenará los datos del crawler intermedios.
¡NO DEBE TOCARSE PARA NADA!

En "numberOfCrawlers" indicamos la cantidad de crawlers(hilos)
que van a trabajar.

En "crawl" y respetando el formato de JSON se van añadiendo las diferentes
páginas a inspeccionar.

Los datos se guardarán en data/datas/(dominio/tipo_archivo).

En conf/log4j.properties tenemos el fichero de configuración del logger del que
hace uso el crawler. Parte se mostrará por consola y una mayor parte por fichero situado
en log/crawler.log

---------
EN MARCHA
---------

El funcionamiento real comienza con la configuración del crawler en sí, se usa un objeto 
CrawlConfig(en nuestro caso tantos configs como páginas a inspeccionar).

Una vez configurado se crea del controlador(CrawlController). Al controlador se le agregan  semillas(seed), en nuestro caso tantas como páginas.
La semilla será la página origen a inspeccionar y de ella se ve formando un árbol y se van inspeccionando
sus páginas hijas(enlaces dentro de la página padre).

El se pone en marcha(start) y se espera a que termine
la tarea(tiempo impredecible, se puede establecer la profundidad del árbol de búsqueda, siendo
la semilla el nodo raíz).