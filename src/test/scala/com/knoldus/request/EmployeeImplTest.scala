package com.knoldus.request

import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.funsuite.AnyFunSuite

class EmployeeImplTest extends AnyFunSuite{
  val employeeValidator: EmployeeValidator = mock[EmployeeValidator]
  val Vaibhav:Employee = new Employee("Vaibhav","Kumar",12,15000,"Intern","Knoldus","vaibhav.kumar@gmailcom")
  val userImpl = new EmployeeImpl(employeeValidator)

  test("User can be ceated"){
    when(employeeValidator.employeeIsValid(Vaibhav)) thenReturn(true)
    val result = userImpl.createEmployee(Vaibhav)
    assert(result.isDefined)
  }
  test("User can not be created"){
    when(employeeValidator.employeeIsValid(Vaibhav)) thenReturn(false)
    val result = userImpl.createEmployee(Vaibhav)
    assert(result.isEmpty)
  }
}
