package tk.jimmywang.attendanceserver.worker.dao;

import org.springframework.stereotype.Component;
import tk.jimmywang.attendanceserver.base.dao.BaseDao;
import tk.jimmywang.attendanceserver.worker.model.Worker;

/**
 * <i>Created by WangJin on 2014-08-31 20:06.
 *
 * @author WangJin
 * @version 1.0
 */

@Component
public class WorkerDao extends BaseDao {


    public void save(Worker worker) {
        this.saveObject(worker);
    }
}
