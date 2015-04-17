object RiverPrint {

	def main(args: Array[String]){
	  var test = Array(1 to 30)


	  for (x <- test){
	  	println(x)
	  	Thread sleep 500
	  	var inpt = readLine()
	  	if(inpt != null){
	  		println("got text")
	  	}
	  }

	}
	
	
}