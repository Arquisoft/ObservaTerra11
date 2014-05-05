El funcionamiento del crawler es el siguiente:

-------------
CONFIGURACIÓN
-------------

A partir de conf/domains.json cargamos las diferentes páginas
a inspeccionar e indicamos en "root" la ruta de la carpeta
que almacenará los datos del crawler intermedios.
¡NO DEBE TOCARSE PARA NADA!

En "numberOfCrawlers" indicamos la cantidad de crawlers(hilos)
que van a trabajar por cada semilla(seed)/página. Si en total 
tenemos 6 páginas a inspeccionar, tendremos 5 crawlers por cada
página.

En "crawl" y respetando el formato de JSON se van añadiendo las diferentes
páginas a inspeccionar y la ruta donde se guardarán los datos
recolectados en esa página. En estos momentos la ruta no se está usando
por conflictos entre los crawlers, se almacenan datos en rutas que no les
corresponden. Se tiene que mirar con más profundidad para solucionarlo.

Se ha optado a guardar todos los ficheros recolectados en la misma carpeta, es decir,
data/datas(por defecto).

En conf/log4j.properties tenemos el fichero de configuración del logger del que
hace uso el crawler. Parte se mostrará por consola y una mayor parte por fichero situado
en log/crawler.log

---------
EN MARCHA
---------

El funcionamiento real comienza con la configuración del crawler en sí, se usa un objeto 
CrawlConfig(en nuestro caso tantos configs como páginas a inspeccionar).

Una vez configurado se crean los controladores(CrawlController), uno por cada
página del JSON. A cada controlador se le agrega una o más semillas(seed), en nuestro caso una.
La semilla será la página origen a inspeccionar y de ella se ve formando un árbol y se van inspeccionando
sus páginas hijas(enlaces dentro de la página padre).

Los controladores se ponen en marcha(start) y se espera a que terminen
la tarea(tiempo impredecible, se puede establecer la profundidad del árbol de búsqueda, siendo
la semilla el nodo raíz).


---------
PROBLEMAS
---------

Además del problema de las carpetas mencionado en el apartado de configuración,
se observará en la ejecución del programa que habrá mensajes que digan algo como
"parece que el thrad no está trabajando, vamos a esperar 10 secs.".
Se desconoce la causa de este problema. La única página que se inspecciona correctamente
es la del banco mundial. Las demás a veces sí y otras no arrancan.

La página http://data.ifpri.org de partida ya la descarta y dice que no se puede acceder,
causa desconocida por el momento. 

Estos problemas y alguno más se están tratando de solventar.


