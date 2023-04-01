// fun main(){
//     // println("Ingrese su nombre: ")
//     // var nombre=readLine()!!
//     // println("Ingrese su edad: ")
//     // var edad=readLine()!!.toInt()
//     // println("Bienvenido $nombre su edad es $edad")
//     val num1 = 2.0
//     val num2 = 5.0
//     val num3 = 1.0
//     val prom = (num1 + num2 + num3) / 3
//     if (prom > 3.5) {
//     println("Gana la materia")
//     } else if (prom > 2) {
//     println("Puede recuperar")
//     } else {
//     println("Perdió la materia")
//     }
// }
// import java.util.Scanner
// fun main() {
// val scan = Scanner(System.`in`)
// print("Ingrese su nombre: ")
// val nombre = scan.nextLine()
// print("Ingrese su materia: ")
// val materia = scan.nextLine()
// print("Ingrese la nota 1: ")
// val nota1 = scan.nextFloat()
// if (nota1 >= 0 && nota1 <= 5) {
// print("Ingrese la nota 2: ")
// val nota2 = scan.nextFloat()
// if (nota2 >= 0 && nota2 <= 5) {
// print("Ingrese la nota 3: ")
// val nota3 = scan.nextFloat()
// if (nota3 >= 0 && nota3 <= 5) {
// val prom = (nota1 + nota2 + nota3) / 3
// println("El promedio de notas es: $prom")
// if (prom >= 3.5) {
// println("El estudiante $nombre GANÓ la materia $materia")
// } else {
// println("El estudiante $nombre PERDIÓ la materia $materia")
// if (prom >= 2.5) {
// println("$nombre Puede recuperar")
// }
// }
// } else {
// println("La nota 3 no está en el rango de 0 a 5")
// }
// } else {
// println("La nota 2 no está en el rango de 0 a 5")
// }
// } else {
// println("La nota 1 no está en el rango de 0 a 5")
// }
// }

fun main() {
println("Ingrese el valor de la compra:")
var valorCompra = readLine()!!.toFloat()
println("Valor Compra: $valorCompra")
var descuento = 0.0
if (valorCompra >= 100000) {
descuento = valorCompra * 0.5
valorCompra -= descuento
println("Se aplicó un descuento del 50% equivalente a: $descuento")
}
println("Valor Final: $valorCompra")
}
// estructura de control 7 videos

// condicionales simples, dobles, anidados
// when
// ciclos do while, while, for.