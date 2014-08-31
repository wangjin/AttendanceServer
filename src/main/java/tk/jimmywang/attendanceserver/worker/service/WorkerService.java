package tk.jimmywang.attendanceserver.worker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.jimmywang.attendanceserver.worker.dao.WorkerDao;
import tk.jimmywang.attendanceserver.worker.model.Worker;


/**
 * <i>Created by WangJin on 2014-08-31 20:42.
 *
 * @author WangJin
 * @version 1.0
 */

@Component
public class WorkerService {

    @Autowired
    private WorkerDao workerDao;

    @Transactional
    public void save(Worker worker) {
        workerDao.save(worker);
    }
}
