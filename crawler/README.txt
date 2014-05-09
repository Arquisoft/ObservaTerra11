El funcionamiento del crawler es el siguiente:

-------------
CONFIGURACI�N
-------------

A partir de conf/domains.json cargamos las diferentes p�ginas
a inspeccionar e indicamos en "root" la ruta de la carpeta
que almacenar� los datos del crawler intermedios.
�NO DEBE TOCARSE PARA NADA!

En "numberOfCrawlers" indicamos la cantidad de crawlers(hilos)
que van a trabajar.

En "crawl" y respetando el formato de JSON se van a�adiendo las diferentes
p�ginas a inspeccionar.

Los datos se guardar�n en data/datas/(dominio/tipo_archivo).

En conf/log4j.properties tenemos el fichero de configuraci�n del logger del que
hace uso el crawler. Parte se mostrar� por consola y una mayor parte por fichero situado
en log/crawler.log

---------
EN MARCHA
---------

El funcionamiento real comienza con la configuraci�n del crawler en s�, se usa un objeto 
CrawlConfig(en nuestro caso tantos configs como p�ginas a inspeccionar).

Una vez configurado se crea del controlador(CrawlController). Al controlador se le agregan  semillas(seed), en nuestro caso tantas como p�ginas.
La semilla ser� la p�gina origen a inspeccionar y de ella se ve formando un �rbol y se van inspeccionando
sus p�ginas hijas(enlaces dentro de la p�gina padre).

El se pone en marcha(start) y se espera a que termine
la tarea(tiempo impredecible, se puede establecer la profundidad del �rbol de b�squeda, siendo
la semilla el nodo ra�z).