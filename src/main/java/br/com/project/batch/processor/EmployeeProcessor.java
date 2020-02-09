package br.com.project.batch.processor;

import br.com.project.batch.domain.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {

    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }
}
