package interfaces

import com.atomickotlin.test.eq

interface Animal {
  val sound: String

  fun talk() = "$sound!"
}

class Cat : Animal {
  override val sound = "meow"
}

class Dog(
    override val sound: String
) : Animal

fun main(args: Array<String>) {
  val cat = Cat()
  cat.talk() eq "meow!"
  val dog = Dog("woof")
  dog.talk() eq "woof!"
}
