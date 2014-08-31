package tk.jimmywang.attendanceserver.worker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.jimmywang.attendanceserver.base.model.Response;
import tk.jimmywang.attendanceserver.base.util.ResponseCode;
import tk.jimmywang.attendanceserver.worker.model.Worker;
import tk.jimmywang.attendanceserver.worker.service.WorkerService;

import java.util.ArrayList;
import java.util.List;

/**
 * <i>Created by WangJin on 2014-08-30 23:24.
 *
 * @author WangJin
 * @version 1.0
 */

@Controller
@RequestMapping(value = "worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping(value = "/")
    public
    @ResponseBody
    Response<List<Worker>> index() {

        List<Worker> workers = new ArrayList<Worker>();

        Worker worker = new Worker();
        worker.setName("姓名");
        worker.setPhoneNumber("16413564156");
        workers.add(worker);

        worker = new Worker();
        worker.setName("姓名");
        worker.setPhoneNumber("16413564156");
        workers.add(worker);

        worker = new Worker();
        worker.setName("姓名");
        worker.setPhoneNumber("16413564156");
        workers.add(worker);

        return new Response<List<Worker>>(ResponseCode.STATUS_OK, "", workers);
    }

    @RequestMapping(value = "/getworker", method = RequestMethod.GET)
    public
    @ResponseBody
    Response<Worker> getWorker() {
        Worker worker = new Worker();
        worker.setName("姓名");
        worker.setPhoneNumber("16413564156");
        return new Response<Worker>(200, "", worker);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public
    @ResponseBody
    Response<Worker> save(@ModelAttribute Worker worker) {
        workerService.save(worker);
        return new Response<Worker>(ResponseCode.STATUS_OK, "", worker);
    }

}
