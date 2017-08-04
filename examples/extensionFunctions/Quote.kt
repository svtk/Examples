package extensionFunctions

import com.atomickotlin.test.eq
import quoting.doubleQuote
import quoting.singleQuote

fun main(args: Array<String>) {
  "Single".singleQuote() eq "'Single'"
  "Double".doubleQuote() eq "\"Double\""
}
