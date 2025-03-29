# 📌 Proyecto Hilos  

🚀 **Descripción:**  
Este es un proyecto de **Hilos en Java**, desarrollado para la materia de **Estructuras **. En este proyecto exploramos el funcionamiento de los hilos, su implementación y cómo se manejan en Java.  

📌 **Temas abordados:**  
- Hilos con **Herencia** (`extends Thread`)  
- Hilos con **Implementación** (`implements Runnable`)  
- Funcionamiento de los **Hilos Runnable**  
- Uso de la clase **Thread**  

## 📂 Estructura del Proyecto
En el proyecto de Hilos se encuentra diversas clases y carpetas
Las cuales son como clases  **Hilos**, **HilosR** ,**RunnableSimple**, **ThredSimple**.
y de carpetas la de **Runnable**, **ThredSimple** 

En las clases principales las cuales son **Hilos**
Este archivo contiene la clase principal dr Hilos que sirve como punto de entrada del programa, su funcion principal es Crear e inicializar dos Hilos utilizando la clase ThredSimple

**HilosR** 
En este archivo  se inicializan 5 Hilos concurrentes estos imprimen su numeros y su estado en esta se utiliza el join para esperar que todos los Hilos terminen antes de continuar se utiliza getState para imprimir el estado del Hilo

las clases son **RunnableSimple** y **threds**
la clase **RunnableSimple es una clase que permite crear hilos sin utilizar thred esto facilita la reutilizacion de codigo en otras clases 

la clase **ThredSimple** este hereda de Thred lo que permite crear y ejecutar un hilo de forma independiente 

**Que es una Flag**
es una variable que indica el estado de un programa esta es boleana
**que es el metodo wait**
pausa un Hilo hasta que otro lo despierte con un notifi



