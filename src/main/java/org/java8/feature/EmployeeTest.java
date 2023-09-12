package org.java8.feature;

import javax.lang.model.type.MirroredTypeException;
import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Rakesh",20,2000,"A"));
        list.add(new Employee("Dinesh",30,4000,"A"));
        list.add(new Employee("Pravesh",20,4000,"B"));
        list.add(new Employee("Muskan1",25,4000,"B"));
        //Given a list of employees,
        // you need to filter all the employee whose age is greater than 20 and print the employee names.(Java 8 APIs oz[.length - 1]

       /* list.stream()
                .filter(item-> item.getAge()>=20)
                .forEach(item-> System.out.println(item.getName()));


        List<String> listOfEmp = list.stream().filter(item->item.getAge()>20)
        .map(Employee::getName)
        .collect(Collectors.toList());
        listOfEmp.forEach(System.out::println);


        long numberOfEmpWithAge = list.stream().filter(item->item.getAge()>25).count();
        System.out.println("Number of Employee With age 25: "+numberOfEmpWithAge);

*/
        //find the employee name with muskan

       Optional optional =  list.stream().filter(item->item.getName().equalsIgnoreCase("muskan")).findAny();
       if (optional.isPresent()){
           Object o = optional.get();
           if (o instanceof Employee){
               Employee e =(Employee) o;
               System.out.println(e.getName());
           }
       }else {
           System.out.println("not found ");
       }

       /*OptionalInt optionalInt =list.stream().mapToInt(Employee::getAge).max();
       if (optionalInt.isPresent()){
           System.out.println("Max age of Employee:: "+optionalInt.getAsInt());
        }*/

      /* list.stream().sorted(Comparator.comparingInt(Employee::getAge))
               .forEach(item-> System.out.println(item.getAge()));
       List<String> employeelists =list.stream().map(Employee::getName).collect(Collectors.toList());
       String employeeNameWith = String.join(",",employeelists);
        System.out.println(employeeNameWith);
*/
        //given a list of employee group by name

//       Map<String,List<Employee>> groupByName =  list.stream().collect(Collectors.groupingBy(Employee::getName));
//       groupByName.forEach((name,employeeListTemp)-> System.out.println(name+":"+name+" "+employeeListTemp));
//
//       //given a list of int array remove duplicates
//        Integer arr[]={1,2,3,3,3,3,2,29,8,7};
//        List<Integer> integerList = Arrays.asList(arr);
//        Set<Integer> integerSet = integerList.stream().collect(Collectors.toSet());
//        integerSet.forEach(item-> System.out.println(item));

        //given a list of numbers,square them and filter the number which is grater 10000 and find the avg.
        Integer arr[] = {100,24,13,44,114,200,40,112};
        List<Integer>integerList = Arrays.asList(arr);


//find the avg salry whose grade is A.
       Double d =  list.stream().filter(item->item.getGrade().equalsIgnoreCase("A"))
                .map(emp->emp.getSalary())
                .mapToDouble(sla->sla)
               .average()
               .getAsDouble();

        System.out.println(d);



    }

    //join the all employee name with ","



}
