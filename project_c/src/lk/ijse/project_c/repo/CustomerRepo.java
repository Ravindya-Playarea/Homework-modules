package lk.ijse.project_c.repo;

import lk.ijse.project_b.service.CustomerService;
import lk.ijse.project_c.security.RepoSecurity;
import lk.ijse.project_e.component.CustomerComponent;
import lk.ijse.project_f.config.*;

public class CustomerRepo {
    RepoSecurity repoSecurity;
    CustomerService customerService;
    CustomerComponent customerComponent;
    AppConfig appConfig;
}
