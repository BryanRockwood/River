object RiverPrint {
def main(args: Array[String]){
println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
println("██████╗ ██╗██╗   ██╗███████╗██████╗ ")
println("██╔══██╗██║██║   ██║██╔════╝██╔══██╗")
println("██████╔╝██║██║   ██║█████╗  ██████╔╝")
println("██╔══██╗██║╚██╗ ██╔╝██╔══╝  ██╔══██╗")
println("██║  ██║██║ ╚████╔╝ ███████╗██║  ██║")
println("╚═╝  ╚═╝╚═╝  ╚═══╝  ╚══════╝╚═╝  ╚═╝")
println("Welcome to River. Please Enjoy your stay.")
println("To get started please enter the length of your stay")
var lengthString = io.StdIn.readLine
if(lengthString == "Mountain"){
Thread sleep 1000
println("Wait.")
Thread sleep 2000
println("Are you a spy?")
var isSpy = io.StdIn.readLine
if (isSpy == "yes" || isSpy == "Yes"){
Thread sleep 2000
println("Well at least your honest.")
Thread sleep 1000
println("Send your boss River's regards")
} else {
Thread sleep 3000
println("Don't lie to River.")
Thread sleep 2000
println("River Doesn't take kindly to liers.")
}
Thread sleep 2000
println("Forcing Shutdown.")
Thread sleep 1000
} else {
println("Sit back, relax, and please ponder your thoughts:")
Thread sleep 1000
println("You are almost ready for your stay, please answer the following questions.")
Thread sleep 1000
println(h())
var answer1 = io.StdIn.readLine
println(h())
var answer2 = io.StdIn.readLine
println(h())
var answer3= io.StdIn.readLine
println("Generating your stay...\n")
f()
var lengthInt = c(lengthString)
var fishSkip = b(answer1) * 2
var fishPlace = b(answer2)
var riverShift = b(answer3)
var fishRange = 1 to lengthInt by fishSkip
var isFishRow = false
var whichShift = 0
var a = 0
for (a <- 1 to lengthInt){
if(fishRange contains a){
isFishRow = true
} else {
isFishRow = false
}
if (whichShift > 5){
whichShift = whichShift - 1
isFishRow = true
}
if (whichShift < -5){
whichShift = whichShift + 1
isFishRow = false
}
var rand = Math.random() * (riverShift*2) 
if (riverShift > rand ) {
whichShift = whichShift - 1
} else {
whichShift = whichShift + 1
}
var recRiverRow:String = aa(isFishRow,fishPlace, whichShift)
println(recRiverRow)
Thread sleep 250
}
g()
}
println("Thank you for your stay.")
Thread sleep 1000
println("Closing River...")
}
def aa(isFishRow:Boolean,fishPlace:Int,whichShift:Int) : String = {
var riverWidth = 60
var riverRow:Array[String] = new Array(riverWidth)
var completeRow:String = ""
var leftbound = "               "
var leftLand = ""
var water = ""
var rightLand = ""
var isFish = isFishRow
var fishLoc:Double = fishPlace + 6
var shift = whichShift
if (shift >= 0){
leftbound = leftbound.dropRight(shift)
} else {
leftbound = leftbound.dropRight((shift * -1 )* 2 )
}
fishLoc = fishLoc + Math.ceil(Math.random() * 15)
var b = 0
var bc = 1
for (b <- 1 to riverWidth){
if(b < 6){
leftLand += "#"
} else if(b > 55){
rightLand += "#"
} else {
if(isFish && b == fishLoc){
water += "><>"
} else {
if(d(b)){
water += " "
} else {
water += " "
}
}	
}
}
if(isFish){
water = water.dropRight(2)
}
completeRow = leftbound + leftLand + water + rightLand
return completeRow
}
def b(s: String):Int = {
var charArr:Array[Char] = s.toCharArray
var value = 0
for (c <- 0 until charArr.length){
charArr(c) match {
case 'a' | 'A' => value += 1
case 'b' | 'B' => value += 2
case 'c' | 'C' => value += 3
case 'd' | 'D' => value += 4
case 'e' | 'E' => value += 5
case 'f' | 'F' => value += 6
case 'g' | 'G' => value += 7
case 'h' | 'H' => value += 8
case 'i' | 'I' => value += 9
case 'j' | 'J' => value += 10
case 'k' | 'K' => value += 11
case 'l' | 'L' => value += 12
case 'm' | 'M' => value += 13
case 'n' | 'N' => value += 14
case 'o' | 'O' => value += 15
case 'p' | 'P' => value += 16
case 'q' | 'Q' => value += 17
case 'r' | 'R' => value += 18
case 's' | 'S' => value += 19
case 't' | 'T' => value += 20
case 'u' | 'U' => value += 21
case 'v' | 'V' => value += 22
case 'w' | 'W' => value += 23
case 'x' | 'X' => value += 24
case 'y' | 'Y' => value += 25
case 'z' | 'Z' => value += 26
case '0'       => value += 10
case '1'       => value += 1
case '2'       => value += 2
case '3'       => value += 3
case '4'       => value += 4
case '5'       => value += 5
case '6'       => value += 6
case '7'       => value += 7
case '8'       => value += 8
case '9'       => value += 9
case ' '       => value += 1
case _         => value += 1
}
}
value = value/charArr.length
value = Math.round(value)
return value	
}
def c(s: String):Int = {
try {
s.toInt
} catch {
case e:Exception => 0
}
}
def d( v:Int ) : Boolean = {
v % 2 == 0
}
def e( v:Int ) : Boolean = {
v % 2 != 0
}
def f() {
println("#####                                                                             #####")
Thread sleep 250
println("   #####                                                                       #####   ")
Thread sleep 250
println("       #####                                                               #####       ")
Thread sleep 250
println("           #####                                                       #####           ")
Thread sleep 250
println("             #####                                                   #####             ")
Thread sleep 250
println("              #####                                                 #####              ")
}
def g() {
println("              #####                                                 #####              ")
Thread sleep 250
println("             #####                                                   #####             ")
Thread sleep 250
println("           #####                                                       #####           ")
Thread sleep 250
println("       #####                                                               #####       ")
Thread sleep 250
println("   #####                                                                       #####   ")
Thread sleep 250
println("#####                                                                             #####")	
}
def h() : String = {
var r = Math.floor(Math.random() * 11)
r match {
case 0 => return "What are you accomplishing in another life?"
case 1 => return "Who let the dogs out?"
case 2 => return "When the bell rings, who will answer the gong?"
case 3 => return "Who are you when you arent hungry?"
case 4 => return "If the chicken lays the egg, when does the crow caw?"
case 5 => return "When does boldness rival brashness?"
case 6 => return "What does red taste like?"
case 7 => return "What if you blink, and you change your conciousness?"
case 8 => return "Look to your left, what ghost resides on your shoulder?"
case 9 => return "How many licks does it take to get to the center?"
case 10 => return "How was the ride?"
case 11 => return "What if you were merely a brain in a vat, creating memories for a computer?"
case 12 => return "Explain drawing 7 perpendicular lines."
}
}
}
	
	
