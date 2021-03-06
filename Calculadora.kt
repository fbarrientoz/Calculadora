package com.uabc.edu.ejemploskotlyn

class Calculadora {
    fun sumar(a:Double,b:Double):Double = a+b
    fun restar(a:Double,b:Double):Double = a-b
    fun multiplicar(a:Double,b:Double):Double = a*b
    fun dividir(a:Double,b:Double):Double = a/b
    fun porciento(a:Double,b:Double):Double=(a*b/100)
    fun potencia(a:Double, b:Int):Double{
        var resultado:Double=1.0
        for(i in 1..b){
            resultado *= a
        }
        return  resultado
    }
    //Factorial  A  A-1 hasta que este valga A=1   Ax (A-1)...
    fun factorial(a:Int):Double {

        var result: Double = 1.0
        for (i in a downTo 1) {
            result *= i
        }
        return result
    }
    }
    fun main(){
        val calculadoraImp: Calculadora = Calculadora()
        //MENU:  SUMAR, RESTAR, DIVIR, MULTI, POTENCIAR, FACTORIAL, PORCENTAJES
        // a:Double, b:Double
        //SOLICITAR NUMERO A y B
        // a:Double, b:Double
        println("Que opcion quiere (Escriba el nombre):")
        println("1) SUMAR")
        println("2) RESTAR")
        println("3) MULTIPLICAR")
        println("4) DIVIDIR")
        println("5) POTENCIAR")
        println("6) FACTORIAL")
        println("7) PORCENTAJES")
        println("8) SALIR")
        var textoEntrada=0
        try {
            textoEntrada = readLine()?.toInt()!!;

        }catch (e:NumberFormatException ){
            println("Solo se aceptan numeros")
        }
        //SOLICITAR NUMERO A y B
        // val a= readLine();
        // val b= readLine();
        //USANDO WHEN

        when (textoEntrada) {

            1 -> println("Resultado: [" + calculadoraImp.sumar(5.0,6.0)+"]")
            2 -> println("Resultado: [" + calculadoraImp.restar(5.0,6.0)+"]")
            3 -> println("Resultado: [" + calculadoraImp.multiplicar(5.0,6.0)+"]")
            4 -> println("Resultado: [" + calculadoraImp.dividir(5.0,6.0)+"]")
            5 -> println("Resultado: [" + calculadoraImp.potencia(5.0,6)+"]")
            6 -> println("Resultado: [" + calculadoraImp.factorial(5)+"]")
            7 -> println("Resultado: [" + calculadoraImp.porciento(5.0, 6.0)+"]")
            8 -> println("SALIR")
            else -> {
                    println("error")}
            }
        {
            println("Resultado: [" + calculadoraImp.restar(5.0,6.0)+"]")
            println("Resultado: [" + calculadoraImp.multiplicar(5.0,6.0)+"]")
            println("Resultado: [" + calculadoraImp.dividir(5.0,6.0)+"]")
            println("Resultado: [" + calculadoraImp.potencia(5.0,6)+"]")
            println("Resultado: [" + calculadoraImp.factorial(5)+"]") }
    }


