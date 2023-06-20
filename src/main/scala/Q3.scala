object Q3 {
  def main(args: Array[String]): Unit = {
    var workingHours: Double = 40
    var otHours: Double = 30
    var normalRate: Double = 250
    var otRate: Double = 85
    var totSalary: Double = workingHours * normalRate + otHours * otRate
    var takeHomeSalary: Double = totSalary - calTax(totSalary)
    println("Takehome salary: " + takeHomeSalary)
  }

  def calTax(salary: Double) = salary * 0.12
}
