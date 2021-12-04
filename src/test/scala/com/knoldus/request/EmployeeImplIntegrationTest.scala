package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee
import com.knoldus.validator.{EmailValidator, EmployeeValidator}
import org.scalatest.funsuite.AnyFunSuite


class EmployeeImplIntegrationTest extends AnyFunSuite {
  val companyName = new CompanyReadDto
  val validateEmail = new EmailValidator
  val employeeValidator = new EmployeeValidator(companyName, validateEmail)

  val employeeImpl = new EmployeeImpl(employeeValidator)

  test("User cannot be created because company does not exist"){
    val chacha: Employee = new Employee("Chacha", "Chaoudhry", 32, 100000, "Intern head", "GoldMan Sachs", "chaoudhary.chacha@gmail.com")
    val result = employeeImpl.createEmployee(chacha)
    assert(result.isEmpty)
  }

  test("User not created because email is invalid"){
    val Vaibhav: Employee = new Employee("Vaibhav", "Kumar", 21, 15000, "Intern", "Knoldus", "vaibhav.kumar@gmail.com")
    val result = employeeImpl.createEmployee(Vaibhav)
    assert(result.isEmpty)
  }

  test("User cannot be created because email is invalid and company does not exist in DB"){
    val chacha: Employee = new Employee("Chacha", "Chaoudhry", 32, 100000, "Intern head", "GoldMan Sachs", "chaoudhary.chacha@gmalcom")
    val result = employeeImpl.createEmployee(chacha)
    assert(result.isEmpty)
  }

  test("User can be created"){
    val Vaibhav: Employee = new Employee("Vaibhav", "Kumar", 21, 15000, "Intern", "Knoldus", "vaibhav.kumar@knoldus.com")
    val result = employeeImpl.createEmployee(Vaibhav)
    assert(result.isDefined)
  }

}