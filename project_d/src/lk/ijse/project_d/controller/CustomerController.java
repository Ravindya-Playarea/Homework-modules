package lk.ijse.project_d.controller;

import lk.ijse.project_b.Util.Transformer;
import lk.ijse.project_c.repo.CustomerRepo;
import lk.ijse.project_d.aop.*;

public class CustomerController {
    CustomerAop customerAop;
    CustomerRepo customerRepo;
    Transformer transformer;
    //DatePipe datePipe; ->project e can not access
    //AppConfig appConfig; ->project f can not access
    //ApiGateway apiGateway; ->project a can not access

}
