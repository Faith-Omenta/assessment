fun main() {
    var x=sentence("akirachic")
    var y=sentence("school")
    println(x)


    numbers(245,65,762,736)

    Calculator(546,64,8,744)



}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length. (4 pts)
fun sentence(){
    return sentence
}
//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var numbers= arrayOf(num1,num2,num3,num4)
    return numbers
}
//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.

//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.

//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class Calculator(num1:Int,num2:Int,num3:Int,num4:Int){
     var sum=num1+num2
    println (sum)

    var difference=num4-num1
    println(difference)

    var division=num2/num3
    println(division)

    var product=num2*num4
    println(product)


}
