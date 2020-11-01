package com.dipdoo.kotlintutorial1

//class Human constructor( name:String){
//
//    val name:String = name
//
//    fun eatingCake(){
//
//        println("This is so Yummy")
//    }
//}

open class Human(val name:String = "Anonymous"){

    constructor(name:String,age:Int):this(name){ //부 생성자는 주 생성자를 받아야한다.
        println("my name is ${name},${age}years old")
    }

    init{
        println("new Human has been born")
        //주 생성자의 일부라 (val name:String = "Anonymous" 의 주 생성자와 같이
        //실행되므로 contructor 보다 항상 먼저다
    }

    fun eatingCake(){

        println("This is so Yummy")
    }

    open fun singASong(){
        println("lalala")
    }
}
//기본적으로 kotlin 의 모든 Class 는 Final 이기때문에 Open 을 해야 상속이된다.
class Korean : Human(){
//    override fun singASong(){
//        println("aaa")
//    }
    //함수도 overinding을 하기 위해서는 open을 해야한다
    override fun singASong(){
    super.singASong()
    println("sss")
    println("my name is :${name}") // 디폴트 생성 파라미터 있어서 가능
}
}

fun main(){
    val human = Human("junson")
    val stranger = Human();
    human.eatingCake()

    val jinsu = Human("ss",52)
    val korean1 = Korean()
    korean1.singASong()

}