El funcionamiento del crawler es el siguiente:

-------------
CONFIGURACI�N
-------------

A partir de conf/domains.json cargamos las diferentes p�ginas
a inspeccionar e indicamos en "root" la ruta de la carpeta
que almacenar� los datos del crawler intermedios.
�NO DEBE TOCARSE PARA NADA!

En "numberOfCrawlers" indicamos la cantidad de crawlers(hilos)
que van a trabajar por cada semilla(seed)/p�gina. Si en total 
tenemos 6 p�ginas a inspeccionar, tendremos 5 crawlers por cada
p�gina.

En "crawl" y respetando el formato de JSON se van a�adiendo las diferentes
p�ginas a inspeccionar y la ruta donde se guardar�n los datos
recolectados en esa p�gina. En estos momentos la ruta no se est� usando
por conflictos entre los crawlers, se almacenan datos en rutas que no les
corresponden. Se tiene que mirar con m�s profundidad para solucionarlo.

Se ha optado a guardar todos los ficheros recolectados en la misma carpeta, es decir,
data/datas(por defecto).

En conf/log4j.properties tenemos el fichero de configuraci�n del logger del que
hace uso el crawler. Parte se mostrar� por consola y una mayor parte por fichero situado
en log/crawler.log

---------
EN MARCHA
---------

El funcionamiento real comienza con la configuraci�n del crawler en s�, se usa un objeto 
CrawlConfig(en nuestro caso tantos configs como p�ginas a inspeccionar).

Una vez configurado se crean los controladores(CrawlController), uno por cada
p�gina del JSON. A cada controlador se le agrega una o m�s semillas(seed), en nuestro caso una.
La semilla ser� la p�gina origen a inspeccionar y de ella se ve formando un �rbol y se van inspeccionando
sus p�ginas hijas(enlaces dentro de la p�gina padre).

Los controladores se ponen en marcha(start) y se espera a que terminen
la tarea(tiempo impredecible, se puede establecer la profundidad del �rbol de b�squeda, siendo
la semilla el nodo ra�z).


---------
PROBLEMAS
---------

Adem�s del problema de las carpetas mencionado en el apartado de configuraci�n,
se observar� en la ejecuci�n del programa que habr� mensajes que digan algo como
"parece que el thrad no est� trabajando, vamos a esperar 10 secs.".
Se desconoce la causa de este problema. La �nica p�gina que se inspecciona correctamente
es la del banco mundial. Las dem�s a veces s� y otras no arrancan.

La p�gina http://data.ifpri.org de partida ya la descarta y dice que no se puede acceder,
causa desconocida por el momento. 

Estos problemas y alguno m�s se est�n tratando de solventar.


