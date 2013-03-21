# language: es
Característica: Calculator ops

Background:
	Dado Ejecuto Limpiar la Calculadora

@calculadora
Escenario: Probar suma
	Cuando escribo 2 en la calculadora
	Y presiono la tecla +
	Y escribo 5 en la calculadora
	Y presiono la tecla =
	Entonces El resultado sera 7

@calculadora
Escenario: Probar resta
	Cuando escribo 5 en la calculadora
	Y presiono la tecla -
	Y escribo 2 en la calculadora
	Y presiono la tecla =		
	Entonces El resultado sera 3