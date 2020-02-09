package br.com.project.batch.dao;

import br.com.project.batch.domain.Employee;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlBatch;

@UseClasspathSqlLocator
public interface EmployeeDAO {

    @SqlBatch
    void insertEmployee(@BindBean Employee employee);
}
