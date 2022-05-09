object Main
{
   def main(args:Array[String])=
  {
    val unit=ask_units();
    val height=ask_height(unit);
    val weight=ask_weight(unit);
    val res=calc(height,weight);
    println(f"$res%.2f");
  }
  def ask_units():String=
  {
    println("Enter unit for measurement\n1.Metric\n2.Imperial");
    val x=scala.io.StdIn.readLine().toLowerCase().trim();
    if(Array("metric","imperial").contains(x)) x;
    else
    {
      println("Invalid input");
      ask_units;
    }
  }
  def ask(unit:String)=
  {
    height=ask_height(unit);
    weight=ask_weight(unit);
  }
  def ask_height(unit:String)=
  {
    if(unit.equals("metric"))
    {
      println("Enter your height in metres");
      val metres=scala.io.StdIn.readFloat();
      metres;
    }
    else
    {
      println("Enter feet");
      val feet=scala.io.StdIn.readFloat();
      println("Enter inches");
      val inches=scala.io.StdIn.readFloat();
      ft_in_to_m(feet,inches);
    }
  }
  def ask_weight(unit:String)=
  {
    if(unit.equals("metric"))
    {
      println("Enter your weight in kg");
      val kg=scala.io.StdIn.readFloat();
      kg;
    }
    else
    {
      println("Enter your weight in lbs");
      val lbs=scala.io.StdIn.readFloat();
      lbs_to_kg(lbs);
    }
  }
  def calc(h:Float,w:Float):Float=
  {
    w/(h*h);
  }
  def ft_in_to_m(ft:Float,in:Float):Float=
  {
    (ft*12+in)*0.0254f;
  }
  def lbs_to_kg(lbs:Float):Float=
  {
    lbs/2.05f;
  }
}
