# CopyBytesImaxe
## Segundo apartado
### Enunciado

exercicio 3
vai constar de dous exercicios : copybytesimaxe e copybytesimaxe2

unha vez solucionados estes exercicios   debes enviar as fontes .java como arquivos separados.

nota : o  numero maximo de arquivos a subir e 4  e non deben totalizar en conxunto mais de 200 MB


APLICACION  copybytesimaxe:

Imos partir do exercicio anterior para desenvolver este asi que crea un proxecto denominado copybytesimaxe co mesmo codigo do exercicio anterior

a) agora fai a proba de utilizar como fichero orixen a copiar a imaxe foto.jpg (en vez de texto1.txt) e como ficheiro destino da copia un que se chame foto2.jpg (en vez de texto2.jpg.
Canto ocupa foto2.jpg ?
2.5 MiB
ocupa o mesmo que a imaxe orixinal ?
Si

b) executa por segunda vez a aplicacion para que se engada de novo a imaxe foto.jpg  á imaxe foto2.jpg. ¿que ocorre se abrimos a imaxe, vese a imaxe repetida? , Canto ocupa agora o arquivo foto2.jpg?

    La imagen se ve igual, pero ocupa el doble.

c) o que estamos facendo  ata o de agora  e traballar con fluxos de datos tipo byte, sen diferenciar se o contido do ficheiro a copiar conten
datos de texto ou binarios.

(Veremos mais adiante que cando se traballa con fluxos de datos tipo  texto normalmente se garda un byte por caracter , pero cando se traballa fluxos de datos de tipo binario se almacenan imaxenes byte a byte ou caracteres en un formato que pode  escribir diferentes tipos primitivos de datos ).

E dicir,  en canto o que o que fixemos ate o de agora, para o sistema non hai diferencia entre copiar un ficheiro de texto ou unha imaxe posto que non interpreta o contido de cada byte senon que simplesmente o lé e o copia byte a byte ( un byte de cada vez).


Isto e aparentemente rapido pero se o ficheiro orixen e grande  e queremos mellorar a velocidade de copia debemos recurrir a outras clases que combinadas con as clases anteriores  (FileInputStream e FileOutputStream ) van permitirnos mellorar a velocidade dos fluxos de datos.


Para traballar con ficheiros binarios  temos duas clases que melloran a velociade de entrada e salida do fluxo de datos.
Estas clases son as clases BufferedInputStream e BuffferedOutputStream.
A ventaxa de usar  buffers e que se reduce o numero de operacions de entrada saida que son feitas por o disco.
Asi,por exemplo , se un buffer pode conter 4000 bytes , so se fará a operación de escritura ou lectura cando dito buffer se encha ou cando o fluxo sexa pechado (close). En caso de non usar buffers a grabacion dos 4000 bytes requriria centos de operacions de entrada saida , e xa que cada operacion require a recolocacion das cabezas do disco  isto leva moito tempo.


Para poder  facer isto Java permite  combinar dous ou mais fluxos de datos (Streams) para engadir a funcionalidade que se necesita par unha aplicación  ( FileInputStream  e BufferedInputStream son fluxos de datos que se poden combinar ) .
Para combinar fluxos de datos  en Java debes usar un obxecto de unha das clases como argumento para o constuctor da outra clase .

APLICACION copybytesimaxe2:

Sabendo que  a clase BufferedInputStream acepta como argumento do seu constructor a un obxecto da clase FileInputStream, e que a clase BuffferedOutputStream  acepta como argumento do seu constructor a un obxecto da clase FileInputStream, fai outro proxecto chamdo copybytesimaxe2  para  aumentar a velocidade de copia facendo uso de ditas clases.

IMPORTANTE:
Ten en conta que a clase BufferedInputStream  ten un metodo read() que permite ler un byte de cada vez e que do mesmo xeito que a clase FileInputStream permite detectar o fin do ficheiro mediante a consulta do valor devolto na lectura: si e -1 indica o fin do ficheiro .
Ten en conta tamen que a clase BufferedOutputStream ten un metodo write() que permite escribir un byte

una vez que executes o exercicio:
Notaches a diferenza en velocidade a hora de facer a copia da imaxen con respecto a cando NON usaches as clases BufferedInputStream e BufferedOutputStream ?
Creo que si
Se non a notas escolle unha imaxe de maior numero de bytes que a proporcionada (foto.jpg) ou executa varias veces o proxecto copybytesimaxe para facer crecer en bytes a imaxe foto2.jpg  e despois usa esta  como orixen de copia neste proxecto (copybytesimaxe2)

