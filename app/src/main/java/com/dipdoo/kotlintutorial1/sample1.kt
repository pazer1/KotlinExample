package com.dipdoo.kotlintutorial1

fun main(){
    //3.String Template
//    val name = "junseong"
//    println("my name is ${name}")
    forAndWhile()
}

//1.함수

fun helloWorld():Unit{
    println("Hello World")
}

fun add(a:Int, b:Int) : Int{
    return a+b
}

//2. val vs var
fun hi(){
    val a : Int = 10
    var b : Int = 9
    //초기화를 하지 않을때는 타입을 적어둬야 한다
    var c :String
    b = 100
    println(b)
}

//4. 조건식
fun maxBy(a:Int, b:Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a:Int, b:Int):Int = if(a>b)a else b

fun checkNum(score:Int){
    when(score){
        0-> println("this is 0")
        1->println("this is 1")
        2,3,->println("this is 2 or 3")
    }

    var b = when(score){
        1->1
        2->2
        else ->3
    }

    when(score){
        in 90..100 -> print("you are genius")
        in 10..80 ->print("not bad")
        else -> print("okay")
    }
}

//Expression vs Statement
//Expression 은 값을 할당하는 것
//Statement는 식의 실행,
//java는 void 가 있기 때문에 Statement가 있지만 코틀린은 Unit 을 리턴하기에
//코틀린의 모든 함수는 Expression이다.

//5. Array and List
fun array(){
    val array:Array<Int> = arrayOf(1,2,3)
    val list:List<Int> = listOf(1,2,3)
    //array는 값 수정 가능하지만 list는 불가능
    array[0] = 3;
    //MutableList는 값 수정 가능
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

//6. for /while
fun forAndWhile(){
    val students:ArrayList<String> = arrayListOf("joyce","james","jenny","jennifer")
    for(name:String in students){
        println(name)
    }
    var sum:Int = 0
    for(i:Int in 1..10){
        sum +=i
    }
    print(sum)

    for(i:Int in 1..10 step 2){
        sum +=i
    }
    print(sum)

    for(i:Int in 1 downTo 10  ){
        sum +=i
    }
    print(sum)

    for(i:Int in 1 until  10  ){ //10을 포함하지 않고 1부터 9까지
        sum +=i
    }
    print(sum)

    for ((index:Int,name:String) in students.withIndex()){
        print("${index}번째 학생 : ${name}" )
    }
}

//7. Nullable / NonNull

fun nullCheck(){
    //NPE : Null Pointer Exception
    var name : String = "joyce"
    var nullName :String? = null
    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase:String? = nullName?.toUpperCase(); //만일 null이면 null을 return 하고 아니면 uppercase return

    // ?:

    var lastName :String? = null
    var fullName :String = name+" "+ (lastName?:"No LastName") // null이면 default
    println(fullName)

    //!!

}

fun ignoreNulls(str:String?){
    val mNotNull : String =str!! // null이 아니다.
    val upper:String = mNotNull.toUpperCase();

    val email = "gojunseong@naver.com"
    email?.let{
        println("my email is ${it}") //만일 email 이 null 이 아니면 email을 람다 안으로 가져와서 실행
    }
}