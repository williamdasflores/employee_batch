package br.com.project.batch.mappers;

import br.com.project.batch.domain.Employee;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;

@Component
public class EmployeeFieldSetMapper implements FieldSetMapper<Employee> {

    @Override
    public Employee mapFieldSet(FieldSet fieldSet) throws BindException {
        Employee employee = new Employee();

        employee.setFirstName(fieldSet.readString("first_name"));
        employee.setLastName(fieldSet.readString("last_name"));
        employee.setEmail(fieldSet.readString("email"));
        employee.setGender(fieldSet.readString("gender"));
        employee.setAddress(fieldSet.readString("address"));
        employee.setCity(fieldSet.readString("city"));

        return employee;
    }
}
