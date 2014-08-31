package tk.jimmywang.attendanceserver.worker.model;

import tk.jimmywang.attendanceserver.base.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <i>Created by WangJin on 2014-08-30 23:38.
 *
 * @author WangJin
 * @version 1.0
 */
@Entity
@Table(name = "t_worker")
public class Worker extends BaseModel {

    private String name;
    private String phoneNumber;

    @Column(name = "F_NAME", length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="F_PHONE_NUMBER", length = 11)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
