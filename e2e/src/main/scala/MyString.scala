package foo

case class MyString(value: String)

object MyString {
 implicit val myStringTypeMapperInstance: scalapb.TypeMapper[String, MyString] =
   scalapb.TypeMapper[String, MyString](a => apply(a))(_.value)
}
