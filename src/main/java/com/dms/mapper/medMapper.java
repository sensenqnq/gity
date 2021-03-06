package com.dms.mapper;

import com.dms.pojo.category;
import com.dms.pojo.medicine;
import com.dms.pojo.paging;
import com.dms.pojo.user;
import com.dms.utils.Page;

import java.util.List;

public interface medMapper {
    void addMedicine(medicine medicine);
    List<category> findAllCategory();
    List<medicine> findAllMedicine(String keyWord);
    void  deleteMedicineById(int id);
    medicine findMedicineById(int id);
    void updateMedicineById(medicine medicine);
    List<medicine> findAdvanced(medicine medicine);
    List<medicine> findByCount(int type,int count);
    medicine findDetailed(int id);
    String findMedicineMedNo(String medNo);
    void addOrder(medicine medicine);
    List<medicine> findAllOrder(String keyWord);
    medicine findOrderId(int id);
    void modCount(medicine medicine);
    user findUser(user user);
    void deleteOrderById(int id);
}
