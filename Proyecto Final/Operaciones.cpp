// Operaciones.cpp : Defines the exported functions for the DLL application.
//

#include "stdafx.h"
#include <jni.h>
#include "Calculadora.h"
#include <stdio.h>
/*
 * Class:     calculadora_Operaciones
 * Method:    getSuma
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_calculadora_Operaciones_getSuma(JNIEnv * a, jobject b, jdouble uno, jdouble dos){
	return uno+dos;
}


/*
 * Class:     calculadora_Operaciones
 * Method:    getResta
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_calculadora_Operaciones_getResta(JNIEnv * a, jobject b, jdouble uno, jdouble dos){
	return uno-dos;
}

/*
 * Class:     calculadora_Operaciones
 * Method:    getMulplicacion
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_calculadora_Operaciones_getMulplicacion(JNIEnv * a, jobject b, jdouble uno, jdouble dos){
	return uno*dos;
}

/*
 * Class:     calculadora_Operaciones
 * Method:    getDivision
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_calculadora_Operaciones_getDivision(JNIEnv * a, jobject b, jdouble uno, jdouble dos){
	return uno/dos;
}

