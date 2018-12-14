package hello

fun `Start with`(seeds : Pair<Int,Int>) : MutableList<Int> {
	var lst = mutableListOf(seeds.first,seeds.second)   
    return lst
} 
fun Pair<MutableList<Int>,(Int,Int)->Int>.For(till:Int):MutableList<Int>{
    for(i in 1 .. till){
    	var counter = this.first.size - 1                  
        this.first.add(this.second.invoke(this.first[counter-1] , 
                                          this.first[counter]))
    }
    return this.first
}
fun MutableList<Int>.`Then follow`(rule:(Int,Int)->Int)
                  :Pair<MutableList<Int>,(Int,Int)->Int> {
  return Pair(this,rule) 
  
}
fun MutableList<Int>.`Then follow2`(rule:(Int,Int)->Int,Till:Int)
                  :MutableList<Int> {
    for(i in 1 .. Till){
    	var counter = this.size - 1                  
        this.add(rule.invoke(this[counter-1] , this[counter]))
    }
    return this
}
val Int.times:Int 
    get() = this
fun fibo (x: Int, y : Int) = x + y 
infix fun Int.And(other:Int) = Pair(this,other)
fun main() {
    var result = `Start with` (1 And 1).
                 `Then follow`(::fibo).
                  For(10.times)
                 
     //`start with` ( 1 and 1).
     //`then follow` ::fibo
     //`for` 10.times                
    for(m in result)
    	println(m)
    println("Hello World")
}