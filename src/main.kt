fun main() {
 var name="Akirachix"
 println(name.length)

 var school="Akirachix"
 println(school[0].toString()+school[2]+school[3])
var x="stensil"
 var y=4
 var statement="hi my name is $x and am $y years old"
 println(statement)
var naMe="wanjala"
if (naMe=="stensil"){
 println("Thats me!")
}
 else {
  println("I dont know who that is")
}

 val emptyString=""
 val blankString=" "
 println(blankString.isBlank())
 println(blankString.isEmpty())
 println(emptyString.isEmpty())
 println(emptyString.isBlank())

 var names =" Happiness Gesare "
 println(names.trimStart())
 println(names.trimEnd())
 println(names.trim())

 var Town="Kampala"
 println(Town.endsWith("a"))
 println(Town.startsWith("k"))


 var text="I like my my daughter very much"
 println(text.replace("like","love"))
//string split
 var birds="eagle,owl,chicken,duck,"
 println(birds.split(","))
 //to string
 val weight=57
 print("my weight is "+weight.toString())










 }

